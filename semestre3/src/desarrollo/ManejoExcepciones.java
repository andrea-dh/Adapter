/*
    Java v14.0.2        Creado: 17/agosto/2021

    Materia: Desarrollo de Sistemas III

    Autor: Andrea Duarte Hernández
    Copyright (c)
 */
package desarrollo;

import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase:");
        String lectTeclado = leer.nextLine();
        try {
            caracterEn(lectTeclado, 7);
        } catch (Exception e) {
            System.out.println("EXCEPCION ENCONTRADA\n"+e);
        }

    }

    public static void caracterEn(String x, int index) throws Exception {

        if (index >= 0 && index < x.length()) {
            System.out.println(x.charAt(index));
        }
        else{
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}
