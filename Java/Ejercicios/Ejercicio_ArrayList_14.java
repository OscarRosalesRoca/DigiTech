import java.util.*;
public class Ejercicio_ArrayList_14 {
    public static void main(String[] args) {

//1. Diseña un programa en Java que pide por pantalla una palabra de x caracteres. Se 
//debe crear una matriz con el mismo número de celdas que letras tiene la palabra. 
//Consideraciones: 
//• Cada letra se debe almacenar en una celda.  
//• Se debe comprobar si hay algún valor repetido en alguna celda. 

        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase=scanner.nextLine();
        System.out.println("longitud de la frase");
        System.out.println(frase.length());
        Character[] array=new Character[frase.length()];
        System.out.println("longitud del array");
        System.out.println(array.length);

        for (int i=0; i<array.length; i++){
            array[i]=frase.charAt(i);
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
