import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Bridge {
    
    private int peopleOnBridge;
    private double actualWeight;
    private final int MAX_PEOPLE = 3;
    private final int MAX_WEIGHT = 200;
    private final Queue<Thread> waitingQueue = new LinkedList<>();

    public Bridge(){
        this.peopleOnBridge = 0;
        this.actualWeight = 0;
    }

    public synchronized void waitForCrossing(Person person) {
        while (peopleOnBridge == MAX_PEOPLE || actualWeight + person.getWeight() > MAX_WEIGHT) {
            try {
                System.out.println("Persona con peso " + person.getWeight() + " kg está esperando para cruzar...");
                waitingQueue.add(Thread.currentThread());
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Ahora puede cruzar, se elimina de la cola de espera
        waitingQueue.remove(Thread.currentThread());
    }

    public synchronized void addPerson(double personWeight) {
        peopleOnBridge++;
        actualWeight += personWeight;
    }

    public synchronized void removePerson(double personWeight) {
        peopleOnBridge--;
        actualWeight -= personWeight;
        notifyAll(); // Notificar a todas las personas en espera que el puente tiene espacio
    }

    synchronized public int getPeopleOnBridge() {
        return peopleOnBridge;
    }

    synchronized public double getActualWeight() {
        return actualWeight;
    }
}


class Person implements Runnable {

    private final int weight;
    private final int passTime;
    private final Bridge bridge;

    public Person(int weight, int passTime, Bridge bridge){
        this.weight = weight;
        this.passTime = passTime;
        this.bridge = bridge;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void run(){
        System.out.println("Acaba de llegar una persona al puente con un peso de " + weight + " kg.");
        bridge.waitForCrossing(this);

        synchronized (bridge) {
            bridge.addPerson(weight);
            System.out.println("Persona con peso " + weight + " kg está cruzando. Tiempo para cruzar: " + passTime);
            System.out.println("Gente en puente: " + bridge.getPeopleOnBridge() + ", Peso actual: " + bridge.getActualWeight() + " kg.");

        }

        try {
            Thread.sleep((long) (passTime * 1000)); // Simular el tiempo de cruce
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        synchronized (bridge) {
            bridge.removePerson(weight);
            System.out.println("Persona con peso " + weight + " kg ha cruzado. Gente en puente: " + bridge.getPeopleOnBridge() +
                    ", Peso actual: " + bridge.getActualWeight() + " kg.");
        }
    }
}


public class BridgeRun {
    public static void main(String[] args) {
        Random rand = new Random();
        Bridge bridge = new Bridge();

        long timeExecution = System.currentTimeMillis() + 4 * 60 * 1000; //3 min

        while (System.currentTimeMillis() < timeExecution){
            int delayGeneration = rand.nextInt(10) + 1;
            try {
                Thread.sleep(delayGeneration * 1000);
                int weightPerson = rand.nextInt(61) + 40;
                int timeToPass = rand.nextInt(41) + 10;

                Thread person = new Thread(new Person(weightPerson, timeToPass, bridge));
                person.start();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


/*

MI VERSIÓN QUE NO FUNCIONA COMO QUIERO:

import java.util.Random;

class Bridge {
    
    private int peopleInBridge;
    private int peopleWaitingToPass;
    private int maxWeight;
    private double actualWeight;

    public Bridge(){
        this.peopleInBridge = 0;
        this.peopleWaitingToPass = 0;
        this.maxWeight = 200;
        this.actualWeight = 0;
    }


    synchronized public int getPeopleInBridge() {
        return peopleInBridge;
    }
    synchronized public void addPeopleInBridge() {
    this.peopleInBridge += 1;
    }
    synchronized public void removePeopleInBridge() {
        this.peopleInBridge -= 1;
    }

    synchronized public int getPeopleWaitingToPass() {
        return peopleWaitingToPass;
    }
    synchronized public void addPeopleWaitingToPass() {
    this.peopleWaitingToPass += 1;
    }
    synchronized public void removePeopleWaitingToPass(int num) {
        this.peopleWaitingToPass = num;
    }


    synchronized public double getMaxWeight() {
        return maxWeight;
    }
    synchronized public void setMaxWeight(int maxWeight) {
    this.maxWeight = maxWeight;
    }


    synchronized public double getActualWeight() {
        return actualWeight;
    }
    synchronized public void setActualWeight(double actualWeight) {
        this.actualWeight = actualWeight;
    }
}



class Person implements Runnable {

    private int weight;
    private double passTime;
    private Bridge bridge;

    public Person(int weight, double passTime, Bridge bridge){
        this.weight = weight;
        this.passTime = passTime;
        this.bridge = bridge;
    }

    @Override
    public void run(){
        System.out.println("Acaba de llegar una persona al puente. Peso: " + weight);
        try {
            synchronized (bridge) {
                while ((bridge.getPeopleInBridge() == 3) || (bridge.getActualWeight() + this.weight > bridge.getMaxWeight())) {
                    System.out.println("Persona esperando para cruzar el puente (peso: " + weight + ")");
                    bridge.addPeopleWaitingToPass(); // Incrementar los que están esperando
                    bridge.wait(); // Esperar
                    bridge.removePeopleWaitingToPass(0); // Decrementar los que están esperando cuando se intenta nuevamente
                }

                // Si las condiciones se cumplen actuamos: 
                bridge.addPeopleInBridge();
                bridge.setActualWeight(bridge.getActualWeight() + this.weight);

                // La persona cruza el puente durante su tiempo de cruce
                System.out.println("Persona cruzando el puente (tiempo de cruce: " + passTime + " segundos)");
                System.out.println("Gente en el puente: " + bridge.getPeopleInBridge());
                System.out.println("Peso actual del puente: " + bridge.getActualWeight());
                Thread.sleep((long) (passTime * 1000)); // Simula el cruce del puente
                System.out.println("Persona ha cruzado el puente");

                // Después de cruzar, la persona sale del puente
                bridge.removePeopleInBridge();
                bridge.setActualWeight(bridge.getActualWeight() - this.weight);

                // Despertar a los que esperan 
                bridge.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



public class Executable {
    public static void main(String[] args) {
        Random rand = new Random();

        //Creamos el puente
        Bridge bridge = new Bridge();

        //Ejecutamos por X tiempo
        long timeExecution = System.currentTimeMillis() + 4 * 60 * 1000; //3 min

        while (System.currentTimeMillis() < timeExecution){
            int delayGeneration = rand.nextInt(10) + 1;
            try {
                Thread.sleep(delayGeneration * 1000);
                int weightPerson = rand.nextInt(61) + 40;
                int timeToPass = rand.nextInt(41) + 10;

                Thread person = new Thread(new Person(weightPerson, timeToPass, bridge));

                person.start();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


 */


