public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
    }

    public void mostrarDatos(){
        System.out.println("La marca del vehiculo es: "+getMarca());
        System.out.println("El modelo del vehiculo es: "+getModelo());
        System.out.println("El año de lanzamiento del modelo es del: "+getAño());
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAño() {
        return año;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAño(int año) {
        this.año = año;
    }
}
