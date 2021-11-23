package sample;


public class EjercicioAU4 {
    public static void main(String[] args) {
        //no me sale


        //un número entero es primo si ningún otro número es primo más pequeño que él es divisor suyo. Escribir un
        //programa que rellene un arreglo con los 80 primeros primos y los visualice.
        int num[] = new int[80];
        boolean primo = true;
        int n = 2;

        for (int x = 0; x < num.length; x++) {
            int i = 2;
            while (i<n) {
                if (n>2 && n % i == 0) {
                    primo=false;
                }
                i++;
            }

             if(primo){
            num[x] = n;
            n++;



            }
        }

            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);


            }

        }
    }

