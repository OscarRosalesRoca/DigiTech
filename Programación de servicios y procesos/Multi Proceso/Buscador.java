import java.io.*;

public class Buscador {
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Faltan argumentos");
            return;
        }
        
        String palabraClave = args[0];
        String rutaArchivo = args[1];

        File archivo = new File(rutaArchivo);
        String nombreArchivo = archivo.getName();
        String nombreResultado = "resultado_" + nombreArchivo;
        int totalOcurrencias = 0;

        StringBuilder lineas = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int numeroLinea = 1;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabraClave)) {
                    totalOcurrencias++;
                    if (lineas.length() > 0) {
                        lineas.append(", ");
                    }
                    lineas.append(numeroLinea);
                }
                numeroLinea++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + nombreArchivo);
            e.printStackTrace();
        }
        
        // Escribir resultados en el archivo de salida
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreResultado))) {
            pw.println(totalOcurrencias);
            pw.println(lineas.toString());
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo de resultados " + nombreResultado);
            e.printStackTrace();
        }
    }
}