import java.util.Scanner;

public class Ejercicio_conversion_euro_libra {
    
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cantidad de euros");
        double importeEuros = scanner.nextDouble();

        double diferencia = 0.86;
        double libra;

        libra = importeEuros*diferencia;

        System.out.println(importeEuros + " euros en libras equivale a: " + libra + ".");

        scanner.close();
    }
}
