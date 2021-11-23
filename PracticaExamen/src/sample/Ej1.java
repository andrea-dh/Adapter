package sample;

import java.util.Scanner;

public class Ej1 {
        public static void main(String[] args) {
            Scanner leer=new Scanner (System.in);
            int vector[]=new int[20];
            int mayor, cont;
            for (int i=0;i<= 19;i++){
                System.out.println("Ingrese un numero");
                vector[i]=leer.nextInt();
            }
            mayor=vector[0];
            for (int i=0;i<=19;i++){
                if (vector[i]>mayor) {
                    mayor=vector[i];
                }
            }
            cont=0;
            for(int i=0;i<=19;i++){
                if (vector[i]==mayor){
                    cont++;
                }
            }
            for (int i=0;i<=19;i++){
                System.out.println(vector[i]+", ");
            }
            System.out.println("El numero mayor en el arreglo es = " + mayor);
            System.out.println("El numero mayor se encontraba la siguiente cantidad de veces = " + cont);
        }
    }

