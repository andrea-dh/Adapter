package sample;

public class MetodosLunes {

        public static void main(String[] args) {
            Cosas h=new Cosas();
            int ren= h.leerentero("Dame cuantos Renglones");
            int col= h.leerentero("Dame cuantas Columnas");
            int matriz[][]=new int[ren][col];
            int[] sumas=new int[matriz[0].length];
            System.out.println(matriz.length);
            System.out.println(matriz[0].length);

            for(int i=0;i<matriz.length;i++){
                matriz[i][6]=7;
            }
            
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[0].length;j++){
                    matriz[i][j]=(int)(Math.random()*50);
                }
            }
            System.out.print("\t");
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
            System.out.print("\t");
            for(int j=0;j<matriz[0].length;j++){
                System.out.print("|\t");
            }
            System.out.println();
            for(int i=0;i<matriz.length;i++){
                System.out.print(i+"-\t");
                int suma=0;
                for(int j=0;j<matriz[0].length;j++){
                    System.out.print(matriz[i][j]+"\t");
                    suma=suma+matriz[i][j];
                    sumas[j]=sumas[j]+matriz[i][j];
                }
                System.out.print("\t"+suma);
                System.out.println();
            }
            System.out.println();
            System.out.print("\t");
            int stotal=0;
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(sumas[j]+"\t");
                stotal=stotal+sumas[j];
            }
            System.out.println("\t"+stotal);
            int elemento= h.leerentero("Dame un valor a buscar");
            boolean bandera=false;
            int variable=0;
            for(int i=0;i<matriz.length;i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if(matriz[i][j]==elemento){
                        System.out.println("El Número "+elemento+" está en el Renglor "+i+" Columna "+j);
                        bandera=true;
                        variable++;
                    }
                }
            }
            if(!bandera) {
                System.out.println("No se encuentra");
            }
            else{
                System.out.println("Estaba "+variable+" veces");
            }

            for(int i=0;i<matriz[0].length;i++){
                sumas[i]=0;
            }

            System.out.print("\t");
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
            System.out.print("\t");
            for(int j=0;j<matriz[0].length;j++){
                System.out.print("|\t");
            }
            System.out.println();
            for(int i=0;i<matriz.length;i++){
                System.out.print(i+"-\t");
                int suma=0;
                for(int j=0;j<matriz[0].length;j++){
                    System.out.print(matriz[i][j]+"\t");
                    suma=suma+matriz[i][j];
                    sumas[j]=sumas[j]+matriz[i][j];
                }
                System.out.print("\t"+suma);
                System.out.println();
            }
            System.out.println();
            System.out.print("\t");
            stotal=0;
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(sumas[j]+"\t");
                stotal=stotal+sumas[j];
            }
            System.out.println("\t"+stotal);

        }
    }

