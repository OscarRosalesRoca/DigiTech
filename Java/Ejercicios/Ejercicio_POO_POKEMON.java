interface IAgua {
    
    public void atacarHidrobomba();
    public void atacarBurbuja();
    public void atcarPistolaagua();
    
}

interface IElectrico {
    
    public void atacarimpactrueno();
    public void atacarPuniotrueno();
    
}

interface IFuego {
    
    public void atacarPuñofuego();
    public void atacarLazallamas();
    public void atacarAscuas();
    
}

interface IPlanta {
    
    public void atacarDrenaje();
    public void atacarParalizar();
    
}


abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
        
}


class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPuñofuego() {
        System.out.println("Hola soy Charmander y este es mi ataque puño fuego");
    }

    @Override
    public void atacarLazallamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas ");
    }
}

class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atcarPistolaagua() {
        System.out.println("Hola soy Squirtle y este es mi ataque pistola agua");
    }
}

class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco");      
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");
    }
}

class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarimpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPuniotrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque puño trueno");
    }
}


public class Ejercicio_POO_POKEMON {
    public static void main(String[] args) {
        
        Squirtle squirtle=new Squirtle();
        Charmander charmander=new Charmander();
        Bulbasaur bulbasaur=new Bulbasaur();
        Pikachu pikachu=new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLazallamas();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        pikachu.atacarMordisco();
        pikachu.atacarimpactrueno();
        
    }
}