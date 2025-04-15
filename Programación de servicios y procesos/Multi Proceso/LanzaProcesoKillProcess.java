import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class LanzaProcesoKillProcess {
    public static int MAX_TIEMPO = 1200;
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder(new String[]{"find", "/", "-name", "\"*\""});
        System.out.printf("Se ejecuta comando: %s\n", Arrays.toString(args));

        pb.inheritIO();
        pb.redirectErrorStream(true);

        try {
            Process p = pb.start();

            if (!p.waitFor(MAX_TIEMPO, TimeUnit.MILLISECONDS)) {
                p.destroy();
                System.out.printf("AVISO: No ha terminado en %d ms\n", MAX_TIEMPO);
            }
        } catch (IOException e) {
            System.out.println("Error durante ejecución. Información detallada");
            System.out.println("--------------------------");
            e.printStackTrace();
            System.out.println("--------------------------");
            System.exit(1);
        } catch (InterruptedException ex){
            System.out.println("Proceso interrumpido");
            System.exit(2);
        }
    }
}
