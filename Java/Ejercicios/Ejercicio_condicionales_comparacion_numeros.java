import java.util.Scanner;

public class Ejercicio_condicionales_comparacion_numeros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribre tres números");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if (a>b&&a>c) {
            System.out.println(a+" es el mayor de los tres");
            if (b>c) {
                System.out.println(b+" está entre los otros dos números y "+c+" es el menor de los tres");
            } else {
                System.out.println(c+" está entre los otros dos números y "+b+" es el menor de los tres");
            }
        }
        if (b>a&&b>c) {
            System.out.println(b+" es el mayor de los tres");
            if (a>c) {
                System.out.println(a+" está entre los otros dos números y "+c+" es el menor de los tres");
            } else {
                System.out.println(c+" está entre los otros dos números y "+a+" es el menor de los tres");
            }
        }
        if (c>a&&c>b) {
            System.out.println(c+" es el mayor de los tres");
            if (a>b) {
                System.out.println(a+" está entre los otros dos números y "+b+" es el menor de los tres");
            } else {
                System.out.println(b+" está entre los otros dos números y "+a+" es el menor de los tres");
            }
        }

        scanner.close();
    }
}
