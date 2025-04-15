import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        boolean seguir = false;

        List<String> arrayNombres = new ArrayList<>();
        List<Integer> arrayEdades = new ArrayList<>();
        do {

            seguir = false;
            System.out.print("Dime el nombre de la persona: ");
            String nombre = scanner.nextLine();
            arrayNombres.add(nombre);
            System.out.print("Y la edad de dicah persona: ");
            int edad = scanner.nextInt();
            arrayEdades.add(edad);
            scanner.nextLine();

            System.out.println("\n¿Quieres añadir otra persona? (si/no)");
            String opcion = scanner.nextLine().toLowerCase();
            opcion = Normalizer.normalize(opcion, Normalizer.Form.NFD);
            opcion = opcion.replaceAll("\\p{M}", ""); // Quita los acentos
            if (opcion.equals("si")) {
                seguir = true;
            }
        } while (seguir);

        ArrayList<Persona> personas = new ArrayList<>();
        for (int i = 0; i < arrayNombres.size(); i++) {
            personas.add(new Persona(arrayNombres.get(i), arrayEdades.get(i)));
        }

        System.out.println("Dime la ruta donde vamos a guardar toda esta información: ");
        String ruta = scanner.nextLine();
        //ruta: resources/datos.txt

        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).escribirDatos(ruta);
        }

        File file = new File(ruta);
        try (Scanner entrada = new Scanner(file)) {
            while (entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }

        scanner.close();
    }
}