package sample;

public class primo {
    // primo: divisible entre 1 y el mismo solamente   1 ? , 2,3,5,7,11,....
    public static void main(String[] args) {
        int numero= 2;
        //ciclo  que revise la division entre todos los valores necesarios
        boolean primo=true;
        for(int i=2;i<numero;i++){
            //System.out.println(i+" "+(double)numero/i);
            if(numero%i==0){
                System.out.println("Es divisible entre "+i);
                System.out.println("no es primo");
                primo=false;
                break;
            }
        }
        if(primo) System.out.println("si es primo");
    }


    // imprimir si es primo ó  no es primo..
}

