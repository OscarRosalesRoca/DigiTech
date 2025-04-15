public class Ejercicio_bucles_3 {
    public static void main(String[] args) {
        System.out.println("El factorial del número 15 es: ");
        long factorial=1;


//15!=15*14*13*12*11(...)*1

        for (int i=1; i<=15; i++){
            factorial*=i;
        }
        System.out.println(factorial);
        System.out.println("Y el factorial del número 4 es: ");
        int factorial2=1;
        for (int h=1; h<=4; h++){
            factorial2*=h;
        }
        System.out.println(factorial2);
    }

}
