import java.util.Scanner;
public class Ejercicio_string_contraseña {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int aux=0;

        while (aux<3) {
            System.out.println("Ingrese una contraseña:");
            String contraseña=teclado.nextLine();

            if (contraseña.length()>25) {
                System.out.println("La contraseña: "+contraseña+" es demasiado larga. Prueba con una por debajo de los 25 carácteres");
            } else {
                aux+=1;
            }
    
            if (contraseña.matches(".*[@.,$&#/].*")) {
                System.out.println(contraseña+" contiene carácteres especiales");
            } else {
                aux+=1;
            }
            
            char primera=contraseña.charAt(0);
            char ultima=contraseña.charAt(contraseña.length()-1);
    
            if (Character.isUpperCase(primera)&&Character.isUpperCase(ultima)) {
                aux+=1;
            } else {
                System.out.println("La primera y última letra tienen que ser en mayúsculas");
            } 
            
            if (aux<3) {
                aux=0;
            }
        }
        System.out.println("Contraseña válida.");
        teclado.close();
    }
}
