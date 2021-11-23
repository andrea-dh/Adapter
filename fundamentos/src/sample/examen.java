package sample;

public class examen {
    public static void main(String[] args) {

        int arreglo[][] = new int[3][3], valor=0,freq[]= new int[9];

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j]=(int)(Math.random()*6);
                System.out.println(arreglo[i][j]+"\t"+" Posicion i: "+i+"\t Posicion j: "+j);
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                freq[arreglo[i][j]]++;
                }

            }


        int largest = 0;
        int mode = -1;

        for (int i = 0; i < 9; i++) {
            if (freq[i] > largest)
            {
                largest = freq[i];
                mode = i;
            }
        }
        System.out.println("modal score is: " +mode);



    }



    }

