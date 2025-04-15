public class Ejercicio_bucles_14 {
    public static void main(String[] args) {
        for (int a=0; a<=9;a++){
            if (a==3) {
                System.out.println("0-0-0-0-E");
            } else {
                System.out.println("0-0-0-0-"+a);
            }
        }
        for (int b=1; b<=9;b++){
            if (b==3) {
                System.out.println("0-0-0-E-9");
            } else {
                System.out.println("0-0-0-"+b+"-9");
            }
        }
        for (int c=1; c<=9;c++){
            if (c==3) {
                System.out.println("0-0-E-9-9");
            } else {
                System.out.println("0-0-"+c+"-9-9");
            }
        }
        for (int d=1; d<=9;d++){
            if (d==3) {
                System.out.println("0-E-9-9-9");
            } else {
                System.out.println("0-"+d+"-9-9-9");
            }
        }
        for (int e=1; e<=9;e++){
            if (e==3) {
                System.out.println("E-9-9-9-9");
            } else {
                System.out.println(e+"-9-9-9-9");
            }
        }


    }
}

//a-b-c-d-e
//1-2-3-4-5