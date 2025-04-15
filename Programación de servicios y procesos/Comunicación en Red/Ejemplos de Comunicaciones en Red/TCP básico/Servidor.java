import java.io.*;
import java.net.*;

class Servidor extends Thread {
    Socket socketCliente;
    static final int Puerto = 2000;

    public Servidor(Socket socketCliente) {
        this.socketCliente = socketCliente;
    }

    public static void main(String[] arg) {
        try {
            // Inicio el servidor en el puerto
            ServerSocket socketServidor = new ServerSocket(Puerto);
            System.out.println("Escucho el puerto " + Puerto);
            while (true) {
                // Se conecta un cliente
                Socket socketCliente = socketServidor.accept();
                System.out.println("Cliente conectado");
                // Atiendo al cliente mediante un thread
                new Servidor(socketCliente).start();
            }
        } catch (Exception e) {
            ;
        }
    }

    public void run() {
        try {
            // Creo los flujos de entrada y salida
            DataInputStream flujo_entrada = new DataInputStream(socketCliente.getInputStream());
            DataOutputStream flujo_salida = new DataOutputStream(socketCliente.getOutputStream());

            // ATENDER PETICIÓN DEL CLIENTE
            flujo_salida.writeUTF("Se ha conectado el cliente de forma correcta");

            // Se cierra la conexión
            socketCliente.close();

            System.out.println("Cliente desconectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
