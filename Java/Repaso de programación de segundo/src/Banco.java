public class Banco {

    private String titular;
    private double saldo;

    public Banco(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }

    public double depositar(double monto){
        saldo+=monto;
        return saldo;
    }

    public double retirar(double monto){
        saldo-=monto;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDatos(){
        System.out.println("El titular de la cuenta es: "+titular+" con un saldo de: "+saldo);
    }
}
