package sample;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nCuenta, saldoInicial, cargos, creditos, limite, balance;

        System.out.println("Escriba su número de cuenta:");
        nCuenta=leer.nextInt();
        System.out.println("Escriba el saldo al inicio del mes:");
        saldoInicial=leer.nextInt();
        System.out.println("Escriba el total de los articulos cargados por el cliente en el mes:");
        cargos=leer.nextInt();
        System.out.println("Escriba el total de los creditos aplicados a la cuenta del cliente en el mes:");
        creditos=leer.nextInt();
        System.out.println("Escriba el limite de credito permitido:");
        limite=leer.nextInt();


        balance=saldoInicial+cargos-creditos;
        System.out.println("El saldo actual del cliente "+nCuenta+" es de: "+balance);
        if (creditos>limite) System.out.println("Se excedió el límite de su crédito");
    }
}
