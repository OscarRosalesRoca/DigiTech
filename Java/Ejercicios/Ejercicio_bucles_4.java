import java.util.Scanner;
public class Ejercicio_bucles_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);    
        System.out.println("Escribe un número del 0 al 999, sí escribes un número negativo o mayor que 999 el juego parará: ");
        int n=scanner.nextInt();
        int minimo=0;
        int maximo=999;

        while (n>=minimo && n<=maximo) {
            if (n>=100) {
                System.out.println(n+" tiene tres dígitos");
            } else {
                System.out.println(n+" tiene dos dígitos");
            }
            n=scanner.nextInt();
        }


        scanner.close();
    }
}
