package sample;

import java.util.Scanner;

public class Ejercicio302 {
    public static void main(String[] args) {
        //Desarrollar un programa en el que se pida al usuario un valor real, x
        // y se escriba en pantalla el valor de la funcion f(x) = 1/(x2 − 1).
        // Para los valores de x en los que la funcion f(x) no este correctamente
        // definida, se debe escribir un aviso en pantalla.
        double x, f;
        Scanner leer=new Scanner(System.in);
        System.out.println("Da un valor a x: ");
        x =leer.nextDouble();

        f=1/(Math.pow(x,2)-1);
        if (x==1) System.out.println("Valor no válido");
        else System.out.println("Valor de la funcion: "+f);
    }
}
