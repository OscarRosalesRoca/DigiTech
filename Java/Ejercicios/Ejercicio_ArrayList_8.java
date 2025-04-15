import java.util.*;
public class Ejercicio_ArrayList_8 {
    public static void main(String[] args) {
        ArrayList <String> asignaturas=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        asignaturas.add("Mates");
        asignaturas.add("Catalán");
        asignaturas.add("Castellano");
        asignaturas.add("Historia");
        asignaturas.add("Física");
        asignaturas.add("Química");

        System.out.println("La lista de asignaturas es:");
        for(String asignatura:asignaturas){
            System.out.println(asignatura);
        }

        int aux=0;
        System.out.println(" ");
        System.out.println("Operaciones que puedes hacer:");
        System.out.println("1. Agregar asignaturas");
        System.out.println("2. Buscar asignatura");

        while (aux==0) {
            System.out.println(" ");
            System.out.println("Para escoger escribe el número de la operación");
            int eleccion=0;
            eleccion=scanner.nextInt();
            scanner.nextLine();
            if (eleccion==1) {
                System.out.println(" ");
                System.out.println("Agrege una nueva asignatura:");
                String nuevaAsignatura=scanner.nextLine();
                asignaturas.add(nuevaAsignatura);
                int aux2=0;
                while (aux2==0) {
                    System.out.println(" ");
                    System.out.println("¿Quiere añadir más? Escribe si/no");
                    String decision=scanner.nextLine();
                    if (decision.equals("si")) {
                        
                    }
                    if (decision.equals("no")) {
                        aux2=1;
                    }
                }
            }
            if (eleccion==2) {
                System.out.println(" ");
                System.out.println("La lista de asignaturas es:");
                for(String asignatura:asignaturas){
                    System.out.println(asignatura);
                }
            }
            System.out.println(" ");
            System.out.println("¿Quiere hacer otra operación? Escribe si/no");
            String eleccionDe=scanner.nextLine();
            if (eleccionDe.equals("si")) {
                System.out.println(" ");
                System.out.println("Operaciones que puedes hacer:");
                System.out.println("1. Agregar asignaturas");
                System.out.println("2. Buscar asignatura");
            }
            if (eleccionDe.equals("no")) {
                aux=1;
            }
        }
        scanner.close();
    }
}
