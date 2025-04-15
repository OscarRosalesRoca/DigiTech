import java.util.Scanner;

public class Ejercicio_scanner {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Introduce tu apellido");
        String apellido = scanner.nextLine();

        System.out.println("Buenos días " + nombre + " " + apellido + ".");
        
        scanner.close();
    }
}