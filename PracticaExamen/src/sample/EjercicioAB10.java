package sample;

public class EjercicioAB10 {
    public static void main(String[] args) {
        // Diseñe un pseudocódigo que escriba el numero de la hilera cuya suma sea mayor que
        //las demás hileras. Suponga que todas las hileras suman diferente cantidad.
        int matriz[][]=new int [4][4];
        int sum=0, mayor=-1000, c=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*(-50-(+50)+1)+50);
            }
        }

        //tablita
        System.out.print("\t");
        for(int j=0;j<matriz[0].length;j++) {
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.print("\t");
        for(int j=0;j<matriz[0].length;j++){
            System.out.print("|\t");
        }
        System.out.println();
        for(int i=0;i<matriz.length;i++) {
            System.out.print(i + "--\t"); //lineas horizontales que separan
            for(int j=0;j<matriz[i].length;j++){
                //imprimir los numeros aleatorios
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            sum=0;
            for (int j = 0; j < matriz[i].length; j++) {
                sum+=matriz[i][j];

            }
            System.out.println("Sumatoria de hilera "+i+" = "+sum);
            if(sum>mayor){
                mayor=sum;
                c=i;}
        }

        System.out.println("La hilera con la suma más grande es la "+c+" con una " +
                "sumatoria de "+mayor);

    }
}
