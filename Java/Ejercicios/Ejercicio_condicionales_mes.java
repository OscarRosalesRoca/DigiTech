import java.util.Scanner;
public class Ejercicio_condicionales_mes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escriba un número del 1 al 12");
        int mes=scanner.nextInt();

        if (mes==1) {
            System.out.println("Enero");
        }
        if (mes==2) {
            System.out.println("Febrero");
        }
        if (mes==3) {
            System.out.println("Marzo");
        }
        if (mes==4) {
            System.out.println("Abril");
        }
        if (mes==5) {
            System.out.println("Mayo");
        }
        if (mes==6) {
            System.out.println("Junio");
        }
        if (mes==7) {
            System.out.println("Julio");
        }
        if (mes==8) {
            System.out.println("Agosto");
        }
        if (mes==9) {
            System.out.println("Setiembre");
        }
        if (mes==10) {
            System.out.println("Octubre");
        }
        if (mes==11) {
            System.out.println("Noviembre");
        }
        if (mes==12) {
            System.out.println("Diciembre");
        }
        scanner.close();
    }
}
