package Banco;

import java.util.Random;

class CuentaBancaria{
    private double saldo;
    private String nombre;

    public CuentaBancaria (double saldo, String nombre){
        this.saldo = saldo;
        this.nombre = nombre;
    }

    synchronized double getSaldo(){
        return this.saldo;
    }

    synchronized public void depositar(int idCliente, double cantidad){
        this.saldo += cantidad;
    }

    synchronized public void retirar(int idCliente, double cantidad){
        this.saldo -= cantidad;
    }

    public String getNombre() {
        return nombre;
    }
}

class Cliente implements Runnable{
    private CuentaBancaria cuentaBancaria;
    private int idCliente;
    private Random random = new Random();
    private double guardarSaldo;
    private double saldoModificado;
    private int cantidad = 100;

    public Cliente(CuentaBancaria cuentaBancaria, int idCliente) {
        this.cuentaBancaria = cuentaBancaria;
        this.idCliente = idCliente;
        this.guardarSaldo = cuentaBancaria.getSaldo(); 
        this.saldoModificado = guardarSaldo;
    }

    @Override
    public void run(){
        synchronized (System.out) {
            System.out.println("\nHola soy el cliente '" + idCliente + "' y voy a hacer 3 operaciones:");
            for (int i = 0; i < 3; i++) {
                int numRandom = random.nextInt(2);
                if (numRandom == 0) {
                    System.out.println("Deposito 100 euros en la cuenta bancaria.");
                    cuentaBancaria.depositar(idCliente, cantidad);
                    saldoModificado = guardarSaldo + cantidad;
                    System.out.println("Saldo anterior: " + guardarSaldo + ". Nuevo saldo: " + saldoModificado);
                }
                if (numRandom == 1) {
                    System.out.println("Retiro 100 euros de la cuenta bancaria.");
                    cuentaBancaria.retirar(idCliente, cantidad);
                    saldoModificado = guardarSaldo - cantidad;
                    System.out.println("Saldo anterior: " + guardarSaldo + ". Nuevo saldo: " + saldoModificado);
                }
                guardarSaldo = saldoModificado;
            }
        }
    }
}


public class ExtraBancoHilos {
    public static void main(String[] args) {
        CuentaBancaria BBVA = new CuentaBancaria(500, "BBVA");
        Thread[] clientes = new Thread[5];
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Thread(new Cliente(BBVA, i));
            clientes[i].start();
        }
        for (Thread th : clientes) {
            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nSimulación completada");
        System.out.println("Saldo final: "+ BBVA.getSaldo());
    }
}


/*

Mi versión (sale todo desordenado):
    @Override
    public void run(){
        System.out.println("\nHola soy el cliente '" + idCliente + "' y voy a hacer 3 operaciones:");
        for (int i = 0; i < 3; i++) {
            int numRandom = random.nextInt(2);
            if (numRandom == 0) {
                System.out.println("Deposito 100 euros en la cuenta bancaria.");
                cuentaBancaria.depositar(idCliente, cantidad);
                saldoModificado = guardarSaldo + cantidad;
                System.out.println("Saldo anterior: " + guardarSaldo + ". Nuevo saldo: " + saldoModificado);
            }
            if (numRandom == 1) {
                System.out.println("Retiro 100 euros de la cuenta bancaria.");
                cuentaBancaria.retirar(idCliente, cantidad);
                saldoModificado = guardarSaldo + cantidad;
                System.out.println("Saldo anterior: " + guardarSaldo + ". Nuevo saldo: " + saldoModificado);
            }
            guardarSaldo = saldoModificado;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

PREGUNTA: ¿Hasta qué punto es bueno sincronizar las salidas? ¿Solo sincroniza las salidas o también modifica su comportamiento?
Quiero decir ¿Si sincronizamos el depositar y retirar estamos perdiendo un poco la cualidad de trabajo en paralelo de los hilos no?

 */
