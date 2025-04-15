import java.io.File;

public class LanzadorSumador {
    public void lanzarSumador(Integer n1, Integer n2, File archivo) {
        String clase = System.getProperty("user.dir") + "\\PruebaSumador.java";
        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString());
            pb.inheritIO();
            pb.redirectOutput(archivo);
            Process process = pb.start();
            int codigoSalida = process.waitFor();
            System.out.println("El proceso terminó con el código: "+codigoSalida);
        } catch (Exception e) {
            System.out.println("\nERROR en lanzarSumador:\n");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LanzadorSumador l = new LanzadorSumador();
        l.lanzarSumador(2, 5, new File("resultado1.txt"));
        l.lanzarSumador(6, 10, new File("resultado2.txt"));
        System.out.println("\n\nOk");
    }
}