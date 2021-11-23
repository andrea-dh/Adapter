package EjerciciosDS2.Luis;


import java.util.Scanner;

public class PersonaEjecutable {
    public static void main(String[] args) {
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

        Persona p1=new Persona(nombre, edad, sexo, peso, altura );
        Persona p2= new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        p3.setAltura(altura);
        p3.setPeso(peso);
        p3.setEdad(edad);
        p3.setNombre(nombre);
        p3.setSexo(sexo);
        comprobarPeso(p1);
        comprobarPeso(p2);
        comprobarPeso(p3);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        imprimirMayorDeEdad(p1);
        imprimirMayorDeEdad(p2);
        imprimirMayorDeEdad(p3);


    }
    public static void imprimirMayorDeEdad(Persona p){
        if(p.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("No es mayor de edad");

        }
    }
    public static void comprobarPeso(Persona p){
        if(p.calcularIMC()==-1){
            System.out.println("Esta por debajo del peso ideal");
        }
        if(p.calcularIMC()==0){
            System.out.println("Esta en el peso ideal");
        }
        if(p.calcularIMC()==1){
            System.out.println("Tiene sobrepeso");
        }

    }
}
