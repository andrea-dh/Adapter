package sample;

import java.util.Scanner;

public class Ejercicio315 {
        public static void main(String[] args) {
            /*
                Desarrollar un programa en el que se pida al usuario dos numeros ´ enteros positivos, n y m, y, usando un
                bucle for, se escriba en pantalla el valor de n a la m*/

            int n,m,c=1;
            Scanner leer=new Scanner(System.in);
            System.out.println("introduce el valor n: ");
            n=leer.nextInt();
            System.out.println("introduce el valor m : ");
            m=leer.nextInt();

            for (int i = 0; i <m ; i++) {
                c=c*n;
            }

            System.out.println("El numero "+n+" elevado a la "+m+" potencia es igual a "+c);
        }

    }

