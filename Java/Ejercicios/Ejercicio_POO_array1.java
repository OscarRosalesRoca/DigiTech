import java.util.Random;

class Array {
    
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public void imprimirDerecho(){
        System.out.println("Array del derecho: ");
        for (int elemento:array){
            System.out.print(elemento+" ");
        }
    }
    
    public void imprimirReves(){
        System.out.println("Array del revés: ");
        for (int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }
    }
}

public class Ejercicio_POO_array1 {
        public static void main(String[] args) {
        
    int[] miArray=new int[10];
    
    Random random=new Random();
    for (int i=0; i<miArray.length; i++){
        miArray[i]=random.nextInt(9)+1;
    }
    
    Array arrayObjeto=new Array(miArray);
    
    arrayObjeto.imprimirDerecho();
    System.out.println(" ");
    arrayObjeto.imprimirReves();
    }
}
