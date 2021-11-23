/*
    Java v14.0.2        Creado: 1/septiembre/2021

    Materia: Desarrollo de Sistemas III

    Autor: Andrea Duarte Hernández
    Copyright (c)
 */
package randomfile;

import java.util.Enumeration;
import java.util.Hashtable;

/*
    Programa que procesa los datos almacenados en el archivo vendors-data.dat y muestra un
    reporte que incluye el código del vendedor, su nombre y fecha de nacimiento de los vendedores
    con más de 30 años. Este programa tambien muestra un reporte que incluye cuantos vendedores
    hay en cada estado.
 */

public class VendorsDAT {
    public static void main(String[] args) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        RandomVendorFile randomFile = new RandomVendorFile(args[0]);
        Vendor vendor;

        long t1 = System.currentTimeMillis();
        System.out.println("-----------------------------VENDEDORES MAYORES DE 30 AÑOS-----------------------------");
        for (int i = 1; i <= 100; i++) {
            int pos = (i*Vendor.RECORD_LEN) - Vendor.RECORD_LEN;
            vendor = randomFile.read(pos);
            String ciudad = vendor.getZona();
            int edad = vendor.getEdad();
            if(edad>30){
                System.out.printf("Código: %-6d Nombre: %15.25s Fecha de Nacimiento: %tm/%td/%-10tY Edad: %d\n",
                        vendor.getCodigo(), vendor.getNombre(), vendor.getFecha(), vendor.getFecha(), vendor.getFecha(), edad);
            }
            if(tabla.containsKey(ciudad)){
                int contador = tabla.get(ciudad);
                tabla.put(ciudad, contador+1);
            }
            else{
                tabla.put(ciudad, 1);
            }

        }

        Enumeration<String> keys = tabla.keys();

        System.out.println("\n-----------------------------VENDEDORES POR ESTADO-----------------------------");
        while(keys.hasMoreElements()){
            String ciudad = keys.nextElement();
            System.out.printf("%15s %4d\n", ciudad, tabla.get(ciudad));
        }

        long t2 = System.currentTimeMillis();

        System.out.println(t2-t1);

    }

}
