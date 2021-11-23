package sample;

import java.util.Scanner;

public class EjercicioAU1 {
    public static void main(String[] args) {
        //Elaborar un algoritmo que lea 20 números
        // enteros en un arreglo, que imprima el arreglo,
        // el número mayor y cuantos elementos hay de este número.
        int[] num;
        int mayor=0;
        int c=0;
        num = new int[20];
        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe 20 numeros:");
        for (int i = 0; i < num.length; i++) {
            num[i] = leer.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
        System.out.println();

        for(int i=0; i<num.length; i++) {
            if (num[i] > mayor) {
                mayor = num[i];
            }
        }
            System.out.println("El numero mayor es: "+mayor);

        for(int i=0; i<num.length;i++){
            if (num[i]==mayor){
                c++;
            }
        }
        System.out.println("El numero mayor se repite "+c+" veces");




        }
    }
