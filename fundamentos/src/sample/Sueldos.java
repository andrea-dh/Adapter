package sample;

public class Sueldos {
    public static void main(String[] args) {
        //Imprimir y contar los multiplos de 3 desde la unidad hasta un numero que
        //introducimos por teclado.
        int n, c;
        n=39;
        c=0;

        for(int i=0; i<n; i++){
            if (i%3==0) {
                System.out.println(i);
                c++;
            }

        }

        System.out.println("Multiplos de 3= "+c);

    }


}
