package sample;

import java.util.Scanner;

public class Ejercicio318 {
    public static void main(String[] args) {
        /*
        Desarrollar un programa que sirva para aproximar el valor de π usando la Suma de Leibniz
        El programa ha de pedir al usario un numero ´ natural n para hacer la aproximaci´on y devolver el resultado
        de la suma de Leibniz para valores de k desde 0 hasta
         */
        Scanner leer=new Scanner(System.in);
        double n, sumatoria=0;
        System.out.println("Ingresa un numero natural");
        n=leer.nextInt();

        for(int k=0; k<=n; k++){
            sumatoria=-sumatoria+((double) (Math.pow(-1,k))/(2*k+1));
        }

        sumatoria=sumatoria*4;
        System.out.println(sumatoria);
    }
}
