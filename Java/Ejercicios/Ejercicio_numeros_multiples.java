import java.util.Scanner;
public class Ejercicio_numeros_multiples {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime dos números");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println(a + " es multiple de " + b);
        } else if (b % a == 0) {
            System.out.println(b + " es multiple de " + a);
        } else {
            System.out.println(a + " y " + b + " no son multiples el uno del otro");
        }
        scanner.close();
    }
}