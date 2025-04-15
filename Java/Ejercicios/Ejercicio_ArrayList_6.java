import java.util.*;
public class Ejercicio_ArrayList_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int aux=1;
        ArrayList <Integer> numeros=new ArrayList<>();
        int variable;
        System.out.println("Escribe números para meter al ArrayList, si quieres parar escribe '-99'");
        while (aux==1) {
            variable=scanner.nextInt();
            numeros.add(variable);
            if (variable==-99) {
                aux=0;
                numeros.remove(numeros.size()-1);
            }
        }

        System.out.println(" ");
        System.out.println("El ArrayList es:");
        int suma=0;
        int media=0;
        for(int numero:numeros){
            System.out.println(numero);
            suma=suma+numero;
        }

        System.out.println(" ");
        System.out.println("La suma de todos los números es: "+suma);
        media=suma/numeros.size();
        System.out.println(" ");
        System.out.println("La media del ArrayList es: "+media);
        System.out.println(" ");

        System.out.println("Los números que están por encima de la media son:");
        for(int numero:numeros){
            if (numero>media) {
                System.out.println(numero);
            }
        }



        scanner.close();
    }
}
