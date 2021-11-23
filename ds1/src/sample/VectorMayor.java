package sample;

public class VectorMayor {
    public static void main(String[] args) {
        Cosas h = new Cosas();
        int n1 = 50;
        int n2 = 34;
        int n3 = 46;
        int n4 = 32;
        int n5 = 9;
        int c =0;

        int cant = 0;
        if (args.length > 0) {
            cant = Integer.parseInt(args[0]);
        }
        int[] num;
        if (cant > 0) {
            num = new int[cant];
        } else {
            num = new int[h.leerentero("Cuantos elementos quieres?")];


            for (int i = 0; i < num.length; i++) {
                num[i] = (int) (Math.random() * 100);
                //num[i]= h.leerentero("Dame el valor numero: "+(i+1));
            }
            int[] copia = new int[num.length];
            for (int i = 0; i < num.length; i++) {
                copia[i] = num[i];
            }
            for(int j=0;j<copia.length;j++) {
                int menor = -10000000;
                int ubi = -1;
                for (int i = j; i < copia.length; i++) {
                    if (copia[i] > menor) {
                        menor = copia[i];
                        ubi = i;
                    }
                }
                int temp=copia[j];
                copia[j]=copia[ubi];
                copia[ubi]=temp;
            }
            for(int i=0;i<num.length;i++){
                System.out.println(num[i]+"\t"+copia[i]);
            }
            for (int i = 0; i < num.length; i++){
                c=(Math.min(copia[i],num[i]));
            }
            System.out.println("Numero menor: "+c);
        }
    }
}
