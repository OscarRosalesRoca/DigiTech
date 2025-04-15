import java.util.Scanner;
public class Ejercicio_bucles_12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un número del 1 al 10");
        int n=scanner.nextInt();
        for (int i=1; i<=10; i++){
            int m=n*i;
            System.out.println(m);
        }
        scanner.close();
    }
}
