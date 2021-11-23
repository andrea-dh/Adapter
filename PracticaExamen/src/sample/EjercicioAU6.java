package sample;

import java.util.Scanner;

public class EjercicioAU6 {
    public static void main(String[] args) {
        //Desarrollar un programa en el cual se pida al usuario un número natural n, se c
        // onstruya un arreglo de tamaño n
        //tal que la posición i-ésima almacene el factorial del número i y, finalmente,
        // se muestren en pantalla todos los elementos de dicho arreglo.
        Scanner leer = new Scanner(System.in);
        int i = 0, n, c = 1;

        System.out.println("Escribe el tamaño del arreglo");
        n = leer.nextInt();
        int arreglo[] = new int[n+1];

        for (i = 1; i < arreglo.length; i++) {
            arreglo[i]=1;
            for(int j=1; j<i; j++) {
                arreglo[i]=arreglo[i]*(j);
            }
            }


            for (int j = 1; j < arreglo.length; j++) {
                System.out.println(arreglo[j]);
            }

        }
    }


