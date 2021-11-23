package sample;

import java.util.Scanner;

public class EjercicioAU7 {
    public static void main(String args[]) {

        //Desarrollar un programa en el que se pida al usuario
        // dos arreglos de números enteros, v1 y v2, e indique en
        //pantalla si para toda posición i, el elemento i-ésimo de v1
        // es menor o igual que el elemento i-ésimo de v2. Asumir que los vectores tienen la misma longitud.
        Scanner leer = new Scanner(System.in);
        int a;
        boolean cond=true;

        System.out.println("Escribe el valor de los vectores");
        a=leer.nextInt();

        int v1[] = new int[a];
        int v2[] = new int[a];

        for (int i=0; i< a; i++){
          v1[i]=(int)(Math.random()*50);
            v2[i]=(int)(Math.random()*50);
        }

        for(int i=0; i< a; i++){
            if (v1[i]>v2[i]){
                cond=false;
                System.out.println("No se cumple la condición porque el valor "+v1[i]+
                        " es mayor que "+v2[i]);
                break;
            }
        }

        if(cond) System.out.println("Todos los valores del vector 1 son menores o iguales que vector 2");
    }
}