import java.util.Scanner;
public class Ejercicio_condicionales_dia_semana {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escriba un número del 1 al 7");
        int dia=scanner.nextInt();

        if (dia==1) {
            System.out.println("Lunes");
        }
        if (dia==2) {
            System.out.println("Martes");
        }
        if (dia==3) {
            System.out.println("Miércoles");
        }
        if (dia==4) {
            System.out.println("Jueves");
        }
        if (dia==5) {
            System.out.println("Viernes");
        }
        if (dia==6) {
            System.out.println("Sábado");
        }
        if (dia==7) {
            System.out.println("Domingo");
        }
        scanner.close();
    }
}
