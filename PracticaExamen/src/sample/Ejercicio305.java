package sample;

import java.util.Scanner;

public class Ejercicio305 {
    public static void main(String[] args) {
        //Desarrollar un programa en el que se pidan al
        // usuario tres nu ́meros reales, y se escriban en
        // pantalla ordenados de menor a mayor.

        double a,b,c;
        int mayor=0, ubi;
        Scanner leer=new Scanner(System.in);

        System.out.println("Introduce un numero:");
        a=leer.nextDouble();
        System.out.println("Introduce un numero:");
        b=leer.nextDouble();
        System.out.println("Introduce un numero:");
        c=leer.nextDouble();

        if(a<b && a<c) System.out.println("NUMERO MENOR =>"+a);
        if(b<a && b<c) System.out.println("NUMERO MENOR =>"+b);
        if(c<b && c<a) System.out.println("NUMERO MENOR =>"+c);

        if(a>b && a<c || a<b && a>c) System.out.println("NUMERO EN MEDIO =>"+a);
        if(b>a && b<c || b<a && b>c) System.out.println("NUMERO EN MEDIO =>"+b);
        if(c>b && c<a || c<b && c>a) System.out.println("NUMERO EN MEDIO =>"+c);

        if(a>b && a>c) System.out.println("NUMERO MAYOR =>"+a);
        if(b>a && b>c) System.out.println("NUMERO MAYOR =>"+b);
        if(c>b && c>a) System.out.println("NUMERO MAYOR =>"+c);



        }
    }

