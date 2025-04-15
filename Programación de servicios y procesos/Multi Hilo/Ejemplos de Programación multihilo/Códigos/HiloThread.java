class MiHilo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo heredado: " + i);
            try {
                Thread.sleep(500); // Simula cierto tiempo de procesamiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class HiloThread {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        hilo1.start();

        // Puedes crear múltiples instancias de MiHilo y ejecutar en paralelo
        MiHilo hilo2 = new MiHilo();
        hilo2.start();
    }
}
