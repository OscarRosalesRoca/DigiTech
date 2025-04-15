package HiloBasico;

class Hilo implements Runnable {
    private String nombre;

    public Hilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run(){
        System.out.println("Hola soy el hilo " + this.nombre + " y estoy iniciando.");
        System.out.println("Soy el hilo " + this.nombre + " y termino mi ejecución");
    }
}

public class HiloBasico {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("Hilo 1");
        Thread th1 = new Thread(hilo1);

        Hilo hilo2 = new Hilo("Hilo 2");
        Thread th2 = new Thread(hilo2);

        th1.start();
        th2.start();

        try {
            //El .join() hace que el programa principal espere a los dos hilos
            th1.join();
            th2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Programa principal terminado.");
    }
}
