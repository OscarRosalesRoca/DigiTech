import java.util.*;
public class Ejercicio_ArrayList_menu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //1. Agregar nombres
        //2. Modificar nombre
        //3. Borrar nombres
        //4. Visualizar un nombre
        //5. Visualizar todos los nombres
        //6. Salir

        System.out.println("Bienvenido al menú.");
        System.out.println("Para navegar por él, escribe el número del apartado del menú al que quieras ir.");
        System.out.println(" ");
        System.out.println("1. Agregar nombres");
        System.out.println("2. Modificar nombre");
        System.out.println("3. Borrar nombres");
        System.out.println("4. Visualizar un nombre");
        System.out.println("5. Visualizar todos los nombres");
        System.out.println("6. Salir");
        System.out.println(" ");

        int menu=0;
        ArrayList <String> nombres=new ArrayList<>();

        while (menu!=6) {
            System.out.println("¿Qué acción quieres hacer?");
            menu=scanner.nextInt();
            if (menu==1) {
                System.out.println(" ");
                System.out.println("¿Cuántos nombres quieres agregar?");
                int cantidad=scanner.nextInt();
                scanner.nextLine();

                for(int i=0; i<cantidad; i++){
                    System.out.println("Escribe el nombre "+(i+1)+":");
                    String nombre=scanner.nextLine();
                    nombres.add(nombre);
                }
                System.out.println(" ");
                System.out.println("Los nombres en la lista son:");
                for (String nombreAux1 : nombres) {
                    System.out.println(nombreAux1);
                }
        

                System.out.println(" ");
                System.out.println("¿Cómo desea continuar?");
                System.out.println(" ");
                System.out.println("6. Salir");
                System.out.println("7. Back to menu");
                menu=scanner.nextInt();
                if (menu==7) {
                    System.out.println(" ");
                    System.out.println("Menú:");
                    System.out.println("1. Agregar nombres");
                    System.out.println("2. Modificar nombre");
                    System.out.println("3. Borrar nombres");
                    System.out.println("4. Visualizar un nombre");
                    System.out.println("5. Visualizar todos los nombres");
                    System.out.println("6. Salir");
                    System.out.println(" ");
                }
                if (menu==6) {
                    scanner.nextLine();
                    System.out.println(" ");
                    System.out.println("¿Estás seguro? Escribe si/no");
                    String decision=scanner.nextLine();
                    if (decision.equals("si")) {
                        
                    }
                    if (decision.equals("no")) {
                        menu=7;
                        System.out.println(" ");
                        System.out.println("Menú:");
                        System.out.println("1. Agregar nombres");
                        System.out.println("2. Modificar nombre");
                        System.out.println("3. Borrar nombres");
                        System.out.println("4. Visualizar un nombre");
                        System.out.println("5. Visualizar todos los nombres");
                        System.out.println("6. Salir");
                        System.out.println(" ");
                    }
                }
            }
            if (menu==2) {
                System.out.println(" ");
                System.out.println("Los nombres en la lista son:");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println((i+1)+": "+nombres.get(i));
                }
                System.out.println(" ");
                System.out.println("¿Qué nombre quiere modificar (escoge la posición)?");
                int eleccion=scanner.nextInt();
                scanner.nextLine();
                System.out.println(" ");
                System.out.println("Escriba el nuevo nombre:");
                String nuevoNombre=scanner.nextLine();
                nombres.set((eleccion-1), nuevoNombre);

                System.out.println(" ");
                System.out.println("Los nombres en la nueva lista son:");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println((i+1)+": "+nombres.get(i));
                }

                System.out.println(" ");
                System.out.println("¿Cómo desea continuar?");
                System.out.println(" ");
                System.out.println("6. Salir");
                System.out.println("7. Back to menu");
                menu=scanner.nextInt();
                if (menu==7) {
                    System.out.println(" ");
                    System.out.println("Menú:");
                    System.out.println("1. Agregar nombres");
                    System.out.println("2. Modificar nombre");
                    System.out.println("3. Borrar nombres");
                    System.out.println("4. Visualizar un nombre");
                    System.out.println("5. Visualizar todos los nombres");
                    System.out.println("6. Salir");
                    System.out.println(" ");
                }
                if (menu==6) {
                    scanner.nextLine();
                    System.out.println(" ");
                    System.out.println("¿Estás seguro? Escribe si/no");
                    String decision=scanner.nextLine();
                    if (decision.equals("si")) {
                        
                    }
                    if (decision.equals("no")) {
                        menu=7;
                        System.out.println(" ");
                        System.out.println("Menú:");
                        System.out.println("1. Agregar nombres");
                        System.out.println("2. Modificar nombre");
                        System.out.println("3. Borrar nombres");
                        System.out.println("4. Visualizar un nombre");
                        System.out.println("5. Visualizar todos los nombres");
                        System.out.println("6. Salir");
                        System.out.println(" ");
                    }
                }
            }
            if (menu==3) {
                System.out.println(" ");
                System.out.println("La lista actual contiene estos nombres:");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println((i+1)+": "+nombres.get(i));
                }
                scanner.nextLine();
                System.out.println(" ");
                System.out.println("¿Como quiere borrar un nombre, por posición o nombre? Escribe posicion/nombre");
                String eleccion3=scanner.nextLine();

                if (eleccion3.equals("posicion")) {
                    System.out.println(" ");
                    System.out.println("¿Qué posición quiere borrar?");
                    int posicion3=scanner.nextInt();
                    nombres.remove(posicion3-1);
                }
                if (eleccion3.equals("nombre")) {
                    System.out.println(" ");
                    System.out.println("¿Qué nombre quiere borrar?");
                    String nombreElegido=scanner.nextLine();
                    nombres.remove(nombreElegido);
                }

                System.out.println("La lista modificada contiene estos nombres:");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println((i+1)+": "+nombres.get(i));
                }

                System.out.println(" ");
                System.out.println("¿Cómo desea continuar?");
                System.out.println(" ");
                System.out.println("6. Salir");
                System.out.println("7. Back to menu");
                menu=scanner.nextInt();
                if (menu==7) {
                    System.out.println(" ");
                    System.out.println("Menú:");
                    System.out.println("1. Agregar nombres");
                    System.out.println("2. Modificar nombre");
                    System.out.println("3. Borrar nombres");
                    System.out.println("4. Visualizar un nombre");
                    System.out.println("5. Visualizar todos los nombres");
                    System.out.println("6. Salir");
                    System.out.println(" ");
                }
                if (menu==6) {
                    scanner.nextLine();
                    System.out.println(" ");
                    System.out.println("¿Estás seguro? Escribe si/no");
                    String decision=scanner.nextLine();
                    if (decision.equals("si")) {
                        
                    }
                    if (decision.equals("no")) {
                        menu=7;
                        System.out.println(" ");
                        System.out.println("Menú:");
                        System.out.println("1. Agregar nombres");
                        System.out.println("2. Modificar nombre");
                        System.out.println("3. Borrar nombres");
                        System.out.println("4. Visualizar un nombre");
                        System.out.println("5. Visualizar todos los nombres");
                        System.out.println("6. Salir");
                        System.out.println(" ");
                    }
                }
            }
            if (menu==4) {
                System.out.println(" ");
                System.out.println("¿Qué nombre quieres ver? Escribe el número de su posición.");
                int posicion4=scanner.nextInt();
                System.out.println(nombres.get(posicion4-1));

                System.out.println(" ");
                System.out.println("¿Cómo desea continuar?");
                System.out.println(" ");
                System.out.println("6. Salir");
                System.out.println("7. Back to menu");
                menu=scanner.nextInt();
                if (menu==7) {
                    System.out.println(" ");
                    System.out.println("Menú:");
                    System.out.println("1. Agregar nombres");
                    System.out.println("2. Modificar nombre");
                    System.out.println("3. Borrar nombres");
                    System.out.println("4. Visualizar un nombre");
                    System.out.println("5. Visualizar todos los nombres");
                    System.out.println("6. Salir");
                    System.out.println(" ");
                }
                if (menu==6) {
                    scanner.nextLine();
                    System.out.println(" ");
                    System.out.println("¿Estás seguro? Escribe si/no");
                    String decision=scanner.nextLine();
                    if (decision.equals("si")) {
                        
                    }
                    if (decision.equals("no")) {
                        menu=7;
                        System.out.println(" ");
                        System.out.println("Menú:");
                        System.out.println("1. Agregar nombres");
                        System.out.println("2. Modificar nombre");
                        System.out.println("3. Borrar nombres");
                        System.out.println("4. Visualizar un nombre");
                        System.out.println("5. Visualizar todos los nombres");
                        System.out.println("6. Salir");
                        System.out.println(" ");
                    }
                }
            }
            if (menu==5) {
                System.out.println(" ");
                System.out.println("Lista actual:");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println((i+1)+": "+nombres.get(i));
                }

                System.out.println(" ");
                System.out.println("¿Cómo desea continuar?");
                System.out.println(" ");
                System.out.println("6. Salir");
                System.out.println("7. Back to menu");
                menu=scanner.nextInt();
                if (menu==7) {
                    System.out.println(" ");
                    System.out.println("Menú:");
                    System.out.println("1. Agregar nombres");
                    System.out.println("2. Modificar nombre");
                    System.out.println("3. Borrar nombres");
                    System.out.println("4. Visualizar un nombre");
                    System.out.println("5. Visualizar todos los nombres");
                    System.out.println("6. Salir");
                    System.out.println(" ");
                }
                if (menu==6) {
                    scanner.nextLine();
                    System.out.println(" ");
                    System.out.println("¿Estás seguro? Escribe si/no");
                    String decision=scanner.nextLine();
                    if (decision.equals("si")) {
                        
                    }
                    if (decision.equals("no")) {
                        menu=7;
                        System.out.println(" ");
                        System.out.println("Menú:");
                        System.out.println("1. Agregar nombres");
                        System.out.println("2. Modificar nombre");
                        System.out.println("3. Borrar nombres");
                        System.out.println("4. Visualizar un nombre");
                        System.out.println("5. Visualizar todos los nombres");
                        System.out.println("6. Salir");
                        System.out.println(" ");
                    }
                }
            }
        }

        scanner.close();
    }
}
