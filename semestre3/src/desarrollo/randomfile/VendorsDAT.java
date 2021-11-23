/*
    Java v14.0.2        Creado: 1/septiembre/2021

    Materia: Desarrollo de Sistemas III

    Autor: Andrea Duarte Hernández
    Copyright (c)
 */
package desarrollo.randomfile;

import java.util.Date;
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
        Vendor vendor[] = new Vendor[100];
        Vendor allVendors[] = randomFile.readFile(100);
        String zona = null;
        int edad = 0;
        Date fecha = null;

        long t1 = System.currentTimeMillis();
        System.out.println("-----------------------------VENDEDORES MAYORES DE 30 AÑOS-----------------------------");
        for (int i = 0; i < 100; i++) {
            vendor[i] = allVendors[i];
            zona = vendor[i].getZona();
            edad = vendor[i].getEdad();
            fecha = vendor[i].getFecha();
            if(edad>30){
                System.out.printf("Código: %-6d Nombre: %15.25s Fecha de Nacimiento: %tm/%td/%-10tY Edad: %d\n",
                        vendor[i].getCodigo(), vendor[i].getNombre(), fecha, fecha, fecha, edad);
            }
            if(tabla.containsKey(zona)){
                int contador = tabla.get(zona);
                tabla.put(zona, contador+1);
            }
            else{
                tabla.put(zona, 1);
            }

        }

        Enumeration<String> keys = tabla.keys();

        System.out.println("\n-----------------------------VENDEDORES POR ESTADO-----------------------------");
        while(keys.hasMoreElements()){
            String ciudad = keys.nextElement();
            System.out.printf("%15s %4d\n", ciudad, tabla.get(ciudad));
        }

        long t2=System.currentTimeMillis();

        System.out.println(t2-t1);

    }

}
