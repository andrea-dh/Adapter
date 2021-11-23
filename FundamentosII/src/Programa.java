public class Programa{
    public static void main(String[] args) {
        Calcular calcular=new Calcular();
        Grafica grafica1=new Grafica(4);
        Grafica grafica2=new Grafica(4);

        grafica1.setConexiones(1,2);
        grafica1.setConexiones(1,4);
        grafica1.setConexiones(2,1);
        grafica1.setConexiones(2,3);
        grafica1.setConexiones(3,2);
        grafica1.setConexiones(3,4);
        grafica1.setConexiones(4,1);
        grafica1.setConexiones(4,3);

        grafica2.setConexiones(1,3);
        grafica2.setConexiones(1,4);
        grafica2.setConexiones(2,4);
        grafica2.setConexiones(2,3);
        grafica2.setConexiones(3,2);
        grafica2.setConexiones(3,1);
        grafica2.setConexiones(4,2);
        grafica2.setConexiones(4,1);

        System.out.println("Matriz de adyacencia de G1");
        grafica1.imprimirMatriz();
        System.out.println("\nMatriz de adyacencia de G2");
        grafica2.imprimirMatriz();
        System.out.println();
        calcular.esIsomorfica(grafica1,grafica2);

    }
}


