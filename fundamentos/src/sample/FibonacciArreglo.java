package sample;

public class FibonacciArreglo {
    public static void main(String[] args) {
        long fibonacci[]=new long[100];
        long a=0, b=1;

        fibonacci[0]=a;
        fibonacci[1]=b;

        for(int i=2; i<100; i++){
            fibonacci[i]=a+b;
            a=b;
            b=fibonacci[i];
        }

        for (int i=0; i< fibonacci.length;i++){
            System.out.println("POSICION => "+(i+1)+ "\t"+fibonacci[i]);
        }
    }
}
