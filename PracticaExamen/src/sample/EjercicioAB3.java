package sample;

public class EjercicioAB3 {
    public static void main(String[] args) {
        //Hacer un algoritmo que llene una matriz de 7*7. Calcular
        //la suma de cada renglon y almacenarla en un vector, la suma
        //de las columnas en otro vector.
        int a[][]=new int[7][7];
        int filas[]= new int[7];
        int columnas[]= new int [7];
        int sumatoria=0, contador=0;
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





        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                sumatoria=sumatoria+a[i][j];
            }
            System.out.println("Sumatoria de la fila "+i+"="+sumatoria);
            sumatoria=0;
        }
        for (int j=0;j<7;j++){
            for (int i=0;i<7;i++){
                sumatoria=sumatoria+a[i][j];
            }
            System.out.println("Sumatoria de la columna "+j+"="+sumatoria);
            sumatoria=0;
        }
    }
}

