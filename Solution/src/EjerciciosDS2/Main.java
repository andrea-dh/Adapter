package EjerciciosDS2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* EJERCICIO CUENTA
        Cuenta cuenta=new Cuenta("Andrea",550);
        System.out.println(cuenta);
        System.out.println(cuenta.ingresar(200.1));
        System.out.println(cuenta.retirar(1000));
        System.out.println(cuenta);
        */

        String nombre="";
        int edad = 0;
        char sexo='H';
        double peso = 0, altura=0;

        Scanner leer=new Scanner(System.in);
        System.out.println("Nombre:");
        nombre=leer.nextLine();
        System.out.println("Edad:");
        edad=leer.nextInt();
        System.out.println("Sexo ('H' hombre, 'M' mujer)");
        sexo=leer.next().charAt(0);
        System.out.println("Peso en kg:");
        peso=leer.nextDouble();
        System.out.println("Altura en metros:");
        altura=leer.nextDouble();

        Persona p1;
        Persona p2;
        Persona p3;

        p1=new Persona(nombre,edad,sexo,peso,altura);
        p2=new Persona(nombre,edad,sexo);
        p3=new Persona();
        set(p3);

        System.out.println("Persona 1:");
        imprimirIMC(p1);
        imprimirMayorDeEdad(p1);
        System.out.println(p1);

        System.out.println("Persona 2:");
        imprimirIMC(p2);
        imprimirMayorDeEdad(p2);
        System.out.println(p2);

        System.out.println("Persona 3:");
        imprimirIMC(p3);
        imprimirMayorDeEdad(p3);
        System.out.println(p3);



    }

    public static void set(Persona p){
        p.setAltura(1.56);
        p.setEdad(19);
        p.setNombre("Andrea");
        p.setSexo('M');
        p.setPeso(57.8);
    }

    public static void imprimirIMC(Persona p){
        if(p.calcularIMC()==-1) System.out.println("Bajo peso");
        if(p.calcularIMC()==0) System.out.println("Peso normal");
        if(p.calcularIMC()==1) System.out.println("Sobrepeso");

    }

    public static void imprimirMayorDeEdad(Persona p){
        if(p.esMayorDeEdad()) System.out.println("Es mayor de edad");
    }



}
