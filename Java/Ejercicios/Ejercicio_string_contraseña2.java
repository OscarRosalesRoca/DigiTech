import java.util.Scanner;

public class Ejercicio_string_contraseña2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int correcto = 0;

        while (correcto != 3) {
            System.out.println("Escribe una dirección de correo electrónico:");
            String direccion=scanner.nextLine();
            correcto=0;
            if (direccion.indexOf('@')==-1) {
                System.out.println("Le falta añadir un @");
            } else {
                correcto++;
            }
    
            if (direccion.length()<20) {
                System.out.println("La dirección es demasiado pequeña, tiene que ser mínimo de 20 carácteres");
            } else {
                correcto++;
            }
    
            if (direccion.equals(direccion.toLowerCase())==false) {
                System.out.println("Su dirección tiene que ser en minúsculas");
            } else {
                correcto++;
            }
        }

        if (correcto==3) {
            System.out.println("Contraseña aceptada");
        }

        scanner.close();
    }
}
