import java.util.*;
public class Ejercicio_math_que_minuto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //El minuto 1 va desde 0 segundos a 59 segundos
        //El minuto 2 va desde 60 segundos a 119 segundos
        //El minuto 90 abarca desde 5340 segundos hasta el 5400 segundos

        String condicion="si";
        while (condicion.equals("si")) {
            System.out.println("Escribe un número de segundos:");
            double segundos=scanner.nextDouble();
            double aux=(segundos/60)+1;
            aux=Math.floor(aux);
            System.out.println("Se encuentra en el minuto: "+aux);
            System.out.println("¿Quiere continuar escribiendo segundos? Escriba 'si' para continuar o 'no' para cancelar");
            scanner.nextLine();
            condicion=scanner.nextLine();
        }

        scanner.close();
    }
}
