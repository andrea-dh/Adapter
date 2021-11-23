package sample;

public class Parametros {
    public static void main(String[] args) {
        if(args.length==0) System.out.println("No hay argumentos");
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        int[] numeros=new int[args.length];
        for (int i=0;i<args.length;i++){
            numeros[i]=Integer.parseInt(args[i]);
        }
        int suma=0;
        for (int i=0;i<numeros.length;i++){
            suma=suma+numeros[i];
        }
        System.out.println(suma);
    }
}