import java.util.Scanner;
public class Ejercicio_condicionales_notas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime el número de la nota del 0 al 10");
        int n=scanner.nextInt();
        if (n<5) {
            System.out.println("Insuficiente");
        }
        if (n==5||n==6) {
            System.out.println("Bien");
        }
        if (n==7||n==8) {
            System.out.println("Notable");
        }
        if (n==9||n==10) {
            System.out.println("Excelente");
        }
        scanner.close();
    }
}
