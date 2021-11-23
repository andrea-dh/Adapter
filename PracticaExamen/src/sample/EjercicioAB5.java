package sample;

public class EjercicioAB5 {
    public static void main(String[] args) {
        //Hacer un algoritmo que llene una matriz 5*55 y que almacene la diagonal principal en un vector.
        int a[][]=new int[5][5];
        int diagonal[]=new int[5];
        //llenar la matriz
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=(int)(Math.random()*100);
            }
        }
        //tablita
        System.out.print("\t");
        for(int j=0;j<a.length;j++) {
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.print("\t");
        for(int j=0;j<a.length;j++){
            System.out.print("|\t");
        }
        System.out.println();
        for(int i=0;i<a.length;i++) {
            System.out.print(i + "--\t"); //lineas horizontales que separan
            for(int j=0;j<a.length;j++){
                //imprimir los numeros aleatorios
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int col=0;
        for (int i=0;i< 5;i++){
            diagonal[i]=a[i][col];
            col++;
        }
        for (int i=0;i<diagonal.length;i++)
            System.out.print(diagonal[i]+", ");
    }
}