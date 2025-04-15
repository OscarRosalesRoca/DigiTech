import java.util.*;
public class Ejercicio_ArrayList_7 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int numero=random.nextInt(100)+1;
        ArrayList <Integer> miLista=new ArrayList<>(numero);
        for(int i=0; i<numero; i++){
            int numero2=random.nextInt(100)+1;
            miLista.add(numero2);
        }
        System.out.println("La lista contiene estos números:");
        for(int num:miLista){
            System.out.println(num);
        }
        System.out.println("El primer valor de la lista es:");
        System.out.println(miLista.get(0));
        System.out.println("El último valor de la lista es:");
        System.out.println(miLista.get(miLista.size()-1));
        System.out.println("¿Quieres escribir un nuevo número? Escribe si/no");
        String eleccion=scanner.nextLine();
        if (eleccion.equals("si")) {
            System.out.println(" ");
            System.out.println("Escribe su nuevo número:");
            int nuevoValor=scanner.nextInt();
            miLista.add(nuevoValor);
        }
        scanner.close();
    }
}
