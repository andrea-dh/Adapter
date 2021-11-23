package sample;

public class EjercicioAB9 {
    public static void main(String[] args) {
    /*Hacer un algoritmo que llene una matriz de 5 * 6 y que imprima cuantos de los números
    almacenados son ceros, cuantos son positivos y cuantos son negativos.*/
        int matriz[][]=new int [5][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*(-50-(+50)+1)+50);

            }

        }

        //tablita
        System.out.print("\t");
        for(int j=0;j<matriz[0].length;j++) {
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.print("\t");
        for(int j=0;j<matriz[0].length;j++){
            System.out.print("|\t");
        }
        System.out.println();
        for(int i=0;i<matriz.length;i++) {
            System.out.print(i + "--\t"); //lineas horizontales que separan
            for(int j=0;j<matriz[i].length;j++){
                //imprimir los numeros aleatorios
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

        int cp=0, cn=0, c0=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0) cp++;
                if (matriz[i][j] < 0) cn++;
                if (matriz[i][j] == 0) c0++;
            }
        }

        System.out.println("La cantidad de numeros positivos en el arreglo es de "+cp);
        System.out.println("La cantidad de numeros negativos en el arreglo es de "+cn);
        System.out.println("La cantidad de 0 en el arreglo es de "+c0);

        }

    }

