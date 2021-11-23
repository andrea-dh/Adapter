package sample;

public class Mayor {
    public static void main(String[] args) {
        int a=41;
        int b=40;
        int c=50;
        int d=70;

        if (a>b & a>c & a>d) System.out.println("El número mayor es a y su valor es " + a);
        if (b>a & b>c & b>d) System.out.println("El número mayor es b y su valor es " + b);
        if (c>a & c>b & c>d) System.out.println("El número mayor es c y su valor es " + c);
        if (d>b & d>c & d>a) System.out.println("El número mayor es d y su valor es " + d);
    }
}
