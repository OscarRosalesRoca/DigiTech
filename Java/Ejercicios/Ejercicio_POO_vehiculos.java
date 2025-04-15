import java.util.ArrayList;
import java.util.Random;

abstract class Vehiculo {
    
    private int matricula;
    private String marca;
    private String modelo;
    private String color;
    private int numPuertas;
    private int caballos;

    public static Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("Turismo")) {
            return new Turismo();
        } else if (tipo.equalsIgnoreCase("Deportivo")) {
            return new Deportivo();
        } else {
            return null; 
        }
    }
}


class Turismo extends Vehiculo {
    private int numPlazas; 

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
}


class Deportivo extends Vehiculo {
    private boolean descapotable;

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}


public class Ejercicio_POO_vehiculos {
        public static void main(String[] args) {

        Vehiculo vehiculo1 = Vehiculo.crearVehiculo("Turismo");
        Vehiculo vehiculo2 = Vehiculo.crearVehiculo("Deportivo");
        
        Vehiculo [] vehiculos1 = new Vehiculo [10];
        
        for (int i=0; i<vehiculos1.length; i++){
            
            Random random = new Random();
            int opcion = random.nextInt(2);
            
            if(opcion==0){
                vehiculos1[i]= Vehiculo.crearVehiculo("Turismo");
            } else {
                vehiculos1[i]= Vehiculo.crearVehiculo("Deportivo");
            }
            
        }

        ArrayList<Vehiculo> vehiculos2 = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            
            Random random = new Random();
            int opcion = random.nextInt(2);
            
            if (opcion == 0) {
                vehiculos2.add(Vehiculo.crearVehiculo("Turismo"));
            } else {
                vehiculos2.add(Vehiculo.crearVehiculo("Deportivo"));
            }

        }
    }
}
