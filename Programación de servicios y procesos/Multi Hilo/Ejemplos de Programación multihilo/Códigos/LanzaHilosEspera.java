
import java.util.Random;

public class LanzaHilosEspera {
    public static void main(String[] args) {
        Hilo h1 = new Hilo("Hilo 1");
        Hilo h2 = new Hilo("Hilo 2");
        Thread th1 = new Thread(h1);
        Thread th2 = new Thread(h2);
        th1.setName("Thread 1");
        th2.setName("Thread 2");

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Programa principal terminado.");
    }    
}

class Hilo implements Runnable {
    private String nombre;

    @Override
    public void run() {
        Random aleatorio = new Random();
        System.out.printf("Hola soy el hilo %s\n", this.nombre);
        System.out.printf("Hola soy el Thread %s\n", Thread.currentThread().getName());
        for(int i = 0; i < 5; i++) {
            int pausa = aleatorio.nextInt(10,500);
            System.out.printf("Hilo %s pausado durante %d", this.nombre, pausa);
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrumpido " + e.getMessage());
            }
        }
        System.out.printf("Terminado el hilo %s\n", this.nombre);
    }

    public Hilo(String nombre) {
        this.nombre = nombre;
    }
}
