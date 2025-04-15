import java.util.Random;

class Array {
    
    public int [] createArray(){
        
        int [] array=new int[20];
        
        Random random=new Random();
        
        for (int i=0; i<array.length; i++){
        array[i]=random.nextInt(9)+1;
        }
        return array;  
    }
    
    public int[] calcularSumaVectores(int[] A, int[] B) {
        int[] C = new int[20];

        for (int i = 0; i < 20; i++) {
            C[i] = A[i] + B[i];
        }

        return C;
    }
    
    public void imprimirArrays(){
        System.out.println("Array A:");
    }
}


public class Ejercicio_POO_array2 {
    public static void main(String[] args) {

        Array array=new Array();
        
        int[] arrayA=array.createArray();
        int[] arrayB=array.createArray();
                
        int[] arrayC=array.calcularSumaVectores(arrayA, arrayB);
        
         // Visualizar los tres vectores
        System.out.println("Vector A:");
        mostrarVector(arrayA);

        System.out.println("\nVector B:");
        mostrarVector(arrayB);

        System.out.println("\nVector C (suma de A y B):");
        mostrarVector(arrayC);
    }

    // Método para mostrar un vector en la consola
    public static void mostrarVector(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
