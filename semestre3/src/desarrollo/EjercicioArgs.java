/*
    v14.0.2           11/08/2021

    Materia: Desarrollo de Sistemas III

    Autor: Andrea Duarte Hernández
    Copyright (c)
 */
package desarrollo;

import java.util.Arrays;
/*
    El siguiente programa recibirá una lista de N números
    enteros a través de la línea de comandos y dará como salida una lista
    de los valores ordenados de menor a mayor (orden ascendente)
 */
public class EjercicioArgs {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Faltan argumentos");
            System.exit(0);
        }

        int num1;
        int num2;
        int temp;

        for (int i = 0; i < args.length-1; i++) { //se le pone args.length-1 para que no marque error mas adelante
            try {
                //Convertir el elemento del arreglo a int para poder comparar
                num1 = Integer.parseInt(args[i]);
                num2 = Integer.parseInt(args[i+1]);
                if (num1 > num2) {
                    //variable para que no se pierda el valor de num1
                    temp = num1;
                    //en i se guarda lo que era el numero menor
                    args[i] = args[i + 1];
                    /*
                    en i+1 se guarda lo que era el numero mayor,
                    para que vaya quedando al final del arreglo
                     */
                    args[i + 1] = String.valueOf(temp);
                    //se le resta 1 para que continue el ciclo y se acomode el resto
                    i = -1;
                }
            } catch (NumberFormatException nfe){
                System.out.println(args[i] + " no es un número entero");
            }
        }

        System.out.println(Arrays.toString(args));
    }
}
