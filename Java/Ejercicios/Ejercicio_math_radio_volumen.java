import java.util.Scanner;
public class Ejercicio_math_radio_volumen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime el radio (en cm) de un círculo");
        Double r=scanner.nextDouble();
        Double pi=Math.PI;
        double r2=Math.pow(r, 2);
        double a=pi*r2;
        double area=Math.ceil(a);

        System.out.println("El area de un circulo con el radio de "+r+"cm es "+area+"cm");
        scanner.close();
    }
}
