package sample;

public class Fibonacci {
    public static void main(String[] args) {
       //fibonacci 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        int a, b, c, r;
        a=0;
        b=1;
        c=500;
        r=0;

        System.out.println(a);
        System.out.println(b);

        for(int i=0; r<=c; i++){
            r=a+b;
            a=b;
            System.out.println(r);
            b=r;

        }
    }
}
