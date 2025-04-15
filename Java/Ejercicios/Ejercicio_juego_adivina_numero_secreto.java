import java.util.Random;
import java.util.Scanner;
public class Ejercicio_juego_adivina_numero_secreto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rand=new Random();
        int randomNum=rand.nextInt(10)+1;

        System.out.println("Tienes que adivinar un número secreto del 1 al 10 ¡Intentalo!");
        int n=scanner.nextInt();
        if (n==randomNum) {
            System.out.println("¡Enorabuena! Has acertado");
        } else {
            System.out.println("Vaya... Has fallado. Vuelve a probar");
            int a=scanner.nextInt();
            while (a!=randomNum) {
                if (a<randomNum) {
                    System.out.println("Mayor");
                } else {
                    System.out.println("Menor");
                }
                System.out.println("¡Prubea otra vez!");
                a=scanner.nextInt();
            }
            System.out.println("¡Enorabuena! Has acertado");
        }
        scanner.close();
    }
}
