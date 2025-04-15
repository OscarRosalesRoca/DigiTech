import java.util.*;
public class Ejercicio_ArrayList_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escribe 5 números enteros:");
        ArrayList <Integer> numeros=new ArrayList<>();
        for (int i=0; i<5; i++){
            numeros.add(scanner.nextInt());
        }

        //Si pones un scanner.nextLine(); tienes que consumir el "carácter de nueva línea pendiente"
        //Esto pasa ya que al poner un scanner.nextInt() creamos un buffer y siempre dejará un sitio más del que demandamos
        //Por lo tanto es necesario consumirlo antes de pasar al scanner.nextLine()
        //Para solucionarlo escribimos scanner.nextLine(); sin valor alguno y así limpiamos el buffer

        scanner.nextLine();

        System.out.println("¿Quieres imprimir por pantalla estos números?");
        String afirmacion=scanner.nextLine();

        if (afirmacion.equalsIgnoreCase("si")) {
            for(int numero : numeros){
                System.out.println(numero);
            } 
        }

        scanner.close();
    }
}
