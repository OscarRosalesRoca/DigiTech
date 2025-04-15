
class Store {
    private int stock;
    private final int MAX_STOCK = 5;

    public Store(){
        this.stock = 0;
    }

    public synchronized void createStock(){
        while (stock == MAX_STOCK) { 
            try {
                System.out.println("Stock is full. Wait until consume.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stock++;
        System.out.println("Producido: Stock actual = " + stock);
        notifyAll(); 
    }

    public synchronized void consumeStock(){
        while (stock <= 0) {  
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stock--;
        System.out.println("Consumido: Stock actual = " + stock);
        notifyAll(); 
    }

    public synchronized boolean isFull() {
        return stock == MAX_STOCK;
    }

    public synchronized boolean hasStock() {
        return stock > 0;
    }
}


class ProductiveThread implements Runnable{

    private Store store;

    public ProductiveThread(Store store){
        this.store = store;
    }

    @Override
    public void run(){
        while (true) {
            store.createStock();
            try {
                Thread.sleep(1000); // Simular tiempo de producción
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class ConsumeThread implements Runnable{
    private Store store;

    public ConsumeThread(Store store){
        this.store = store;
    }

    @Override
    public void run(){
        while (true) {
            store.consumeStock();
            try {
                Thread.sleep(1500); // Simular tiempo de producción
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ProductorConsumidorRun{
    public static void main(String[] args) {
        Store myStore = new Store();

        for (int i = 0; i < 3; i++) {
            new Thread(new ProductiveThread(myStore)).start();
        }

        ConsumeThread consumeThread = new ConsumeThread(myStore);
        Thread consumer = new Thread(consumeThread);

        consumer.start();
    }
}

/*

Una fábrica necesita implementar un sistema de control para gestionar la producción y consumo de piezas. 
La fábrica tiene máquinas productoras que fabrican piezas y máquinas consumidoras que utilizan estas piezas. 
Es necesario coordinar ambos tipos de máquinas para evitar problemas de sincronización.

REQUISITOS FUNCIONALES:

- Crear una clase genérica Contenedor que pueda almacenar un elemento de cualquier tipo.
- El contenedor debe tener métodos sincronizados para:  
    + Almacenar un elemento (put)
    + Extraer un elemento (get)
    + Verificar si hay un elemento disponible

- Implementar una clase HiloProductor que:
    + Genere números enteros secuenciales indefinidamente
    + Espere si el contenedor está lleno
    + Notifique cuando deposite un elemento

- Implementar una clase HiloConsumidor que:
    + Extraiga números del contenedor indefinidamente
    + Espere si el contenedor está vacío
    + Notifique cuando extraiga un elemento

- Los hilos deben sincronizarse adecuadamente para evitar:
    + Condiciones de carrera
    + Interbloqueos
    + Pérdida de datos

RETO ADICIONAL:
Modificar el programa para soportar múltiples productores y consumidores, implementando una solución 
que evite los problemas de sincronización que surgirían al usar notify() en lugar de notifyAll().

 */