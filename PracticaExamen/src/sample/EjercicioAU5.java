package sample;

import java.util.Scanner;

public class EjercicioAU5 {
    public static void main(String[] args) {
        //Desarrollar un programa en el que se pida al usuario dos
        // arreglos de números enteros e indique en pantalla el
        //producto escalar de los mismos.
        Scanner leer= new Scanner(System.in);
        int anum,bnum;
        int a[]=new int [3];
        int b[]=new int [3];
        int pescalar;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe el un valor en numero entero para el arreglo 1 en la posición "+(i+1));
            anum=leer.nextInt();
            a[i]=anum;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe el un valor en numero entero para el arreglo 2 en la posición "+(i+1));
            bnum=leer.nextInt();
            b[i]=bnum;
        }

        pescalar=(a[0]*b[0])+(a[1]*b[1])+(a[2]*b[2]);

        System.out.println("Producto escalar es de "+pescalar);









    }


    }