package sample;

import java.util.Scanner;

public class alg2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero: ");
        numero = leer.nextInt();
        if (numero % 3 == 0)
        {System.out.println("3");}
        else
        {System.out.println("no 3");}


    }
}
