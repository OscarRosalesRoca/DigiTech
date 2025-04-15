import java.util.*;
public class Ejercicio_matrices_2 {
    public static void main(String[] args) {
        
        //Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
        //aleatorios entre 0 y 10.

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("¿Cuantas columnas quieres que tenga el array?");
        int columnas=scanner.nextInt();

        int[][] array=new int[5][columnas];
        for(int i=0; i<array.length; i++){
            for(int t=0; t<array[i].length; t++){
                array[i][t]=random.nextInt(11);
            }
        }

        scanner.close();
    }
}
