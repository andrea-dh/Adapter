package sample;

public class Ejercicio320 {
    public static void main(String[] args) {

        /*

    La funcion f(x) = x^2 +2x−1 tiene una solucion en el intervalo [0, 1], puesto que f(0) = −1 y f(1) = 2. Esta
    soluci´on se puede aproximar de la siguiente forma, se toma a = 0 y b = 1 y mientras b−a no sea lo sufientemente
    pequeno˜ o no se haya encontrado la soluci´on, se calcula el punto medio del intervalo [a, b], c = (a + b)/2 y se
    hace lo siguiente: 
    Si f(c) = 0,
         */

        double a, b;
        double res = 0, pm=0;

        a = 0;
        b = 1;


            for (int i = 0; i < 50; i++) {
                pm = (a + b) / 2;
                res = (pm * pm) + (2 * pm) - 1;
                if (res > 0) {
                    b=pm;
                    a=a;
                }
                if (res < 0) {
                    a=pm;
                    b=b;
                }

            }
            System.out.println("La solución aproximada es de: " + pm);

        }
    }


