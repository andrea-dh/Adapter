public class Calcular {
    private int numFila, cambiarAfila;

    public void esIsomorfica(Grafica g1, Grafica g2) {
        //matriz permutacion por matriz de adyacencia, grafica 2
        int pA2[][];
        //lo anterior multiplicado por la transpuesta de la matriz permutación
        int pA2Pt[][];
        int mp[][], c=0;

        double factorial=factorial(g1.getNumNodos());

        if(!(invariantes(g1,g2))) System.out.print("Las gráficas no son isomorfas porque no cumplen con las características básicas");
        else {
                while (factorial!=0){
                    random(g1.getNumNodos());
                    mp=cambiarFilaMatriz(g1.matrizIdentidad(),numFila,cambiarAfila);
                    pA2= multiplicarMatriz(g2.getMatriz(), mp);
                    pA2Pt = multiplicarMatriz(pA2, g1.matrizPT(mp));
                    if (pA2Pt.equals(g1.getMatriz())) {
                        System.out.println("Son gráficas isomorfas");
                    }
                        factorial--;
                    }
                System.out.println("Tienen cualidades de gráficas isomorfas, pero no son isomorfas");
                }
            }

    private boolean invariantes(Grafica g1, Grafica g2) {
        boolean invariantes = false;
        if (g1.getNumNodos() == g2.getNumNodos()) {
            if (numAristas(g1) == numAristas(g2)) {
                if (numIncidencias(g1) == numIncidencias(g2)) {
                    invariantes = true;
                }
                else System.out.println("Las gráficas no tienen el mismo numero de incidencias");
            }
            else System.out.println("Las gráficas no tienen el mismo numero de aristas");
        }
        else System.out.println("Las graficas no tienen el mismo numero de nodos");

        return invariantes;
    }


    private int numIncidencias(Grafica g) {
        int contador = 0;
        for (int i = 0; i < g.getNumNodos(); i++) {
            for (int j = 0; j < g.getNumNodos(); j++) {
                if (g.getG(i, j)) contador++;
            }

        }
        return contador;

    }

    private int numAristas(Grafica g) {
        int contador = 0;
        for (int i = 0; i < g.getNumNodos(); i++) {
            for (int j = 0; j < g.getNumNodos(); j++) {
                if (g.getG(i, j)) contador++;
            }

        }
        if(contador%2!=0) contador++;

        return contador / 2;

    }

    private int[][] multiplicarMatriz(int a[][], int b[][]) {
        int matriz[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    matriz[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return matriz;
    }


    public int[][] cambiarFilaMatriz(int matriz[][], int numFila, int cambiarAfila) {
        int temp;

        for (int j = 0; j < matriz.length; j++) {
                temp=matriz[numFila][j];
                matriz[numFila][j]=matriz[cambiarAfila][j];
                matriz[cambiarAfila][j]=temp;
            }
        return matriz;
    }



    public void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static double factorial(int n) {
        double factorial=1;
        while(n!=0) {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }

    public void random(int max){
        numFila= (int) (Math.random()*max);
        cambiarAfila= (int) (Math.random()*max);
    }


}

