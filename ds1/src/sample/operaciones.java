package sample;

public class operaciones {
    public static void main(String[] args) {
       /* Poner una fecha con tres variables
       dia
       mes
       año
       decir si es año bisiesto
       imprimir la fecha en forma de texto
       poner el dia de la semana
       ejemplo dia=26   mes=08  año=2020
       imprimo 2020 si es bisiesto
       imprimo miercoles 26 de agosto 2020




        String nombreDelMes="";
        int dia, mes, año, codigoSemana, codigoMes, codigoSiglo, moduloAño;
        String diaSemana="";
        codigoMes=0;
        codigoSiglo=0;


        Cosas tools=new Cosas();
        dia=tools.leerdia("Escribe el día");
        mes=tools.leermes("Escribe el mes en número");
        año=tools.leeraño("Escribe el año");


        moduloAño=año%100;

        if(mes==1){
            nombreDelMes="Enero";
            codigoMes=0;
        }
        if(mes==2){
            nombreDelMes="Febrero";
            codigoMes=3;
        }
        if(mes==3){
            nombreDelMes="Marzo";
            codigoMes=3;
        }
        if(mes==4){
            nombreDelMes="Abril";
            codigoMes=6;
        }
        if(mes==5){
            nombreDelMes="Mayo";
            codigoMes=1;
        }
        if(mes==6){
            nombreDelMes="Junio";
            codigoMes=4;
        }
        if(mes==7){
            nombreDelMes="Julio";
            codigoMes=6;
        }
        if(mes==8){
            nombreDelMes="Agosto";
            codigoMes=2;
        }
        if(mes==9){
            nombreDelMes="Septiembre";
            codigoMes=5;
        }
        if(mes==10){
            nombreDelMes="Octubre";
            codigoMes=0;
        }
        if(mes==11){
            nombreDelMes="Noviembre";
            codigoMes=3;
        }
        if(mes==12){
            nombreDelMes="Diciembre";
            codigoMes=5;
        }

        if(año%4==0 && (año%100!=0 || año%400==0)) {
            System.out.println("si es bisiesto");
        }

        if (año>=1600 && año<=1699 || año>=2000 && año<=2099) codigoSiglo=6;
        if (año>=1700 && año<=1799) codigoSiglo=4;
        if (año>=1800 && año<=1899) codigoSiglo=2;
        if (año>=1900 && año<=1999) codigoSiglo=0;

        codigoSemana=dia+codigoMes+(moduloAño)+(moduloAño/4)+codigoSiglo;
        codigoSemana=codigoSemana%7;

        if(codigoSemana==0 || codigoSemana==7) diaSemana="Domingo";
        if(codigoSemana==1) diaSemana="Lunes";
        if(codigoSemana==2) diaSemana="Martes";
        if(codigoSemana==3) diaSemana="Miércoles";
        if(codigoSemana==4) diaSemana="Jueves";
        if(codigoSemana==5) diaSemana="Viernes";
        if(codigoSemana==6) diaSemana="Sábado";

        System.out.println(diaSemana+ " " + dia + " de " + nombreDelMes + " de " + año);

*/
        }
    }

