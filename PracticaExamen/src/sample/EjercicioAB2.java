package sample;


public class EjercicioAB2 {
    public static void main(String[] args) {
        //salen numeros repetidos


        //Hacer un algoritmo que llene una matriz de 10 * 10 y
        // determine la posición [renglon ,columna] del numero mayor almacenado en la matriz.
        // Los números son diferentes.

        int matriz[][] = new int[10][10];

        int a=0, cant=100, rango=101;
        int arreglo[]=new int[cant];

        int mayor=0;
        int puntox=0;
        int puntoy=0;

//siguen saliendo repetidos
        arreglo[a]=(int)(Math.random()*rango);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a=1;
                a++;
                    arreglo[a]=(int)(Math.random()*rango);
                    for(int b=0; b<1; b++){
                        if (arreglo[a]==arreglo[b]){
                            a--;
                        }
                        matriz[i][j]=arreglo[a];
                    }

                }

            }


        //tablita
        System.out.print("\t");
        for(int j=0;j<10;j++) {
            //numeros de 0 al 5
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.print("\t");
        for(int j=0;j<10;j++){
            //linea vertical del 0 al 5
            System.out.print("|\t");
        }
        System.out.println();
        for(int i=0;i<10;i++) {
            //numeros del 0 al 5
            System.out.print(i + "--\t"); //lineas horizontales que separan
            for(int j=0;j<10;j++){
                //imprimir los numeros aleatorios
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();

        }


        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                    puntox=i;
                    puntoy=j;
                }
            }
        }
        System.out.println("Numero mayor es: "+mayor+"\n UBICADO EN EL PUNTO ["+puntox+", "+puntoy+"]");
    }
    }