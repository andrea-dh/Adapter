package sample;

import java.util.Scanner;

public class Ejercicio301 {
    public static void main(String[] args) {
        //Desarrollar un programa en el que se pida al usuario un valor real, x,
        //y se escriba en pantalla su valor absoluto.
        float x;

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        x = leer.nextFloat();

        System.out.println("El numero absoluto es: "+Math.abs(x));
    }
}
