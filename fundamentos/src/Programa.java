public class Programa{
    public static void main(String[] args) {
        Calcular calcular=new Calcular();
        Grafica grafica1=new Grafica(6);
        Grafica grafica2=new Grafica(6);

        grafica1.setConexiones(1,2);
        grafica1.setConexiones(1,6);
        grafica1.setConexiones(2,1);
        grafica1.setConexiones(2,3);
        grafica1.setConexiones(2,5);
        grafica1.setConexiones(3,2);
        grafica1.setConexiones(3,4);
        grafica1.setConexiones(3,6);
        grafica1.setConexiones(4,3);
        grafica1.setConexiones(4,5);
        grafica1.setConexiones(5,2);
        grafica1.setConexiones(5,4);
        grafica1.setConexiones(5,6);
        grafica1.setConexiones(6,1);
        grafica1.setConexiones(6,3);
        grafica1.setConexiones(6,5);

        grafica2.setConexiones(1,2);
        grafica2.setConexiones(1,6);
        grafica2.setConexiones(2,1);
        grafica2.setConexiones(2,3);
        grafica2.setConexiones(2,6);
        grafica2.setConexiones(3,2);
        grafica2.setConexiones(3,4);
        grafica2.setConexiones(3,5);
        grafica2.setConexiones(4,3);
        grafica2.setConexiones(4,5);
        grafica2.setConexiones(5,3);
        grafica2.setConexiones(5,4);
        grafica2.setConexiones(5,6);
        grafica2.setConexiones(6,1);
        grafica2.setConexiones(6,2);
        grafica2.setConexiones(6,5);

       /* grafica1.setConexiones(1,4);
        grafica1.setConexiones(1,2);
        grafica1.setConexiones(2,5);
        grafica1.setConexiones(2,3);
        grafica1.setConexiones(3,2);
        grafica1.setConexiones(3,5);
        grafica1.setConexiones(3,4);
        grafica1.setConexiones(4,1);
        grafica1.setConexiones(4,5);
        grafica1.setConexiones(4,3);
        grafica1.setConexiones(5,4);
        grafica1.setConexiones(5,3);
        grafica1.setConexiones(5,2);


        grafica2.setConexiones(1,2);
        grafica2.setConexiones(1,3);
        grafica2.setConexiones(1,5);
        grafica2.setConexiones(2,1);
        grafica2.setConexiones(2,3);
        grafica2.setConexiones(3,1);
        grafica2.setConexiones(3,2);
        grafica2.setConexiones(3,4);
        grafica2.setConexiones(4,3);
        grafica2.setConexiones(4,5);
        grafica2.setConexiones(5,4);
        grafica2.setConexiones(5,1);*/

        grafica1.imprimirMatriz();
        System.out.println();
        grafica2.imprimirMatriz();
        calcular.esIsomorfica(grafica1,grafica2);




    }

    }


