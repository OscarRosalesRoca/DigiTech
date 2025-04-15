import java.util.*;
public class Ejercicio_ArrayList_12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cuántos números quieres tener en el array?");
        int cantidad1 = scanner.nextInt();
        int[] array1 = new int[cantidad1];
        int n = 0;
        System.out.println("Escribe los números para añadirlos al array núm.1:");
        while (n < cantidad1) {
            array1[n]=scanner.nextInt();
            n++;
        }

        System.out.println("\nCuantos números quieres en el array núm.2?");
        int cantidad2=scanner.nextInt();
        System.out.println("\nArray núm.2:");

        int[] array2=new int[cantidad2];
        for(int i=0; i<cantidad2; i++){
            array2[i]=i+1;
            System.out.println(array2[i]);
        }

        System.out.println("\n--------------------");

        System.out.println("La suma de los dos arrays queda tal que así...");
        System.out.println("Array núm3:");
        int[] array3 = new int[cantidad1+cantidad2];

        for(int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }

        int aux = 0;
        for(int i = array1.length; i < array3.length; i++){
            array3[i] = array2[aux];
            aux++;
        }

        for(int i=0; i<array3.length; i++){
            System.out.println(array3[i]);
        }


        scanner.close();
    }
}
