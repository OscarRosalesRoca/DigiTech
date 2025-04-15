/*
Para ejecutarlo se lanza desde la línea de comandos:
java LanzadorBuscador.java "palabra clave" "ruta del quijote"
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LanzadorBuscador {
    
    public void lanzarBuscadores(String palabraClave, String rutaCarpeta) {
        File carpeta = new File(rutaCarpeta);
        
        // Verificar si la ruta es una carpeta válida
        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.err.println("La ruta proporcionada no es una carpeta válida.");
            return;
        }
        
        // Filtrar solo archivos de texto
        File[] archivos = carpeta.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String nombre) {
                return nombre.endsWith(".txt");
            }
        });
        
        if (archivos == null || archivos.length == 0) {
            System.out.println("No se encontraron archivos de texto en la carpeta especificada.");
            return;
        }
        
        List<Process> procesos = new ArrayList<>();
        
        // Crear y iniciar un proceso hijo por cada archivo
        for (File archivo : archivos) {
            String nombreArchivo = archivo.getName();
            ProcessBuilder pb = new ProcessBuilder("java","Buscador.java", palabraClave, archivo.getAbsolutePath());
            
            // Establecer el directorio de trabajo (opcional)
            pb.directory(new File("."));
            
            try {
                Process proceso = pb.start();
                procesos.add(proceso);
                System.out.println("Proceso iniciado para: " + nombreArchivo);
            } catch (IOException e) {
                System.err.println("Error al iniciar el proceso para el archivo " + nombreArchivo);
                e.printStackTrace();
            }
        }
        
        // Esperar a que todos los procesos hijos terminen
        for (Process proceso : procesos) {
            try {
                proceso.waitFor();
            } catch (InterruptedException e) {
                System.err.println("Proceso interrumpido.");
                e.printStackTrace();
            }
        }
        
        // Recoger y mostrar los resultados
        System.out.println("\n--- Resumen de Resultados ---\n");
        for (File archivo : archivos) {
            String nombreArchivo = archivo.getName();
            String nombreResultado = "resultado_" + nombreArchivo;
            File archivoResultado = new File(nombreResultado);
            
            if (archivoResultado.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(archivoResultado))) {
                    String linea = br.readLine();
                    int totalOcurrencias = Integer.parseInt(linea);
                    
                    linea = br.readLine();
                    List<Integer> lineas = new ArrayList<>();
                    if (!linea.isEmpty()) {
                        String[] partes = linea.split(",");
                        for (String parte : partes) {
                            lineas.add(Integer.parseInt(parte.trim()));
                        }
                    }
                    
                    // Mostrar resumen para el archivo
                    System.out.println("Archivo: " + nombreArchivo);
                    System.out.println("Total de ocurrencias: " + totalOcurrencias);
                    System.out.println("Líneas: " + lineas);
                    System.out.println();
                    
                } catch (IOException | NumberFormatException e) {
                    System.err.println("Error al leer el archivo de resultados: " + nombreResultado);
                    e.printStackTrace();
                }
            } else {
                // Si no existe el archivo de resultados, asumir que no hubo ocurrencias
                System.out.println("Archivo: " + nombreArchivo);
                System.out.println("Total de ocurrencias: 0");
                System.out.println("Líneas: []");
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Faltan argumentos");
            return;
        }
        
        String palabraClave = args[0];
        String rutaCarpeta = args[1];
        
        LanzadorBuscador lanzador = new LanzadorBuscador();
        lanzador.lanzarBuscadores(palabraClave, rutaCarpeta);
        System.out.println("Ok");
    }
}