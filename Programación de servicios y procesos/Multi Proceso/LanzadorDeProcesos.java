public class LanzadorDeProcesos {
    public void ejecutar(String ruta){

        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder(ruta);
            pb.start();
        } catch (Exception e) {
            // TODO: Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args){

        String ruta = " ";
        LanzadorDeProcesos lp = new LanzadorDeProcesos();
        lp.ejecutar(ruta);
        System.out.println("Finalizado");

    }
}
