import java.util.ArrayList;
import java.util.List;

class Array {

    static List<String> asList(String fútbol, String música) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static List<String> asList(String comer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


class Persona {
    
    private String nombre;
    private String apellido;
    private String calle;
    private long telefono;
    private List<String> aficiones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public List<String> getAficiones() {
        return aficiones;
    }

    public void setAficiones(List<String> aficiones) {
        this.aficiones = aficiones;
    }
}


class Metodos {
    
    public void cargarDatos(Persona persona, String nombre, String apellido, String calle, long telefono, String... aficiones){
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setCalle(calle);
        persona.setTelefono(telefono);
        
        List<String> listaAficiones = new ArrayList<>();
        for (String aficion : aficiones) {
            listaAficiones.add(aficion);
        }
        persona.setAficiones(listaAficiones);
    }
    
    
    public void mostrarDatos(Persona persona){
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Calle: "+persona.getCalle());
        System.out.println("Teléfono: "+persona.getTelefono());
        System.out.println("Aficiones: "+persona.getAficiones());
    }
    
    
    public void cambiarDatos(Persona persona, String nombre, String apellido, String calle, long telefono, String... aficiones){
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setCalle(calle);
        persona.setTelefono(telefono);
        
        List<String> listaAficiones = new ArrayList<>();
        for (String aficion : aficiones) {
            listaAficiones.add(aficion);
        }
        persona.setAficiones(listaAficiones);
        
        System.out.println("\nNuevos datos");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Calle: "+persona.getCalle());
        System.out.println("Teléfono: "+persona.getTelefono());
        System.out.println("Aficiones: "+persona.getAficiones());
    }
}


public class Ejercicio_POO_array3 {
    public static void main(String[] args) {

        Persona persona=new Persona();
        Metodos opciones=new Metodos();
        
        opciones.cargarDatos(persona, "Óscar", "Rosales Roca", 
                "calle", 3333333, "cantar", "bailar", "programar");
        
        opciones.mostrarDatos(persona);
        opciones.cambiarDatos(persona, "Manuel", "apellido", "calle", 000000, "bailar");
    }
}
