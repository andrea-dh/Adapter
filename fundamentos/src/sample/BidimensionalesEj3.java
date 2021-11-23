package sample;

public class BidimensionalesEj3 {
    public static void main(String[] args) {
        int arreglo[][] = {{4, 7, 1, 3, 5}, {2, 0, 6, 9, 7}, {3, 1, 2, 6, 4}};
        int arreglob[][] = new int[5][3];

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                System.out.println(arreglo[i][j]);
            }
        }


        System.out.println();

        for (int i = 0; i < arreglob.length; i++) {
            for (int j = 0; j < arreglob[0].length; j++) {
                arreglob[i][j]=arreglo[j][i];
                System.out.println(arreglob[i][j]);
            }
        }

    }
}
