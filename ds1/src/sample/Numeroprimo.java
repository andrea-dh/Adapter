package sample;

public class Numeroprimo {
    public static void main(String[] args) {
        int numero = 5000000;
        int total = 0;
        int num2=numero;


        while (numero>2){
            numero=numero-1;
            boolean primo=true;
            for(int i=2; i<numero; i++){
                if (numero%i==0){
                    primo=false;
            }

                }
            if (primo){
                System.out.println(numero);
                total++;
            }

        }
        System.out.println("El número "+num2+" contiene "+total+" números primos.");

        }
    }


