import java.util.Scanner;
public class Ejercicio_bucles_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa un número para ver si es un número primo");
        int val = scanner.nextInt();

        int aux;
        while (val!=0) {
            if (val>0) {
                if (val<2) {
                    System.out.println("El número " + val + " es un número primo");
                } else {
                aux=2;
                while (aux<val) {
                    if (val % aux == 0) {
                        System.out.println("El número " + val + " no es un número primo");
                        aux=val+1;
                    } else {
                        aux+=1;
                    }
                }
                if (aux==val) {
                    System.out.println("El número " + val + " es un número primo");
                    }
                }
            }
            System.out.println("Ingresa otro número, si quieres parar escribe 0");
            val=scanner.nextInt();
        }

        
        scanner.close();

    }
}
