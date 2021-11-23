package sample;

public class EjercicioAB4 {
    public static void main(String[] args) {
        //Hacer un algoritmo que llene una matriz de 20*20. Sumar las columnas e imprimir que columna tuvo la máximo suma y la suma de la columna.
        int a[][]=new int[20][20];
        int sumatoria=0, max=0, columna=0;
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
        for (int j=0;j<20;j++){
            for (int i=0;i<20;i++){
                sumatoria=sumatoria+a[i][j];
            }
            if(sumatoria>max){
                max=sumatoria;
                columna=j;
                sumatoria=0;
            }
            sumatoria=0;
        }
        System.out.println("La suma más grande de las columnas es la numero "+columna+" con un total de ="+max);

    }
}
