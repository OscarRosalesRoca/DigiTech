import java.util.Scanner;
public class Ejercicio_bucles_15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un número");
        int n=scanner.nextInt();

        for(int i=1; i<n; i++){
            if (i<2) {
                System.out.println(i+" es un número primo");
            } else if (i==2){
                System.out.println(i+" es un número primo");
            } else if (i>2){
                int aux=2;
                while (aux<i) {
                    if (i%aux==0) {
                        System.out.println(i+" no es un número primo");
                        aux=1+i;
                    } else {
                        aux++;
                    }
                }
                if (aux==i) {
                    System.out.println(i+" es un número primo");
                }
                
            }
        }
        scanner.close();
    }
}

