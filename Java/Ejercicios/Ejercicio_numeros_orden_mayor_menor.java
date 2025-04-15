import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio_numeros_orden_mayor_menor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int[] numeros=new int[3];

        for (int i=0; i<3; i++){
            System.out.println("Introduce un número:");
            numeros[i]=scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("El orden de mayor a menor es: "+numeros[2]+", "+numeros[1]+" y "+numeros[0]);

        scanner.close();
    }
}
