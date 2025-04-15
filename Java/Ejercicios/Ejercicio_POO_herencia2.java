abstract class Planta {
    
    protected int numHojas;
    protected String tipoHojas;
    
    protected abstract void sitemaRiego(String type);

    public int getNumHojas() {
        return numHojas;
    }

    public void setNumHojas(int numHojas) {
        this.numHojas = numHojas;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }
}


class Exterior extends Planta{

    @Override
    protected void sitemaRiego(String type) {
        if (type.equals("exterior")){
            System.out.println("Método de riego: Goteo");
        } else {
            System.out.println("Escriba bine el tipo de la planta");
        }
    }
}


class Frutal extends Planta{

    @Override
    protected void sitemaRiego(String type) {
        if (type.equals("frutal")){
            System.out.println("Método de riego: Permanente");
        } else {
            System.out.println("Escriba bien el tipo de planta");
        }
    }
}


class Interior extends Planta{

    @Override
    protected void sitemaRiego(String type) {
        if (type.equals("interior")){
            System.out.println("Método de riego: Goteo");
        } else {
            System.out.println("Escriba bine el tipo de planta");
        }
    }
}


public class Ejercicio_POO_herencia2 {
    public static void main(String[] args) {
        
        
        Interior plantaInterior=new Interior();
        Exterior plantaExterior=new Exterior();
        Frutal plantaFrutal=new Frutal();

        plantaInterior.setTipoHojas("permanente");
        plantaExterior.setTipoHojas("caduca");
        plantaFrutal.setTipoHojas("frutas");
        
        System.out.println(plantaInterior.getTipoHojas());
        System.out.println(plantaExterior.getTipoHojas());
        System.out.println(plantaFrutal.getTipoHojas());
        
        System.out.println(" ");
        
        plantaInterior.sitemaRiego("interior");
        plantaExterior.sitemaRiego("exterior");
        plantaFrutal.sitemaRiego("frutal");
    }
}
