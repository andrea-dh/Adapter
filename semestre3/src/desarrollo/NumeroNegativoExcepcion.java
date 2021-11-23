/*
    Java v14.0.2        Creado: 17/agosto/2021

    Materia: Desarrollo de Sistemas III

    Autor: Andrea Duarte Hernández
    Copyright (c)
 */
package desarrollo;

import java.util.Scanner;

public class NumeroNegativoExcepcion extends Exception{
    public NumeroNegativoExcepcion(){
        super();
    }
    public NumeroNegativoExcepcion(String mensaje){
        super(mensaje);
    }

}

class RaizNumero {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero para calcular su raiz cuadrada");
        int num = leer.nextInt();

        try {
            calcularRaiz(num);
        } catch (NumeroNegativoExcepcion e) {
            System.out.println("EXCEPCION ENCONTRADA\n"+e);
        }


    }

    public static void calcularRaiz(int num) throws NumeroNegativoExcepcion {
        if(num>=0)
            System.out.println(Math.sqrt(num));
        else
            throw new NumeroNegativoExcepcion("El numero ingresado es negativo, no tiene raiz");

    }
}
