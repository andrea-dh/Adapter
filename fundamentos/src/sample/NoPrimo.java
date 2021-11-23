package sample;

public class NoPrimo {
    public static void main(String[] args) {
        int numero,i;
        numero = 101;
        boolean primo = true;

        for (i=2; i<numero; i++)
        if (numero % i == 0) {
            primo = false;
            System.out.println("El numero "+numero+" es un numero no primo");
            break;
        }
        if (primo) {
            System.out.println("El numero "+numero+" es un numero primo");
        }
    }
}
