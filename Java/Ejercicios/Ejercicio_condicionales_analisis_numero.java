import java.util.Scanner;
public class Ejercicio_condicionales_analisis_numero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Se te van a pedir números para combrobar que si son positivos o negativos, si no quieres continuar escribe 0");
        int n=1;
        while (n!=0) {
            System.out.println("Dime un valor");
            n=scanner.nextInt();

            if (n>=1) {
                System.out.println(n+" es un número positivo");
            } 
            if (n<0) {
                System.out.println(n+" es un número negativo");
            }
        }
        scanner.close();
    }
}
