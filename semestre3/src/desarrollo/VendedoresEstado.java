package desarrollo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VendedoresEstado {
    public static void main(String[] args) {
        BufferedReader br = null;
        String linea;
        int numVendedores = 0;

        try {
            br = new BufferedReader(new FileReader("vendors-data.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            br.readLine(); //para que lea la primera linea y en el while solo tenga los vendedores
            System.out.println("------------------LISTA DE VENDEDORES POR ESTADO------------------\n");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                System.out.println(numVendedores);
            }


            //vendedoresPorEstado(listaEstados(br, numVendedores));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String estadoDelVendedor(String registro){
        String[] campo = registro.split(",");
        String estado = campo[3];
        return estado;
    }


    public static void vendedoresPorEstado(String[] listaEstados){
        int contador;
        for (int i = 0; i < listaEstados.length; i++) {
            contador=1;
            for (int j = 0; j < listaEstados.length; j++) {
                if(listaEstados[i] == listaEstados[j]){
                    contador++;
                    listaEstados[j]="0";
                }
            }
            if(contador>1 && listaEstados[i] != "0"){
                System.out.println("Hay "+contador+" vendedores en "+listaEstados[i]);
            }
        }

    }
}
