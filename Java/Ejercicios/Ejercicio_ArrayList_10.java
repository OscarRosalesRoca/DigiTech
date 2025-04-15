import java.util.*;
public class Ejercicio_ArrayList_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cuantos números de celdas quieres que tenga el array?");
        int cantidad=scanner.nextInt();

        int[] array1=new int[cantidad];

        if (cantidad==10) {
            for(int i=0; i<array1.length; i++){
                array1[i]=i;
            }
        } else {
            System.out.println("prueba");
            for(int t=0; t<array1.length; t++){
                array1[t]=t+1;
            }
        }

        System.out.println(" ");
        System.out.println("Bucle for");
        for(int x=0; x<array1.length; x++){
        System.out.println(array1[x]);
        }

        System.out.println(" ");
        System.out.println("Bucle while");
        int aux=0;
        while (aux<array1.length) {
            System.out.println(array1[aux]);
            aux++;
        }

        System.out.println(" ");
        System.out.println("_____");
        for(int r=0; r<array1.length; r++){
            if (array1[r]<10) {
                System.out.println("| "+array1[r]+" |");
                System.out.println("|---|");
            } else if (array1[r]>=10 && array1[r]<100) {
                System.out.println("| "+array1[r]+"|");
                System.out.println("|---|");
            } else {
                System.out.println("|"+array1[r]+"|");
                System.out.println("|---|");
            }
        }

//  _____
//  | 3 |
//  |---|

        scanner.close();
    }
}
