import java.util.*;
public class Ejercicio_math_random2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vamos a generar números aleatorios entre los números que digas");
        System.out.println("¿Cual es tu mínimo?");
        int minimo=scanner.nextInt();
        System.out.println("¿Cual es tu máximo");
        int maximo=scanner.nextInt();

        for (int i=1; i<3; i++){
            int random=(int)Math.floor(Math.random()*(maximo-minimo-1)+minimo);
            System.out.println(random);
        }
        scanner.close();
    }
}
