package sample;

public class EjercicioAB7 {
    public static void main(String[] args) {
        //Hacer un algoritmo que llene una matriz de 6*8 y que almacene toda la matriz en un vector.
        int a[][]=new int[6][8];
        int v[]=new int[48];
        int cont=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=(int)(Math.random()*100);
                v[cont]=a[i][j];
                cont++;
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
        System.out.println();
        for (int i=0;i<48;i++){
            System.out.print(v[i]+", ");
        }
    }
}