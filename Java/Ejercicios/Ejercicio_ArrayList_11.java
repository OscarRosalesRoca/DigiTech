public class Ejercicio_ArrayList_11 {
    public static void main(String[] args) {
        int[] num=new int[10];

        for(int i=0; i<num.length; i++){
            num[i]=i+1;
        }

        for(int aux=num.length; aux>=0; aux--){
            System.out.println(aux+" ");
        }

        System.out.println(num[9]+" "+num[8]+" "+num[7]+" "+num[6]+" "+num[5]+" "+num[4]+" "+num[3]+" "+num[2]+" "+num[1]+" "+num[0]);
    }
}
