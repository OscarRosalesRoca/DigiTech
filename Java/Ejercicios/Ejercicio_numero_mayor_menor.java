import java.util.Scanner;
public class Ejercicio_numero_mayor_menor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime dos números");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if (a>b) {
            System.out.println(a+" es más grande que "+b);
        }
        if (b>a) {
            System.out.println(b+" es más grande que "+a);
        }
        if (a==b) {
            System.out.println("Ambos números son iguales");
        }
        scanner.close();
    }
}
