import java.util.Scanner;
public class Ejercicio_string_separar_palabras {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = scanner.nextLine();
        char blank =' ';
        frase += blank;

        int inicio = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                String palabra = frase.substring(inicio, i);
                System.out.println(palabra);
                inicio = i + 1;
            }
        }
        scanner.close();
    }
}
