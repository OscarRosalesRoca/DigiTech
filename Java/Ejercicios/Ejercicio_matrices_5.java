import java.util.*;
public class Ejercicio_matrices_5 {
    public static void main(String[] args) {
        Random random=new Random();

        int aleatorio=-1;
        int contadorArray=0;
        int[][] array=new int[3][3];
        int[] arrayRandom=new int[9];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j]=random.nextInt(101);
                if (array[i][j]==aleatorio) {
                    while (array[i][j]==aleatorio) {
                        array[i][j]=random.nextInt(101);
                    }
                }
                while (contadorArray<arrayRandom.length) {
                    arrayRandom[contadorArray]=array[i][j];
                    contadorArray+=10;
                }
                contadorArray-=10;
                contadorArray++;
            }
        }

        System.out.println("Array 3x3:");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Array random:");

        for(int i=0; i<arrayRandom.length; i++){
            System.out.print(arrayRandom[i]+"\t");
        }

    }
}
