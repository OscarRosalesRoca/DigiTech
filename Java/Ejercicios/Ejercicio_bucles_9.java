import java.util.Scanner;
public class Ejercicio_bucles_9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un número");
        int n=scanner.nextInt();
        int t=1;
        for (int i=1; i<=n; i++){
            t=t*i;
        }
        System.out.println("El factorial de "+n+" es "+t);
        scanner.close();
    }
}
