class Persona {
    
    int id;
    String dni;
    String nombre;
    String apellido;
    String domicilio;
    String telefono;

    public Persona() {
    }

    public Persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}


class Consultor extends Persona{
    
    String nombre_consultora;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(String nombre_consultora, int num_consultor, int id,
            String dni, String nombre, String apellido, String domicilio, 
            String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
}


class Empleado extends Persona{
    
    int num_seguridad;
    String funcion;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int num_seguridad, String funcion, Double sueldo, int id,
            String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_seguridad = num_seguridad;
        this.funcion = funcion;
        this.sueldo = sueldo;
    }

    public int getNum_seguridad() {
        return num_seguridad;
    }

    public void setNum_seguridad(int num_seguridad) {
        this.num_seguridad = num_seguridad;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}


class Jefe extends Persona{
    
    int id_jefe;
    String departamento_jefe;

    public Jefe() {
    }

    public Jefe(int id_jefe, String departamento_jefe, int id, String dni, 
            String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }
}

public class Ejercicio_POO_herencia {
    public static void main(String[] args) {

        Empleado emple = new Empleado();
        
        emple.getNum_seguridad();
        emple.getNombre();
        
        Consultor consul = new Consultor();
        
        consul.getNombre();
        
        Persona vector [] = new Persona [5];
        vector [0] = new Persona();
        vector [1]=new Empleado();
        vector [2]=new Consultor();
        vector [3]=new Jefe();
        
        
    }
}
