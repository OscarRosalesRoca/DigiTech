class Contador {
    private int cuenta = 0;

    public int getCuenta(){
        return this.cuenta;
    }

	synchronized public int incrementa(){
        this.cuenta++;
        return this.cuenta;
    }
}

class Hilo implements Runnable {
    int numHilo, miParte, miCuenta = 0;
    private final Contador cont;

    public Hilo(int numHilo, int miParte, Contador cont){
        this.numHilo = numHilo;
        this.miParte = miParte;
        this.cont = cont;        
    }


    @Override
    public void run(){
        System.out.println("Hilo " + this.numHilo + " ha iniciado.");
        for(int i = 0; i < this.miParte; i++){
            this.miCuenta++;
            this.cont.incrementa();
        }
        System.out.println("Hilo " + this.numHilo + ": " + this.miCuenta);
    }
}


public class HilosIncrementos {
    public static void main(String[] args) {
        Contador contadorGeneral = new Contador();
        final int INCREMENTOS = 100000;
        final int TOTAL_HILOS = 10;
        Thread[] hilos = new Thread[TOTAL_HILOS];

        for(int i = 0; i < TOTAL_HILOS; i++) {
            Hilo hiloSuelto = new Hilo(i+1, INCREMENTOS / TOTAL_HILOS, contadorGeneral);
            hilos[i] = new Thread(hiloSuelto);
            hilos[i].start();
        }

        for(Thread h: hilos) {
            try {
                h.join();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        System.out.println("\n\t Contador total: " + contadorGeneral.getCuenta());
    }    
}
