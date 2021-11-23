public class Grafica {
    private int numNodos;
    private boolean g[][];
    private int matriz[][];

    public Grafica(int numNodos) {
        this.numNodos = numNodos;
        g = new boolean[numNodos][numNodos];
        matriz = new int[numNodos][numNodos];
    }

    public void setConexiones(int numVertice, int conectadoCon) {
        g[numVertice - 1][conectadoCon - 1] = true;
        matriz[numVertice - 1][conectadoCon - 1] = 1;
    }

    public void imprimirConexiones() {
        for (int i = 0; i < numNodos; i++) {
            System.out.print("El nodo " + (i + 1) + " está conectado con: ");
            for (int j = 0; j < numNodos; j++) {
                if (g[i][j] == true) {
                    System.out.print("nodo " + (j + 1) + " ");
                }
            }
            System.out.println();
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < numNodos; i++) {
            for (int j = 0; j < numNodos; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
    }

    public int [][] matrizIdentidad(){
        int mi[][]=new int[numNodos][numNodos];
        for (int i = 0; i < mi.length; i++) {
            mi[i][i]=1;
        }

        return mi;
    }

    public int[][] matrizPT(int matrizPermutacion[][]){
        int pt[][]=new int[matrizPermutacion.length][matrizPermutacion.length];
        //aqui la matriz permutacion cambia sus filas por columnas (Transpuesta de la matriz permutación)
        for (int i = 0; i < pt.length; i++) {
            for (int j = 0; j < pt.length; j++) {
                pt[j][i]=matrizPermutacion[i][j];
            }
        }

        return pt;
    }


    public int getNumNodos() {
        return numNodos;
    }

    public boolean getG(int i, int j) {
        return g[i][j];
    }

    public int[][] getMatriz() {
        return matriz;
    }
}

