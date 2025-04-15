import java.util.*;
public class Ejercicio_ArrayList_9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList <Integer> lista1=new ArrayList<>();
        int[] lista2=new int[5];

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        int suma2=0;
        for(int i=0; i<5; i++){
            lista2[i]=i+1;
            suma2=suma2+i+1;
        }

        int suma1=0;
        int max=0;
        for(int numero:lista1){
            suma1=suma1+numero;
            if (numero>max) {
                max=numero;
            }
        }

        System.out.println("La suma del ArrayList es: "+suma1);
        System.out.println("La suma del Array es: "+suma2);

        int maximoValor=Collections.max(lista1);
        System.out.println("El número más grande del ArrayList es: "+maximoValor);
        System.out.println("El número más grande del Array es: "+max);

        System.out.println("¿Quieres añadir un número? Escribe si/no");
        String eleccion=scanner.nextLine();
        if (eleccion.equals("si")) {
            System.out.println("¿Array o ArrayList? Escribe array/array list");
            String eleccion2=scanner.nextLine();
            if (eleccion2.equals("array")) {
                System.out.println("Escribe el nuevo número");
                int nuevoValor1=scanner.nextInt();
                int[] nuevoArray = new int[lista2.length + 1];
                System.arraycopy(lista2, 0, nuevoArray, 0, lista2.length);
                nuevoArray[lista2.length] = nuevoValor1;
            }
            if (eleccion2.equals("array list")) {
                System.out.println("Escribe el nuevo número");
                int nuevoNumero2=scanner.nextInt();
                lista1.add(nuevoNumero2);
            }
        }
        scanner.close();
    }
}
