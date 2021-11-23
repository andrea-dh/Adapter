package sample;

import java.util.Scanner;

public class CalifAlumnos {
    public static void main(String[] args) {
        int calif, mayor=0, menor=10, i;
        float prom, sum=0;
        String alumnmayor =null, alumnmenor=null;
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el numero de alumnos: ");
        int n = leer.nextInt();

        int a[]= new int[n];
        String nombre[] = new String[n];

        for (i = 0; i < n; i++) {
            System.out.print("Introduce el nombre del alumno: ");
            nombre[i] = leer.next();
            while (i<n) {
                System.out.println("Introduce la calificación");
                calif = leer.nextInt();
                if (calif >= 0 && calif <= 10) {
                    a[i] = calif;
                    sum = sum + a[i];
                    break;
                } else i--;
            }
        }


        System.out.println("CALIFICACIONES");
        for (i=0; i<n; i++){
            System.out.println("Alumno: "+nombre[i]+"\t Calificación: "+a[i]);
            if (a[i]<menor) {
                menor=a[i];
                alumnmenor=nombre[i];
            }
            if (a[i]>mayor) {
                mayor=a[i];
                alumnmayor=nombre[i];
            }
        }



        prom=sum/n;
        System.out.println("PROMEDIO => "+prom);
        System.out.println("ALUMNO CON CALIF MAS ALTA => "+alumnmayor+ " CALIF: "+mayor);
        System.out.println("ALUMNO CON CALIF MAS BAJA => "+alumnmenor+ " CALIF: "+menor);





            }
        }
