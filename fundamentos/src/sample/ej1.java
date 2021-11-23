package sample;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        int arreglo[]=new int [5], valor;
        Scanner leer=new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*5);
        }

            System.out.println("Elige un valor a buscar");
            valor=leer.nextInt();

            for (int i = 0; i < arreglo.length; i++) {
                if (valor==arreglo[i]) System.out.println("El valor "+valor+" se encuentra en la posición "+(i+1)+" del arreglo");
            }


    }
}
