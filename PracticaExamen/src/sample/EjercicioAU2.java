package sample;

import java.util.Scanner;
public class EjercicioAU2 {
    public static void main(String[] args) {
        int[] calif;
        int a = 0,b=0, c = 0,d = 0,e = 0,f = 0,g=0;
        calif = new int[6];
        int alumn[]=new int[5];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i <= alumn.length; i++) {
            System.out.println("Ingrese la calificación del alumno " + i);
            calif[i] = leer.nextInt();
            if (calif[i] < 0 || calif[i] > 5) {
                System.out.println("Ingrese un numero entre 0 y 5");
                i = i - 1;
            }
        }


        System.out.println("INTERVALOS");
        for (int j = 0; j < calif.length; j++) {
            System.out.println("\t[" + j + "]");
        }

        System.out.println("FRECUENCIA ABSOLUTA");
        for (int i = 0; i < alumn.length; i++) {
            switch (calif[i]){
                case 0:{
                    g++;
                    continue;
                }
                case 1:{
                    b++;
                    continue;
                }
                case 2:{
                    c++;
                    continue;
                }
                case 3:{
                    d++;
                    continue;
                }
                case 4:{
                    e++;
                    continue;
                }
                case 5:{
                    f++;
                    continue;
                }
            }
        }
        System.out.println("\t\t"+g);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}