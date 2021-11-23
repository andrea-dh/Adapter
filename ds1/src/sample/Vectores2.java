package sample;

public class Vectores2 {
    public static void main(String[] args) {
        Cosas h= new Cosas();
        // programa ordene 5 numeros
        int cant=0;
        if(args.length>0) {
            //System.out.println(args[0]);
            cant=Integer.parseInt(args[0]);
        }
        int[] num;
        if(cant>0){
            num=new int[cant];
        }
        else{
            num=new int[h.leerentero("Cuantos elementos quieres?")];
        }
        //int[] num=new int[cant>0?cant:h.leerentero("Cuantos elementos quieres?")];
        int n1=50;
        int n2=34;
        int n3=46;
        int n4=32;
        int n5=9;
        /*
        if(n1>n2) {
            if(n1>n3){
                if(n1>n4){
                    if(n1>n5) //n1 es el mayor y va al final
                    else n5 es el mayor
                }
            }
        }
        int nume=0;
        nume=h.leerentero("Cuantos elementos quieres?");
        int[] num
        num=new int[nume];
 */
        /*
        num[0]=50;
        num[1]=34;
        num[2]=26;
        num[3]=32;
        num[4]=90;
        num[5]=20;
        num[6]=900;
        num[7]=10;
        */
        for(int i=0;i<num.length;i++){
            num[i]=(int)(Math.random()*100);
            //num[i]= h.leerentero("Dame el valor numero: "+(i+1));
        }
        int[] copia=new int[num.length];
        for(int i=0;i<num.length;i++){
            copia[i]=num[i];
        }
/*
        int[] copia2=num;

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]+" "+copia[i]+" "+copia2[i]);
        }
        System.out.println();
        num[0]=1000;
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]+" "+copia[i]+" "+copia2[i]);
        }
*/
        // ordenar copia

        //for   recorrer de principio a final
        for(int j=0;j<copia.length;j++) {
            //menor de los elementos que estan en un rango
            int menor = 102912802;
            int ubi = -1;
            for (int i = j; i < copia.length; i++) {
                if (copia[i] < menor) {
                    menor = copia[i];
                    ubi = i;
                }
            }
            //intercambiamos con el primero
            int temp=copia[j];
            copia[j]=copia[ubi];
            copia[ubi]=temp;
        }

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]+"\t"+copia[i]);
        }


/*
        int menor=102912802;
        int ubi=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]<menor){
                menor=num[i];
                ubi=i;
            }
        }
        h.imprime("El menor es: "+menor+" y esta ubicado en: "+(ubi+1));
        //System.out.println("El menor es: "+menor+" y esta ubicado en: "+ubi);

        int mayor=-99999999;
        int ubim=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]>mayor){
                mayor=num[i];
                ubim=i;
            }
        }
        h.imprime("El mayor es: "+mayor+" y esta ubicado en: "+(ubim+1));
        h.imprime("Mayor:"+num[ubim]+" Menor:"+num[ubi]
                + " La diferencia es:"+ (num[ubim]-num[ubi]));
*/
    }
}