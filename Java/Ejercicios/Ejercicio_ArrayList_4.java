import java.util.*;
public class Ejercicio_ArrayList_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList <String> animales=new ArrayList<>();
        String escrito="false";

        System.out.println("Escribe nombres de animales hasta que te canses, en ese caso escribe salir.");

        while (!escrito.equals("salir")){
            escrito=scanner.nextLine();
            animales.add(escrito);
        }

        animales.remove(animales.size()-1);
        for(String nombres:animales){
            System.out.println(nombres);
        }
        System.out.println("La longitud del ArrayList es: "+animales.size());

        scanner.close();
    }
}
