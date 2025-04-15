public class Moticicleta extends Vehiculo {

    private boolean sidecar;

    public Moticicleta(String marca, String modelo, int año, boolean sidecar) {
        super(marca, modelo, año);
        this.sidecar=sidecar;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("La marca del vehiculo es: "+getMarca());
        System.out.println("El modelo del vehiculo es: "+getModelo());
        System.out.println("El año de lanzamiento del modelo es del: "+getAño());
        System.out.println("¿La motocicleta tiene sidecar? "+sidecar);
    }

}
