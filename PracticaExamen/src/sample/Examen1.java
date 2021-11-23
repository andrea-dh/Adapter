package sample;

import java.util.Scanner;

public class Examen1 {
    public static void main(String[] args) {
        //Desarrollar un programa en el que se pida al usuario un número entero positivo, n
        //y, usando un bucle for, se escriba en pantalla el número  n al revés.
        //Por ejemplo, si n = 12345, en pantalla se ha de escribir 54321
        int n, res;
        Scanner leer=new Scanner(System.in);

        System.out.println("Escribe un numero:");
        n=leer.nextInt();

        System.out.print("NUMERO AL REVES => ");
        for(int i = 0; n!=i; i++){
            res=n%10;
            n=n/10;
            System.out.print(res);
            if(n<=0) break;


        }

    }

}
