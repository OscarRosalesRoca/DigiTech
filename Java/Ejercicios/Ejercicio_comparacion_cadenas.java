import java.util.Scanner;
public class Ejercicio_comparacion_cadenas {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad1;
        String cad2;
        System.out.println("Ingrese la primera cadena:");
        cad1=teclado.nextLine();
        System.out.println("Ingrese la segunda cadena:");
        cad2=teclado.nextLine();

        if (cad1.equals(cad2)==true) {
            System.out.println(cad1+" es exactamente igual a "+cad2);
        } else {
            System.out.println(cad1+" no es exactamente igual a "+cad2);
        }

        if (cad1.equalsIgnoreCase(cad2)==true) {
            System.out.println(cad1+" es igual a "+cad2+" sin tener en cuenta mayúsculas/minísculas");
        } else {
            System.out.println(cad1+" no es igual a "+cad2+" sin tener en cuenta mayúsculas/minúsculas");
        }

        if (cad1.compareTo(cad2)==0) {
            System.out.println(cad1+" es exactamente igual a "+cad2);
        } else {
            if (cad1.compareTo(cad2)>0) {
                System.out.println(cad2+" es mayor alfabéticamente que "+cad1);
            } else {
                System.out.println(cad1+" es mayor alfabéticamente que "+cad2);
            }
        }

        System.out.println("El primer carácter de "+cad1+" es "+cad1.charAt(0));
        System.out.println("La longitud de la cadena "+cad1+" es "+cad1.length());
        System.out.println("Los primeros tres caracteres de "+cad1+" son "+cad1.substring(0, 3));

        int posi=cad1.indexOf(cad2);
        if (posi==-1) {
            System.out.println(cad2+" no está contenido en "+cad1);
        } else {
            System.out.println(cad2+" está contenido en "+cad1+" a partir de la posición "+posi);
        }

        System.out.println(cad1+" convertido a mayúsculas es "+cad1.toUpperCase());
        System.out.println(cad1+" convertido a minúsculas es "+cad1.toLowerCase());

        teclado.close();
    }
}
