import java.util.ArrayList;
import java.util.Scanner;

class ListaDeActores {
    
    private ArrayList<String> actores = new ArrayList<String>();

    Scanner scanner=new Scanner(System.in);
    
    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public void agregarActor(){
        System.out.println("\n¿Qué nombre quiere añadir?");
        String nombre=scanner.nextLine();
        if (actores.contains(nombre)){
            System.out.println("No se puede añadir este nombre porque ya está registrado");
        } else {
        actores.add(nombre);
        }
    }
    
    public void modificarNombre(){
        System.out.println("\nEstos son los nombres que tenemos registrados: ");
        for (int i=0; i<actores.size(); i++){
            System.out.println(actores.get(i));
        }
        System.out.println("\n¿Cuál deseas modificar?");
        String eleccion=scanner.nextLine();
        
        int aux=0;
        
        do{
        int posicion=actores.indexOf(eleccion);
        if (posicion>=0){
            aux=1;
            System.out.println("¿Por cuál lo quieres cambiar?");
            String eleccion2=scanner.nextLine();
            actores.set(posicion, eleccion2);
            System.out.println("Nombre cambiado con éxito");
        } else {
            System.out.println("Perdone pero escribió mal el nombre, vuelva a escribirlo");
        }
        } while (aux==0);
    }
    
    public void eliminarNombre(){
        System.out.println("\n¿Qué nombre quiere eliminar?");
        String nombre=scanner.nextLine();
        actores.remove(nombre);
    }
    
    public void buscarNombre(){
        System.out.println("\n¿Qué nombre quiere buscar?");
        
        String eleccion=scanner.nextLine();
        int posicion=actores.indexOf(eleccion);
        
        if(posicion>=0){
            System.out.println("El nombre "+eleccion+" se encuentra en la posición: "+(posicion+1));
        }
        else {
            System.out.println("El nombre "+eleccion+" no se encuentra en el registro");
        }
    }
    
    public void visualizarNombre(){
        System.out.println("Tenemos "+actores.size()+" nombres registrados");
        System.out.println("\n¿Qué nombre quieres ver? Indica el número de su posición");
        int posicion=scanner.nextInt();
        System.out.println("La posición "+posicion+" corresponde al nombre: "+actores.get(posicion-1));
    }
    
    public void cantidadNombres(){
        System.out.println("La cantidad de nombres registrados es de: "+actores.size());
    }
}


public class Ejercicio_POO_actores {
    public static void main(String[] args) {

        ListaDeActores activo=new ListaDeActores();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bien venido a un registro de actores!");
        System.out.println("Para ejecutar una acción escribe el número de dicha acción. Actualmente el registro está vacío");
        System.out.println("\nMenú:");
        System.out.println("\n1) Para agregar nombres");
        System.out.println("2) Para modificar nombres");
        System.out.println("3) Para borrar nombres");
        System.out.println("4) Para buscar un nombres y saber su posición en el registro");
        System.out.println("5) Para visualizar nombres");
        System.out.println("6) ¿Cuántos nombres hay registrados?");
        System.out.println("7) Salir");
        
        int eleccion=scanner.nextInt();
        
        int aux=0;
        while (aux==0){
        switch (eleccion){
            case 1:
                activo.agregarActor();
                break;
            case 2:
                activo.modificarNombre();
                break;
            case 3:
                activo.eliminarNombre();
                break;
            case 4:
                activo.buscarNombre();
                break;
            case 5:
                activo.visualizarNombre();
                break;
            case 6:
                activo.cantidadNombres();
                break;
            case 7:
                aux=1;
            default:
                System.out.println("Introduce un número de acción válido por favor.");
            }
        
            System.out.println("\n¿Que quiere hacer ahora?");
            System.out.println(" ");
            System.out.println("\nMenú:");
            System.out.println("\n1) Para agregar nombres");
            System.out.println("2) Para modificar nombres");
            System.out.println("3) Para borrar nombres");
            System.out.println("4) Para buscar un nombres y saber su posición en el registro");
            System.out.println("5) Para visualizar nombres");
            System.out.println("6) ¿Cuántos nombres hay registrados?");
            System.out.println("7) Salir");
            
            eleccion=scanner.nextInt();
        }
        scanner.close();
    }
}
