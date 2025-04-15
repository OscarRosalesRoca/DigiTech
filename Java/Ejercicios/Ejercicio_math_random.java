import java.util.*;
public class Ejercicio_math_random {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cuantos números aleatorios quieres tener?");
        int cantidad=scanner.nextInt();

        for (int i=0; i<cantidad; i++) {
            double random=Math.random();
            random=random*10;
            double ran=Math.ceil(random);
            System.out.println(ran);
        }

        scanner.close();
    }
}
