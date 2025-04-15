import java.util.*;
public class Ejercicio_matrices_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[][] array=new int[4][4];

        System.out.println("Te pediré por pantalla que escribas los números necesarios para rellenar una matriz 4x4");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.println("Inserta número para el array 4x4: ");
                array[i][j]=scanner.nextInt();
            }
        }

        int sumaFila=0;
        int aux=0;

        while (aux==0) {
            System.out.println("Qué fila quieres sumar? Hay de la 0 a la 3");
            int fila=scanner.nextInt();
            if (fila==0 || fila==1 || fila==2 || fila==3) {
                for(int i=fila; i<fila+1; i++){
                    for(int j=0; j<array[i].length; j++){
                        sumaFila=sumaFila+array[i][j];
                    }
                }
                aux++;
            } else {
                System.out.println("Escoge bien el número");
            }
        }

        System.out.println("La suma de los números de la fila escogida da: "+sumaFila);

        int sumaColumna=0;
        int aux2=0;

        while (aux2==0) {
            System.out.println("Qué columna quieres sumar? Hay de la 0 a la 3");
            int columna=scanner.nextInt();
            if (columna==0 || columna==1 || columna==2 || columna==3) {
                for(int i=0; i<array.length; i++){
                    for(int j=columna; j<columna+1; j++){
                        sumaColumna=sumaColumna+array[i][j];
                    }
                }
                aux2++;
            } else {
                System.out.println("Escoge bien el número");
            }
        }

        System.out.println("La suma de los números de la fila escogida da: "+sumaColumna);

        int sumaDiagonal=array[0][0]+array[1][1]+array[2][2]+array[3][3];
        int sumaDiagonalInversa=array[0][3]+array[1][2]+array[2][1]+array[3][0];

        System.out.println("La suma de la diagonal da: "+sumaDiagonal);
        System.out.println("La suma de la diagonal inversa da: "+sumaDiagonalInversa);

        int sumaMedia=0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                sumaMedia=sumaMedia+array[i][j];
            }
        }

        int media=sumaMedia/16;
        System.out.println("La media de todos los números del array es: "+media);
        
        scanner.close();
    }
}
