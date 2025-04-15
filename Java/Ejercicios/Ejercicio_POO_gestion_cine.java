class Cine {
    
    private String película;
    private double precio;

    public Cine() {
    }

    public Cine(String película, double precio) {
        this.película = película;
        this.precio = precio;
    }

    public String getPelícula() {
        return película;
    }

    public void setPelícula(String película) {
        this.película = película;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}


class Espectador {
    
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

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

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}


class Pelicula {
    
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}


class Asientos {
    //Los asientos son etiquetados por una letra (columna) y un número (fila), la fila 1
    //empieza al final de la matriz como se muestra en la tabla.
    
    //También deberemos saber si está ocupado o no el asiento.
    
    //tenemos 8 filas y 9 columnas
    
    //| |a |b |c |d |e |f |g |h |i |
    //|1|1a|1b|1c|1d|1e|1f|1g|1h|1i|
    //|2|2a|2b|2c|2d|2e|2f|2g|2h|2i|
    //|3|3a|3b|3c|3d|3e|3f|3g|3h|3i|
    //|4|4a|4b|4c|4d|4e|4f|4g|4h|4i|
    //|5|5a|5b|5c|5d|5e|5f|5g|5h|5i|
    //|6|6a|6b|6c|6d|6e|6f|6g|6h|6i|
    //|7|7a|7b|7c|7d|7e|7f|7g|7h|7i|
    //|8|8a|8b|8c|8d|8e|8f|8g|8h|8i|

private final int rows;
private final int columns;
private final boolean[][] seats;  // Representa si el asiento está ocupado (true) o disponible (false)

public Asientos(int rows, int columns) {
    this.rows = rows;
    this.columns = columns;
    this.seats = new boolean[rows][columns];  // Inicializa todos los asientos como no ocupados
}

public void markSeatAsOccupied(int row, int column) {
    if (1 <= row && row <= rows && 1 <= column && column <= columns) {
        seats[row - 1][column - 1] = true;
        System.out.println("El asiento " + (char) ('A' + column - 1) + row + " está ahora ocupado.");
    } else {
        System.out.println("Coordenadas de asiento no válidas. Proporciona números de fila y columna válidos.");
    }
}

public void displaySeating() {
    System.out.println("Plano de Asientos:");
    for (int row = 0; row < rows; row++) {
        for (int column = 0; column < columns; column++) {
            String seatLabel = "" + (char) ('A' + column) + (row + 1);
            String status = seats[row][column] ? "OCUPADO" : "DISPONIBLE";
            System.out.println(seatLabel + ": " + status);
        }
        System.out.println();
    }
}

/*
Contexto:
Estamos dentro del método displaySeating().
Queremos mostrar la etiqueta de cada asiento en la sala de teatro.

Explicación de la expresión:
(char) ('A' + column - 1):

column: Representa el número de columna del asiento (de 1 a 9 en nuestro caso).
'A': Es el carácter correspondiente a la letra “A”.
column - 1: Restamos 1 al número de columna para ajustar el índice (ya que las columnas se numeran desde 1, pero los índices de matriz comienzan desde 0).
'A' + column - 1: Esto suma el valor numérico de 'A' con el valor de column - 1. Por ejemplo:
Si column es 1, entonces 'A' + 0 es igual a 'A'.
Si column es 2, entonces 'A' + 1 es igual a 'B'.
Y así sucesivamente.

Finalmente, (char) convierte el resultado en un carácter.

Resultado:

La expresión (char) ('A' + column - 1) genera la letra correspondiente a la columna actual. Por ejemplo:
Si column es 1, la etiqueta será “A”.
Si column es 2, la etiqueta será “B”.
Y así sucesivamente.
 */
}


public class Ejercicio_POO_gestion_cine {
    public static void main(String[] args) {
        //no sabía hacerlo y lo hice con chatGPT. Al menos entendí que hizo y aprendí
        Asientos cine = new Asientos( 8, 9);

        // Marcar algunos asientos como ocupados (ejemplo)
        cine.markSeatAsOccupied( 3, 5);
        cine.markSeatAsOccupied( 6, 2);
        cine.markSeatAsOccupied( 1, 9);

        // Mostrar el plano de asientos
        cine.displaySeating();
    }
}
