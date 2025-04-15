import java.util.*;
public class Ejercicio_matrices_3 {
    public static void main(String[] args) {
        
        //Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
        //matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices
        //originales y el resultado.

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        //Recogemos los valores para las filas y columnas de nuestros dos arrays
        System.out.println("Vamos a recoger los datos para la primera array");
        System.out.println("¿Cuantas filas quieres que tengan los arrays?");
        int filas=scanner.nextInt();
        System.out.println("¿Y columnas?");
        int columnas=scanner.nextInt();

        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println(" ");

        //Creamos los dos arrays
        int[][] array1=new int[filas][columnas];
        int[][] array2=new int[filas][columnas];
        int[][] array3=new int[filas][columnas];

        //Llenamos el array1 y el array2
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                array1[i][j]=random.nextInt(11);
                array2[i][j]=random.nextInt(11);
            }
        }

        //Imprimimos el array1 y el array2
        System.out.println("Array 1:");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------------");
        System.out.println(" ");
        System.out.println("Array 2:");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println(" ");
        }

        //Sumamos el array 1 con el array 2 y lo guardamos en el array 3. Además lo imprimimos
        System.out.println("-------------------------------");
        System.out.println(" ");
        System.out.println("Array 3:");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                array3[i][j]=array1[i][j]+array2[i][j];
                System.out.print(array3[i][j]+"\t");
            }
            System.out.println(" ");
        }
        
        scanner.close();
    }
}
