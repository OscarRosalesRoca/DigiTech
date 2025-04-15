import java.util.*;
public class Ejercicio_ArrayList_3 {
    public static void main(String[] args) {
        ArrayList <String> nombres=new ArrayList<>();
        nombres.add("Sofía");
        nombres.add("Chema");
        nombres.add("Alex");
        nombres.add("Rosa");

        System.out.println(nombres.size());
        if (nombres.contains("Juan")==true) {
            System.out.println("El ArrayList contiene el nombre de Juan");
        } else {
            System.out.println("El ArrayList no contiene el nombre de Juan");
        }


        nombres.remove(nombres.size()-1);

    }
}
