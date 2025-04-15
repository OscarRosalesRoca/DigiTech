import java.util.Scanner;
public class Ejercicio_bucles_11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[]altura=new double[5];
        int[]edad=new int[5];
        double sumAltura=0;
        int sumEdad=0, contadorOver18=0, contadorOver175=0;

        for (int i=0; i<5; i++){
            System.out.println("Introduce la edad del alumno");
            edad[i]=scanner.nextInt();
            System.out.println("Introduce la altura del alumno (en cm)");
            altura[i]=scanner.nextDouble();
            sumAltura+=altura[i];
            sumEdad+=edad[i];

            if (edad[i]>18) {
                contadorOver18++;
            }
            if (altura[i]>175) {
                contadorOver175++;
            }
        }

        double mediaEdad=sumEdad/5;
        double mediaAltura=sumAltura/5;

        System.out.println("La edad media de los alumnos es: "+mediaEdad);
        System.out.println("La altura media de los alumnos es: "+mediaAltura);
        System.out.println("La cantidad de alumnos por encima de los 18 es: "+contadorOver18);
        System.out.println("La cantidad de alumnos por encima de los 175cm es :"+contadorOver175);
        scanner.close();
    }
}
