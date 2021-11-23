package sample;

import java.util.Scanner;

public class Ejercicio313 {
    public static void main (String[] args){
        /*

        Desarrollar un programa en el que se pida al usuario dos valores enteros positivo, n y m, con m ≤ n y,
        usando bucles for, se escriba en pantalla el valor del numero ´ combinatorio
         */
        Scanner leer=new Scanner(System.in);
        int m, n, fn=1, fm=1, fnm=1, numcomb;
        System.out.println("Ingresa el valor m");
        m=leer.nextInt();
        System.out.println("Ingrese el valor n");
        n=leer.nextInt();

        if (m<=n)
            try {


                for (int i = n; i > 0; i--) {
                    fn = fn * i;
                }
                for (int i = m; i > 0; i--) {
                    fm = fm * i;
                }
                for (int i = (n - m); i > 0; i--) {
                    fnm = fnm * i;
                }


                numcomb = fn / (fm * fnm);

                System.out.println("El numero combinatorio de " + n + " y " + m + " es igual a " + numcomb);

            }
        catch(Exception e){
            System.out.println("El valor m debe ser menor o igual a n");
        }


    }
}
