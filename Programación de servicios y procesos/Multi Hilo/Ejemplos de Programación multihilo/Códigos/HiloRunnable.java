class MiRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo con Runnable: " + i);
            try {
                Thread.sleep(500); // Simula cierto tiempo de procesamiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class HiloRunnable {
    public static void main(String[] args) {
        MiRunnable miRunnable = new MiRunnable();
        Thread hilo1 = new Thread(miRunnable);
        hilo1.start();

        // Puedes crear múltiples instancias de MiRunnable y ejecutar en paralelo
        Thread hilo2 = new Thread(miRunnable);
        hilo2.start();
    }
}
