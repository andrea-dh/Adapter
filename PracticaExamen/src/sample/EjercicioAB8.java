package sample;

public class EjercicioAB8 {
    public static void main(String[] args) {
        //Hcer un algoritmo que llene una matriz de 8*8, que almacene la suma de los renglones y la suma de las columnas en un vector.
        //Imprimir el vector resultante.
        int a[][]=new int[8][8];
        int v[]=new int[16];
        int sumatoria=0, control=0;
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
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                sumatoria=sumatoria+a[i][j];
            }
            v[control]=sumatoria;
            control++;
            sumatoria=0;
        }
        control=8;
        for (int j=0;j<8;j++){
            for (int i=0;i<8;i++){
                sumatoria=sumatoria+a[i][j];
            }
            v[control]=sumatoria;
            control++;
            sumatoria=0;
        }
        for (int i=0;i<v.length;i++){
            System.out.print(v[i]+", ");
        }
    }
}