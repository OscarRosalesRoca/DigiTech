import java.util.Scanner;
public class Ejercicio_bucles_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un número positivo");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
        scanner.close();
    }
}
