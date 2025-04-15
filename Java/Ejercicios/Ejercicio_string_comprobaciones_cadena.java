import java.util.Scanner;
public class Ejercicio_string_comprobaciones_cadena {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un conjunto de 2-3 palabras");
        String frase=scanner.nextLine();

        int n = frase.length()/2;
        System.out.println("La mitad del conjunto de palabras es:");
        System.out.println(frase.substring(0, n));

        char ultima=frase.charAt(frase.length()-1);
        System.out.println("El último carácter es: "+ultima);

        String inversa="";
        for (int i=frase.length()-1; i>=0; i--) {
            char a=frase.charAt(i);
            inversa+=a;
        }
        System.out.println("Invirtiendo la cadena quedaría como:");
        System.out.println(inversa);

        if (frase.equals(inversa)==true) {
            System.out.println(frase+" se lee igual de izquierda a derecha que de derecha a izquierda");
        } else {
            System.out.println(frase+" no se lee de igual manera de izquierda a derecha que de derecha a izquierda");
        }

        String guion="";
        for (int i=0; i<=frase.length()-1; i++){
            char b=frase.charAt(i);
            guion+=b+"-";
        }
        System.out.println(guion);

        int vocales=0;
        for (int i=0; i <= frase.length() - 1; i++){
            char c=frase.charAt(i);
            c = Character.toLowerCase(c);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                vocales++;
            }
        }
        System.out.println("En "+frase+" hay "+vocales+" vocales");

        scanner.close();
    }
}
