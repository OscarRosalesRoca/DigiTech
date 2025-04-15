import  java.util.Scanner;
public class Ejercicio_bucles_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        int total=0;
        int i=0;
        double media;
        System.out.println("Ves diciendo números, cuando quieras parar pon un número negativo");
        do {
            n=scanner.nextInt();
            if (n>0) {
                total+=n;
            }
            if (n!=0&&n>0) {
                i++;
            }
        } while(n>=0);
        media=total/i;
        System.out.println("La media entre todos los números es "+media);
        scanner.close();
    }
    
}
