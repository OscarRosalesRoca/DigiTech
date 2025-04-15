import java.util.Scanner;
public class Ejercicio_condicionales_numero_mayor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime dos números");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if (a>b) {
            System.out.println("El número: "+a+" es mayor que el número "+b);
            System.out.println("El número: "+b+" es menor que el número "+a);
        } else {
            System.out.println("El número: "+b+" es mayor que el número "+a);
            System.out.println("El número: "+a+" es menor que el número "+b);
        }


        System.out.println("Vuelve a escribir dos números");
        int c=scanner.nextInt();
        int d=scanner.nextInt();

        if (c%2==0) {
            System.out.println(c+" es un número par");
        } else {
            System.out.println(c+" es un número impar");
        }
        if (d%2==0) {
            System.out.println(d+" es un número par");
        } else {
            System.out.println(d+" es un número impar");
        }
    
    scanner.close();
    }
}
