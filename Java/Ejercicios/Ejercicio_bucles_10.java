import java.util.Scanner;
public class Ejercicio_bucles_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[]arr=new double[10];
        double sumPos=0, sumNeg=0;
        int contadorPos=0, contadorNeg=0, contador0=0;

        for (int i=0; i<arr.length;i++){
            System.out.println("Introduce número");
            arr[i]=scanner.nextDouble();
            if (arr[i]>0) {
                sumPos+=arr[i];
                contadorPos++;
            } else if (arr[i]<0) {
                sumNeg+=arr[i];
                contadorNeg++;
            } else {
                contador0++;
            }
        }

        double mediaPos=sumPos/contadorPos;
        double mediaNeg=sumNeg/contadorNeg;

        System.out.println("La media de los valores positivos es: "+mediaPos);
        System.out.println("La media de los valores negativos es: "+mediaNeg);
        System.out.println("La cantidad de 0 escritos es: "+contador0);

        scanner.close();
    }
    
}
