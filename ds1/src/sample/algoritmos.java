package sample;

import java.util.Scanner;

public class algoritmos {
    public static void main(String[] args){
        Scanner leer =  new Scanner(System.in);
        double promedioParciales, califEjercicios, califProyecto, promedioFinal;
        System.out.println("Escribe el promedio de los tres parciales");
        promedioParciales = leer.nextDouble();
        System.out.println("Escribe la calificación en los ejercicios");
        califEjercicios = leer.nextDouble();
        System.out.println("Escribe la calificación del proyecto final");
        califProyecto = leer.nextDouble();
        promedioFinal = (promedioParciales*0.55) + (califEjercicios*0.30) + (califProyecto*0.15);
        System.out.println("Tu promedio final es: " + promedioFinal);


    }
}
