public class Coche extends Vehiculo {
    private int numeroDePuertas;
    
    public Coche(String marca, String modelo, int año, int numeroDePuertas) {
        super(marca, modelo, año);
        this.numeroDePuertas=numeroDePuertas;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("La marca del vehiculo es: "+getMarca());
        System.out.println("El modelo del vehiculo es: "+getModelo());
        System.out.println("El año de lanzamiento del modelo es del: "+getAño());
        System.out.println("El número de puertas es de: "+getNumeroDePuertas());
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
}
