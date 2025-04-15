import java.util.*;
public class Ejercicio_ArrayList_1 {
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<>();

        nombres.add("Óscar");
        nombres.add("María");
        nombres.add("Alberto");
        nombres.add("Mariana");

        for (String nombre:nombres){
            System.out.println(nombre);
        }
    }
}
