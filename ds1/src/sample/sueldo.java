package sample;

public class sueldo{
    public static void main(String[] args) {

    /* Programa que calcula el sueldo co: horas trabajadas, sexo (M o F), sueldo por hora, bonos (porcentaje de aumento)
    calcular sueldo
    si las horas trabajadas son mas que 40, las sobrantes se pagan doble
    sexo M se paga normal, sexo F se paga un bono de 10% extra
    si en bono hay un valor ese valor puede ir de 0 a 100 y representa un porcentaje de aumento
     */

        int ht;
        char s;
        float sph, sueldo, fembono;
        float bono;
        float extra, sueldoNormal, sueldoExtra;

        ht = 45;
        s = 'M';
        sph = 25.60f;
        bono = 15;

        if (ht > 40) {
            extra = ht - 40;
            ht = 40;
        } else {
            extra = 0;
        }

        sueldoNormal = ht * sph;
        sueldoExtra = extra * sph * 2;
        sueldo = sueldoNormal + sueldoExtra;


        if (s == 'F') {
            fembono = (float) (sueldo * 0.10);
            sueldo = sueldo + fembono;
        }else{
                fembono = 0;
            }
            if (bono >= 0 && bono <= 100) {
                bono = sueldo * (bono / 100);
                sueldo = bono + sueldo;
            }else{
                    bono = 0;
                }
        System.out.println("Horas Trabajadas = " + ht);
        System.out.println("Sueldo por Hora = " + sph);
        System.out.println("Sueldo Normal = " + sueldoNormal);
        System.out.println("Horas extra = " + extra);
        System.out.println("Sueldo con Horas extra = " + sueldoExtra);
        System.out.println("bono = " + bono);
        System.out.println("sexo = " + s);
        if (s=='F')
            System.out.println("Bono por ser mujer = " + fembono);
        System.out.println("Sueldo final = " + sueldo);

            }
        }