package sample;

import java.util.Scanner;

public class EjercicioAB11 {
    public static void main(String[] args) {
        /*El dueño de una cadena de tiendas de artículos deportivos desea controlar sus ventas
        por medio de una computadora . Los datos de entrada son :
        a) El numero de la tienda (1 a 50)
        b) Un numero que indica el deporte del articulo (1 a 20)
        c) El costo del articulo.
        Hacer un pseudocódigo que escriba al final del día lo siguiente
        1. Las ventas totales en el día para cada tienda
        2.Las ventas totales para cada uno de los deportes.
        3. Las ventas totales de todas las tiendas.*/
        Scanner leer = new Scanner(System.in);
        int vtienda = 0, vdeporte = 0, vtot = 0, costo;
        int tienda[][] = new int[5][2];

        for (int i = 0; i < tienda.length; i++) {
            for (int j = 0; j < tienda[i].length; j++) {
                System.out.println("Escribe el costo del artículo de deporte " + (j + 1) + " de la tienda " + (i + 1));
                costo = leer.nextInt();
                tienda[i][j] = costo;
                vtot = tienda[i][j] + vtot;

            }

        }
        for (int i = 0; i < tienda.length; i++) {
            vtienda = 0;
            for (int j = 0; j < tienda[i].length; j++) {
                vtienda = vtienda + tienda[i][j];
            }
            System.out.println("Ventas totales de la tienda " + (i+1) + "=" + vtienda);
        }

        for (int j = 0; j < tienda[0].length; j++) {
            vdeporte = 0;
            for (int i = 0; i < tienda.length; i++) {
                    vdeporte = vdeporte + tienda[i][j];
                }
                System.out.println("Ventas totales del deporte " + (j+1) + "=" + vdeporte);
                }





        System.out.println("Las ventas totales fue de = "+vtot);
    }
}
