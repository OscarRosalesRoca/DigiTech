import java.util.*;
public class Ejercicio_math_operaciones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x1;
        double x2;
        int a=5;
        int b=7;
        int c=-2;

        double b2=Math.pow(b, 2);
        double raiz=Math.sqrt(b2-4*a*c);
        x1=(-b+raiz)/(2*a);
        System.out.println(x1);
        x2=(-b-raiz)/(2*a);
        System.out.println(x2);

        scanner.close();
    }
}
