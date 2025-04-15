import java.util.Scanner;
public class Ejercicio_math_area_triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aux = 0;
        while (aux == 0) {
            System.out.println("Dime la longitud de los lados de un triángulo (a, b, c) en cm:");

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
    
            if (a + b > c && a + c > b && b + c > a) {
                double p = (a + b + c) / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                area = Math.round(area * 100.0) / 100.0;
    
                System.out.println("El área del triángulo es: " + area + " cm²");
            } else {
                System.out.println("Los lados ingresados no forman un triángulo válido.");
            }
            System.out.println("Si quieres continuar calculando areas escribe '0' a continuación. En caso de querer parar escribe cualquier otro número");
            aux = scanner.nextInt();
        }

        scanner.close();
    }
}
