public class Ejercicio_ArrayList_13 {
    public static void main(String[] args) {
        int[] array1=new int[57];
        System.out.println("Array:");
        for(int i=0; i<array1.length; i++){
            array1[i]=i+1;
            System.out.println(array1[i]);
        }

        System.out.println("\nLos números pares del array son: ");
        for(int x=0; x<array1.length; x++){
            if (array1[x]%2==0) {
                System.out.println(array1[x]);
            }
        }

        System.out.println("\nLos números impares del array son: ");
        for(int t=0; t<array1.length; t++){
            if (array1[t]%2!=0) {
                System.out.println(array1[t]);
            }
        }
    }
}
