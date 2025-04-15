import java.util.Scanner;

class Sumar {
    
    private double n1;
    private double n2;

    public Sumar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double sumar(){
        return n1+n2;
    }
}

class Restar {
    
    private double n1;
    private double n2;

    public Restar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double restar(){
        return n1-n2;
    }
}

class Multiplicar {
    
    private double n1;
    private double n2;

    public Multiplicar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double multiplicar(){
        return n1*n2;
    }
}

class Dividir {
    
    private double n1;
    private double n2;

    public Dividir(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    

    public double dividir(){
        return n1/n2;
    }
}


class Pedir {
    
    private double n1;

    public Pedir(double n1) {
        this.n1 = n1;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }
}


public class Ejercicio_POO_calculadora {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        int aux=1;
        
        System.out.println("Escribe el número de la opción del menú que quieras realizar.");
        System.out.println(" ");
        System.out.println("Menú:");
        System.out.println(" ");
        
        while (aux!=0){

            System.out.println("1. Pedir número");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Salir");
            int eleccion=scanner.nextInt();
            if(eleccion==1){
                
                System.out.println(" ");
                System.out.println("¿Qué número quieres?");
                double n1=scanner.nextDouble();
                
                Pedir pedir=new Pedir(n1);
                System.out.println(" ");
                System.out.println("El número que has escrito es: "+pedir.getN1());
                
                System.out.println(" ");
                System.out.println("¿Qué quieres hacer ahora?");
                System.out.println(" ");
            }
            if(eleccion==2){
            
                System.out.println("Vamos a sumar dos números.");
                System.out.println("Escribe el primero:");
                double n1=scanner.nextDouble();
                System.out.println(" ");
                System.out.println("Escribe el segundo:");
                double n2=scanner.nextDouble();
                
                Sumar sumar=new Sumar(n1,n2);
                double resultado=sumar.sumar();
                System.out.println(" ");
                System.out.println("El resultado de sumar "+n1+" con "+n2+" es: "+resultado);
                
                System.out.println(" ");
                System.out.println("¿Qué quieres hacer ahora?");
                System.out.println(" ");
            }
            if(eleccion==3){
            
                System.out.println("Vamos a restar dos números.");
                System.out.println("Escribe el primero:");
                double n1=scanner.nextDouble();
                System.out.println(" ");
                System.out.println("Escribe el segundo:");
                double n2=scanner.nextDouble();
                
                Restar restar=new Restar(n1,n2);
                double resultado=restar.restar();
                System.out.println(" ");
                System.out.println("El resultado de restar "+n1+" con "+n2+" es: "+resultado);
                
                System.out.println(" ");
                System.out.println("¿Qué quieres hacer ahora?");
                System.out.println(" ");
            }
            if(eleccion==4){
            
                System.out.println("Vamos a multiplicar dos números.");
                System.out.println("Escribe el primero:");
                double n1=scanner.nextDouble();
                System.out.println(" ");
                System.out.println("Escribe el segundo:");
                double n2=scanner.nextDouble();
                
                Multiplicar multi=new Multiplicar(n1,n2);
                double resultado=multi.multiplicar();
                System.out.println(" ");
                System.out.println("El resultado de multiplicar "+n1+" con "+n2+" es: "+resultado);
                
                System.out.println(" ");
                System.out.println("¿Qué quieres hacer ahora?");
                System.out.println(" ");
            }
            if(eleccion==5){
                
                System.out.println("Vamos a dividir dos números.");
                System.out.println("Escribe el primero:");
                double n1=scanner.nextDouble();
                System.out.println(" ");
                System.out.println("Escribe el segundo:");
                double n2=scanner.nextDouble();
                
                Dividir div=new Dividir(n1,n2);
                double resultado=div.dividir();
                System.out.println(" ");
                System.out.println("El resultado de dividir "+n1+" con "+n2+" es: "+resultado);
                
                System.out.println(" ");
                System.out.println("¿Qué quieres hacer ahora?");
                System.out.println(" ");
            }
            if(eleccion==6){
                aux=0;
            }
            scanner.close();
        } 
    }
}
