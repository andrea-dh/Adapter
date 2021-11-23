package sample;

import java.util.Scanner;

public class Ejercicio304 {
    public static void main(String[] args) {
        //Desarrollar un programa en el que se pidan al usuario las coordenadas de un punto del plano, (x, y), y se
        //indique en pantalla si el punto se encuentra en el interior del circulo unidad (centro (0, 0) y radio 1), en el borde
        //de dicho circulo o en el exterior del mismo.
        double x,y,hip;

        Scanner coord1= new Scanner(System.in);
        System.out.println("Escribe la coordenada en x:");
        x=coord1.nextDouble();

        Scanner coord2= new Scanner(System.in);
        System.out.println("Escribe la coordenada en y:");
        y=coord2.nextDouble();


        hip=Math.pow(x,2)+Math.pow(y,2);
        if (hip==1) System.out.println("El punto se encuentra en el borde del círculo");
        else{
            if ((x<-1 || x>1) && (y<-1 || y>1)) System.out.println("El punto se encuentra en el exterior del círculo");
            if (x==-1 || x==1 && y==1 || y==-1) System.out.println("El punto se encuentra en el exterior del círculo");
            else if ((x>-1 || x<1) && (y>-1 || y<1)) System.out.println("El punto se encuentra en el interior del círculo");
        }




    }
}
