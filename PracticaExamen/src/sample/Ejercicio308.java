package sample;

import java.util.Scanner;

public class Ejercicio308 {
    public static void main (String[] args){
        /*
        Ejercicio 8:
        Desarrollar un programa en el que se pida al usuario un valor entero positivo,n y, usando un bucle while,se
        escriba en pantalla el valor del factorial de n.n! =nx(n-1)x.....x1.
         */

        Scanner x=new Scanner(System.in);
        int n=0, f=1;
        System.out.println("Ingrese un número");
        n=x.nextInt();
        for(int i=n;i>0;i--) {
            f=f*i;
        }
        System.out.println("El factorial del numero "+ n + " es: " + f);

    }
}