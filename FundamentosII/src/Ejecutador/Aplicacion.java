package Ejecutador;

import Grupos.Familia;
import Humanos.Persona;

import java.awt.*;
import java.util.Date;

//Andrea Duarte Hernandez, examen 2
public class Aplicacion {
    public static void main(String[] args){
        Persona madre=new Persona("Liliana",true,new Date(74,3,1), Color.black,154,"Mamá");
        Persona padre=new Persona("Manuel",false,new Date(70,6,5), Color.black,170,"Papá");
        Persona madreF2=new Persona("Maria",true,new Date(80,2,14), Color.cyan,170,"Mamá soltera");
        Persona madreF3=new Persona("Patricia",true,new Date(79,12,31), Color.green,160,"Mamá Familia 3");
        Persona padreF3=new Persona("Jacobo",false,new Date(75,10,31), Color.GRAY,180,"Papá Familia 3");


        Familia f1=new Familia(madre,padre,"Duarte","Hernández");
        f1.agregarHijo(new Persona("Andrea",true,new Date(101,7,3), Color.black,157,"Hija menor"));
        f1.agregarHijo(new Persona("Lili",true,new Date(99,4,21), Color.black,154,"Hija de en medio"));
        f1.agregarHijo(new Persona("Manuel Jr",true,new Date(97,9,8), Color.black,170,"Hijo mayor"));

        Familia f2=new Familia(madreF2,"Contreras");
        f2.agregarHijo(new Persona("Michelle",true,new Date(102,5,23), Color.cyan,175,"Hija de Maria, amiga de Andrea"));

        Familia f3 = new Familia (madreF3,"Olivas");
        f3=new Familia(madreF3,padreF3,"Olivas","Palomares", f3.getHijos(),"Familia pequeña");
        f3.agregarHijo(new Persona("Susana",true,new Date(101,9,28), Color.orange,160,"Amiga de Andrea"));

        for (int i = 0; i < 3; i++) {
            f1.getHijos().get(i).actualizarEstatura((int)(Math.random()*35+150));
            System.out.println("Estatura hijo "+(i+1)+": "+f1.getHijos().get(i).getEstatura());
        }
        System.out.println("Edad de la madre: "+f1.getMadre().edad());

        f2.getHijos().get(0).actualizarEstatura(173);
        System.out.println("Estatura hijo "+f2.getHijos().get(0).getEstatura());
        System.out.println("Edad de la hija: "+f2.getHijos().get(0).edad());

        f3.getHijos().get(0).actualizarEstatura(159);
        System.out.println("Estatura hijo "+f3.getHijos().get(0).getEstatura());
        System.out.println("Edad del padre: "+f3.getPadre().edad());

    }
}
