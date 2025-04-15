public class Ejercicio_bucles_2 {
    public static void main(String[] args) {
        int n=10, n1=0, n2=1;
        System.out.println("Los 10 primeros números de la serie de fibonnaci son:");

        for (int i=1; i<n; i++){
        System.out.println(n1);
        int sum=n1+n2;
        n1=n2;
        n2=sum;
        }

    }    
}
