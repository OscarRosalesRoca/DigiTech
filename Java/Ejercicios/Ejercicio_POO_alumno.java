class Alumno {
    int id;
    String nombre;
    String apellido;
    
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    public void saberAprobado(double calificacion){
        if (calificacion>=5){
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Pues no parobé :( ");
        }
    }
}



public class Ejercicio_POO_alumno {
    public static void main(String[] args) {
        
        Alumno alum1=new Alumno();
        Alumno alum2=new Alumno(5, "Luisina", "de Paula");
        
        System.out.println("La ID del alumno 2 es: "+alum2.getId());
        System.out.println("El nombre es: "+alum2.getNombre());
        System.out.println("El apellido es: "+alum2.getApellido());
        
        alum1.setId(8);
        alum1.setNombre("Suscribete");
        alum1.setApellido("TodoCode");
        
        System.out.println(" ");
        
        System.out.println("La ID del alumno 1 es: "+alum1.getId());
        System.out.println("El nombre del alumno 1 es: "+alum1.getNombre());
        System.out.println("El apellido del alumno 1 es: "+alum1.getApellido());
        
        System.out.println(" ");
        System.out.println("____________________");
        System.out.println(" ");
        
        alum2.setId(35);
        
        System.out.println("La ID del alumno 2 es: "+alum2.getId());
        System.out.println("El nombre es: "+alum2.getNombre());
        System.out.println("El apellido es: "+alum2.getApellido());
    }
}
