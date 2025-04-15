import java.util.*;
public class Ejercicio_ArrayList_5 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros=new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println(numeros.get(0));
        System.out.println(numeros.size());

        int suma=0;
        for(int i=0; i<5; i++){
            suma=suma+numeros.get(i);
        }

        int media=suma/numeros.size();
        System.out.println("La media del ArrayList es de: "+media);

    }
}
