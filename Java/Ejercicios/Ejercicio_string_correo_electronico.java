import java.util.Scanner;
public class Ejercicio_string_correo_electronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            System.out.println("Escribe una dirección de correo electrónico:");
            String direccion = scanner.nextLine();

            int posArroba = direccion.indexOf('@');
            int posPunto = direccion.lastIndexOf('.');

            if (posArroba == -1) {
                System.out.println("Falta el carácter '@'");
                continue;
            }

            if (posPunto == -1) {
                System.out.println("Falta el carácter '.'");
                continue;
            }

            if (posArroba > posPunto) {
                System.out.println("El '@' debe estar antes que el '.'");
                continue;
            }

            if (posArroba + 1 >= direccion.length() || !Character.isLetter(direccion.charAt(posArroba + 1))) {
                System.out.println("Debe haber una letra justo después del '@'");
                continue;
            }

            if (posPunto + 1 >= direccion.length() || !Character.isLetter(direccion.charAt(posPunto + 1))) {
                System.out.println("Debe haber una letra justo después del '.'");
                continue;
            }
            valido = true;
        }

        System.out.println("Dirección de correo electrónico válida.");
        scanner.close();
    }
}
