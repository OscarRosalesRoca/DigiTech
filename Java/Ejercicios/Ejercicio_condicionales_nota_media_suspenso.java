import java.util.*;
public class Ejercicio_condicionales_nota_media_suspenso {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] notas=new double[6];
        System.out.println("Qué notas ha sacado el alumno?");
        System.out.println("Mates: ");
        notas[0]=scanner.nextInt();
        System.out.println("Castellano: ");
        notas[1]=scanner.nextInt();
        System.out.println("Física: ");
        notas[2]=scanner.nextInt();
        System.out.println("Química: ");
        notas[3]=scanner.nextInt();
        System.out.println("Música: ");
        notas[4]=scanner.nextInt();
        System.out.println("Inglés: ");
        notas[5]=scanner.nextInt();

        double total=0;

        for(int i=0; i<notas.length; i++){
            total=total+notas[i];
        }

        double media=total/notas.length;

        if (media>=5) {
            System.out.println("El alumno ha aprobado");
            if (media>5 && media<=6.5) {
                System.out.println("Su nota: Bien");
            }
            if (media>6.5 && media<=8.5) {
                System.out.println("Su nota: Notable");
            }
            if (media>8.5) {
                System.out.println("Su nota: Excelente");
            }
        }
        if (media<5) {
            System.out.println("El alumno ha suspendido");
        }
        scanner.close();
    }
}