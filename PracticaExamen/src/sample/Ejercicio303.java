package sample;

import java.util.Scanner;

public class Ejercicio303 {
    public static void main(String[] args) {
        //Desarrollar un programa en el que se pidan al usuario dos valores reales,
        // x e y, y se indique en pantall cual es el maximo y cual es el mınimo.
        // Si los dos valores son iguales, se ha de escribir en pantalla un mensaje
        //indicandolo
        double x, y;

        Scanner num1=new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        x=num1.nextDouble();

        Scanner num2=new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        y=num2.nextDouble();

        if (x>y) {
            System.out.println("El valor "+x+" es el maximo");
            System.out.println("El valor "+y+" es el minimo");
        }
        if (y>x) {
            System.out.println("El valor "+y+" es el máximo");
            System.out.println("El valor "+x+" es el minimo");
        }
        if (y==x) System.out.println("Los dos valores son iguales");
    }
}
