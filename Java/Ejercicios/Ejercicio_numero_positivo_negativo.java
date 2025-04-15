import java.util.Scanner;
public class Ejercicio_numero_positivo_negativo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un número");
        int n=scanner.nextInt();

        if (n<0) {
            System.out.println(n+" es un número negativo");
        } else {
            System.out.println(n+" es un número positivo");
        }
    
        scanner.close();
    }
}
