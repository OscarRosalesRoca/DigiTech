public class Ejercicio_math_lanzamiento_maximo {
    public static void main(String[] args) {
        System.out.println("Se presentan los participantes. A continuación, hará su lanzamiento el jugador 1");
        double aux1=(Math.random()*6+0.5);
        System.out.println(aux1);
        double aux2=(Math.random()*6+0.5);
        double intento1=Math.round(aux1);
        double intento2=Math.round(aux2);
        int jugador1=(int)intento1;
        int jugador2=(int)intento2;
        System.out.println("El jugador 1 ha sacado: "+jugador1+" y el jugador 2 ha sacado: "+jugador2);
        int ganador=Math.max(jugador1, jugador2);
        System.out.println("Quien sacó "+ganador+" es el ganador");
    }
}
