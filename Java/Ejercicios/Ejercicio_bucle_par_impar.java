import java.util.Scanner;
public class Ejercicio_bucle_par_impar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Se te van a pedir números para combrobar que si son par o impar, si no quieres continuar escribe 0");
        int n=1;
        while (n!=0) {
            System.out.println("Dime un valor");
            n=scanner.nextInt();

            if (n%2==0) {
                System.out.println(n+" es un número par");
            } else {
                System.out.println(n+" es un número impar");
            }
        }
        scanner.close();
    }
}
