import java.util.Random;

class Aula {
    
    //• El aula debe tener un identificador numérico, el número máximo de estudiantes y para
    //que esta destinada (matemáticas, filosofía o física). Piensa que más atributos necesita.
    
    private int ID;
    private int maximoAlumnos=10;
    private String destinada;

    public Aula() {
    }

    public Aula(int ID) {
        this.ID = ID;
        
        String[] materias = {"matemáticas", "filosofía", "física"};

        Random random = new Random();
        
        int numAleatorio = random.nextInt(materias.length);
        
        String materia = materias[numAleatorio];
        this.destinada = materia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMaximoAlumnos() {
        return maximoAlumnos;
    }

    public void setMaximoAlumnos(int maximoAlumnos) {
        this.maximoAlumnos = maximoAlumnos;
    }

    public String getDestinada() {
        return destinada;
    }

    public void setDestinada(String destinada) {
        this.destinada = destinada;
    }
}

abstract class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private boolean disponibilidad;
    
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, boolean disponibilidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.disponibilidad = disponibilidad;
    }

    public abstract void calcularDisponibilidad();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}

class Estudiante extends Persona {
    private int calificación; //de 0 a 10

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo, true);
        
        Random random = new Random();
        
        int numAleatorio = random.nextInt(11);
        
        this.calificación = numAleatorio;
    }

    public int getCalificación() {
        return calificación;
    }

    public void setCalificación(int calificación) {
        this.calificación = calificación;
    }

    @Override
    public void calcularDisponibilidad() {
        double aleatorio=Math.random();
        if (aleatorio<0.5){
            Estudiante.super.setDisponibilidad(false);
        } else {
            Estudiante.super.setDisponibilidad(true);
        }
    }
}

class Profesor extends Persona{
    private String materia;

    public Profesor() {
    }

    public Profesor(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo, true);

        String[] materias = {"matemáticas", "filosofía", "física"};

        Random random = new Random();
        
        int numAleatorio = random.nextInt(materias.length);
        
        String materiaAleatoria = materias[numAleatorio];

        this.materia = materiaAleatoria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void calcularDisponibilidad() {
        double aleatorio=Math.random();
        if (aleatorio<0.2){
            Profesor.super.setDisponibilidad(false);
        } else {
            Profesor.super.setDisponibilidad(true);
        }
    }
}


public class Ejercicio_POO_gestion_aula {
    public static void main(String[] args) {

        //Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y
        //sexo. De los estudiantes, queremos saber también su calificación actual (entre 0 y 10) y
        //del profesor que materia da.
        
        //HECHO
        
        
        //• Las materias disponibles son matemáticas, filosofía y física.
        
        //HECHO
        
        
        //• Los estudiantes tendrán un 50% de hacer novillos, por lo que si hacen novillos no van a
        //clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene su
        //sitio).
        
        //• El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.) Las dos
        //operaciones anteriores deben llamarse igual en Estudiante y Profesor (polimorfismo).
        
        //HECHO
        
        
        //• El aula debe tener un identificador numérico, el número máximo de estudiantes y para
        //que esta destinada (matemáticas, filosofía o física). Piensa que más atributos necesita.
        
        //• Un aula para que se pueda dar clase necesita que el profesor esté disponible, que el
        //profesor de la materia correspondiente en el aula correspondiente (un profesor de
        //filosofía no puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.
        
        //• El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase,
        //teniendo en cuenta las condiciones antes dichas. Si se puede dar clase mostrar cuantos
        //alumnos y alumnas (por separado) están aprobados de momento (imaginad que les
        //están entregando las notas).
        
        //• NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y
        //cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12).

        
        Profesor Oscar=new Profesor("Oscar", 20, "M");
        
        System.out.println(Oscar.getMateria());
        
        Estudiante Abel=new Estudiante("Abel", 20, "M");
        
        Abel.calcularDisponibilidad();
        System.out.println("diponibilidad de abel: "+Abel.isDisponibilidad());
        
        
        Estudiante[] alumno= new Estudiante[10];
        alumno[0]=new Estudiante("Oscar", 20, "M");
        alumno[1]=new Estudiante("María", 20, "F");
        alumno[2]=new Estudiante("Jose", 20, "M");
        alumno[3]=new Estudiante("Juanan", 20, "M");
        alumno[4]=new Estudiante("Javi", 20, "M");
        alumno[5]=new Estudiante("Abel", 20, "M");
        alumno[6]=new Estudiante("Nil", 20, "M");
        alumno[7]=new Estudiante("Almendra", 20, "M");
        alumno[8]=new Estudiante("Doraemon", 20, "M");
        alumno[9]=new Estudiante("Pocoyó", 20, "M");
        
        for (int i=0; i<alumno.length; i++){
            alumno[i].calcularDisponibilidad();
        }
        
        Profesor clara=new Profesor("Clara", 30, "F");
        clara.calcularDisponibilidad();
        
        Aula clase=new Aula(5);
        
        System.out.println("clase "+clase.getDestinada());
        
        int disponibles=0;
        int aprobados=0;
        for (int i=0; i<alumno.length; i++){
            if(alumno[i].isDisponibilidad()==true){
                disponibles++;
            }
            if(alumno[i].getCalificación()<5){
                aprobados++;
            }
        }
        
        if (clara.getMateria()==clase.getDestinada()&&disponibles>=5){
            System.out.println("Se puede dar clase y el número de alumnos que ha aprobado es de: "+aprobados);
        } else {
            System.out.println("No se puede dar clase");
        }
    }
}
