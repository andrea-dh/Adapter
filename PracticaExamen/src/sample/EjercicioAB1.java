package sample;
public class EjercicioAB1 {
    public static void main(String[] args) {
        //Hacer un algoritmo que almacene números en una matriz de 5 * 6.
        // Imprimir la suma de los números almacenados en la matriz.
        int matriz[][] = new int[5][6];
        int[] sumas = new int[6];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                //escoger numeros aleatorios para la matriz
                matriz[i][j] = (int) (Math.random() * 50);
            }
        }

//tablita
        System.out.print("\t");
        for(int j=0;j<6;j++) {
            //numeros de 0 al 5
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.print("\t");
        for(int j=0;j<6;j++){
            //linea vertical del 0 al 5
            System.out.print("|\t");
        }
        System.out.println();
        for(int i=0;i<5;i++) {
            //numeros del 0 al 5
            System.out.print(i + "--\t"); //lineas horizontales que separan
                for(int j=0;j<6;j++){
                    //imprimir los numeros aleatorios
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println();

            }


        for (int i = 0; i < 5; i++) {
            //sumar los numeros en la matriz
            for (int j = 0; j < 6; j++) {
                suma = suma + matriz[i][j];
                sumas[j] = sumas[j] + matriz[i][j];

            }
        }
        System.out.println("La suma de los numeros almacenados en la matriz es de: "+suma);

    }
}