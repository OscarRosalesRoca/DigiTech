import java.io.BufferedWriter;
import java.io.FileWriter;

public class Persona {

    private String nombre;
    private int edad;

    public Persona (String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void escribirDatos(String ruta){
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(ruta, true));

            writer.write("Nombre: " + this.nombre);
            writer.newLine();
            writer.write("Edad: " + this.edad);
            writer.newLine();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
