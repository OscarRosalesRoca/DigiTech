import java.util.Scanner;
public class Ejercicio_bucles_13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[]notas=new double[6];
        int contadorAprobado=0, contadorCondicionado=0, contadorSuspendido=0;

        for(int i=0; i<6; i++){
            System.out.println("Dime la nota de un alumno");
            notas[i]=scanner.nextDouble();
            if (notas[i]>4) {
                contadorAprobado++;
            } else if (notas[i]==4){
                contadorCondicionado++;
            } else if (notas[i]<4){
                contadorSuspendido++;
            }
        }

        System.out.println("La cantidad de alumnos aprovados es: "+contadorAprobado);
        System.out.println("La cantidad de alumnos condicionados es: "+contadorCondicionado);
        System.out.println("La cantidad de alumnos suspendidos es: "+contadorSuspendido);

        scanner.close();
    }
}
