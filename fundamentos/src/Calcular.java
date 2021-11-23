public class Calcular {
    public void esIsomorfica(Grafica g1, Grafica g2) {
        //matriz permutacion por matriz de adyacencia, grafica 2
        int pA2[][] = multiplicarMatriz(g2.getMatriz(), g1.matrizIdentidad());
        //lo anterior multiplicado por la transpuesta de la matriz permutación
        int pA2Pt[][] = multiplicarMatriz(pA2, g1.matrizPT(g1.matrizIdentidad()));
        int mp[][];

        if(!(invariantes(g1,g2))) System.out.print("Las gráficas no son isomorficas porque no cumplen con las características básicas");
        else {

            while (!(pA2Pt.equals(g1.getMatriz()))) {
                for (int i = 0; i < g1.getNumNodos(); i++) {
                    for (int j = 0; j < g1.getNumNodos(); j++) {
                        mp = cambiarFilaMatriz(g1.matrizIdentidad(), i, j);
                        pA2 = multiplicarMatriz(g2.getMatriz(), mp);
                        pA2Pt = multiplicarMatriz(pA2, g1.matrizPT(mp));
                        if (pA2Pt.equals(g1.getMatriz())) {
                            System.out.print("Las gráficas son isomorficas");
                            break;
                        }
                    }
                }
                System.out.print("Las gráficas no son isomorficas");
                break;

            }
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



    private int[] gradosIncidencia(Grafica g) {
        int a[] = new int[g.getNumNodos()];
        int tempA;

        for (int i = 0; i < g.getNumNodos(); i++) {
            tempA = 0;
            for (int j = 0; j < g.getNumNodos(); j++) {
                if (g.getG(i, j)) {
                    tempA++;
                }
            }
            a[i] = tempA;
        }

        ordenarMayorMenor(a);
        return a;

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

    private void ordenarMayorMenor(int a[]) {
        int tempA;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    tempA = a[i];
                    a[i] = a[j];
                    a[j] = tempA;
                }

            }

        }
    }

    public int[][] cambiarFilaMatriz(int matriz[][], int numFila, int cambiarAfila) {
        int temp;

        for (int j = 0; j < matriz.length; j++) {
                temp=matriz[numFila][j];
                matriz[numFila][j]=matriz[cambiarAfila][j];
                matriz[cambiarAfila][j]=temp;
            }

        System.out.println("fila "+(numFila+1)+" intercambiada con fila "+(cambiarAfila+1));
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        return matriz;
    }
}