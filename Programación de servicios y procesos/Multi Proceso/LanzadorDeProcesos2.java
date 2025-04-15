import java.util.*;
import java.io.IOException;

public class LanzadorDeProcesos2 {
    public static void main(String[] args) {
        
        if (args.length<=0) {
            System.out.println("Debe indicarse comando a ejecutar.");
            System.exit(1);
        }

        ProcessBuilder pb = new ProcessBuilder(args);
        pb.inheritIO();

        try {
            Process p = pb.start();
            int codRet = p.waitFor();
            System.out.println("La ejecución de " + Arrays.toString(args) +
            " devuelve " + codRet + " " + (codRet == 0 ? ("ejecución correcta") : ("ERROR")));
        } catch (IOException e) {
            System.out.println("Error durante ejecución del proceso");
            System.out.println("Información detallada");
            System.out.println("---------------------");
            e.printStackTrace();
            System.out.println("---------------------");
            System.exit(2);
        } catch (InterruptedException e){
            System.out.println("Proceso interrumpido");
            System.exit(3);
        }
    }
}
