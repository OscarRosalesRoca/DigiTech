import  java.util.Scanner;
public class Ejercicio_bucles_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=1;
        int total=0;
        System.out.println("Ves diciendo números, cuando quieras parar pon un 0");
        while (n!=0) {
            n=scanner.nextInt();
            total=total+n;
        }
        System.out.println("La suma entre todos los números es "+total);
        scanner.close();
    }
    
}
