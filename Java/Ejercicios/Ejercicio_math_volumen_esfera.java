import java.util.Locale;
import java.util.Scanner;
public class Ejercicio_math_volumen_esfera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int aux = 0;
        while (aux == 0) {
            System.out.println("Dime la longitud (cm) del radio de la esfera que quieras: ");
            double r = scanner.nextDouble();
            double v = (4.0 / 3) * Math.PI * Math.pow(r, 3);

            System.out.println("El volumen de una esfera con radio igual a "+r+"cm es "+v+"cm^3");
            System.out.println("Si quieres continuar calculando volumenes escribe '0' a continuación. En caso de querer parar escribe cualquier otro número");
            aux = scanner.nextInt();
        }
        scanner.close();
    }
}
