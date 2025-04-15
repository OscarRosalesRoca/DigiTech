class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


class Empleado extends Persona{
    private double sueldo;
    private double comision;

    public Empleado() {
    }

    public Empleado(double sueldo, double comision, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.sueldo = sueldo;
        this.comision = comision;
    }

    public void calcularTotalCobrado(){
        
        double sueldoTotal;
        
        if (sueldo>0 && comision>0){
            sueldoTotal=sueldo+comision;
            System.out.println("El sueldo total del empleado es: "+sueldoTotal);
        }
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}


public class Ejercicio_POO_lista_empleados {
    public static void main(String[] args) {

        Persona persona1=new Persona("Oscar", "Rosales", 20);
        Persona persona2=new Persona("Maria", "Muñoz", 20);
        Persona persona3=new Persona("Manuel", "Rosales", 40);
        Persona persona4=new Persona("Ruben", "Casanova", 25);
        Persona persona5=new Persona("Tintín", "Park", 30);
        
        persona1.getNombre();
        persona1.getApellidos();
        persona1.getEdad();
        
        persona2.getNombre();
        persona2.getApellidos();
        persona2.getEdad();
        
        persona3.getNombre();
        persona3.getApellidos();
        persona3.getEdad();
        
        persona4.getNombre();
        persona4.getApellidos();
        persona4.getEdad();
        
        persona5.getNombre();
        persona5.getApellidos();
        persona5.getEdad();
        
        
        Empleado empleado1=new Empleado(1000, 300, "Oscar", "Rosales", 20);
        Empleado empleado2=new Empleado(1200, 400, "Maria", "Muñoz", 20);
        Empleado empleado3=new Empleado(1300, 500, "Manuel", "Rosales", 40);
        Empleado empleado4=new Empleado(1400, 600, "Ruben", "Casanova", 25);
        Empleado empleado5=new Empleado(1500, 700, "Tintín", "Park", 30);
        
        empleado1.getSueldo();
        empleado1.getComision();
        empleado1.calcularTotalCobrado();
        
        empleado2.getSueldo();
        empleado2.getComision();
        empleado2.calcularTotalCobrado();
        
        empleado3.getSueldo();
        empleado3.getComision();
        empleado3.calcularTotalCobrado();
        
        empleado4.getSueldo();
        empleado4.getComision();
        empleado4.calcularTotalCobrado();
        
        empleado5.getSueldo();
        empleado5.getComision();
        empleado5.calcularTotalCobrado();
    }
}
