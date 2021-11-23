package sample;

import java.util.Scanner;

public class T1P2Ejercicio2 {
    public static void main(String[] args) {
        int i=2;
        int c=0;

        String r;
        boolean parar;
        while (parar = true){
            if (i%2!=0){
                System.out.println(i);
                c++;
            }
            i++;

            Scanner respuesta = new Scanner(System.in);
            System.out.println("Parar?");
            r = respuesta. nextLine();

            if(parar=false){
                break;
            }


        }
        System.out.println("numeros impares "+ c);
    }
}
