public class Ejercicio_matrices_1 {
    public static void main(String[] args) {
        int[][] arrayBidimensional={
            {3,4,5,78},
            {0,0,0,0},
            {1,1,1,1},
            {6,6,6,-1}
        };

        int grande=arrayBidimensional[0][0];
        int pequeño=arrayBidimensional[0][0];

        for(int i=0; i<arrayBidimensional.length; i++){
            for(int t=0; t<arrayBidimensional[i].length; t++){
                int valorActual=arrayBidimensional[i][t];
                if (valorActual>grande) {
                    grande=valorActual;
                }
                if (valorActual<pequeño) {
                    pequeño=valorActual;
                }
            }
        }

        System.out.println("El número más grande es: "+grande);
        System.out.println("El número más pequeño es: "+pequeño);

    }
}
