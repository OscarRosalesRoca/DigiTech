import java.util.Scanner;

public class Ejercicio_simbolo_asignacion {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
        double saldo=100.50;
        System.out.println(saldo+" euros");
        saldo+=27.50;
        saldo*=2;
        saldo+=250.38;
        saldo-=55.37;
        saldo+=1200.96;
        System.out.println(saldo+" euros");
        saldo-=85.23;
        System.out.println(saldo+" euros");
        

        scanner.close();
    }
}
