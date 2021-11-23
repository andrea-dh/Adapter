package baseDeDatos;/*
    Java v14.0.2        Creado: 12/agosto/2021

    Materia: Base de Datos I

    Autor: Andrea Duarte Hernández
    Copyright (c)
 */
import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.text.*;
import java.time.*;
import java.util.*;

/*
    Programa que procesa los datos almacenados en el archivo vendors-data.csv y muestra un
    reporte que incluye el código del vendedor, su nombre y fecha de nacimiento de los vendedores
    con más de 30 años. Este programa tambien muestra un reporte que incluye cuantos vendedores
    hay en cada estado.
 */
public class VendorsData {
    public static void main(String[] args) {
        BufferedReader br = null;
        String linea = null;
        ArrayList<String> estados = new ArrayList<>();

        long t1 = System.currentTimeMillis();
        try {
            br = new BufferedReader(new FileReader("vendors-data.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            br.readLine();                              //para que lea la primera linea y en el while solo tenga los vendedores
            System.out.println("---------------LISTA DE VENDEDORES MAYORES A 30 AÑOS---------------\n");
            while ((linea = br.readLine()) != null) {
                reporteMayores30(linea);
                estados.add(estadoDelVendedor(linea));
            }
            System.out.println("------------------LISTA DE VENDEDORES POR ESTADO------------------\n");
            vendedoresPorEstado(estados);
        } catch (IOException e) {
            e.printStackTrace();
        }

        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }

    /*
     El siguiente método imprime el registro de los vendedores de más de 30 años con los siguientes datos:
     el código del vendedor, nombre y fecha de nacimiento.
     */
    public static void reporteMayores30(String registro){
        int edad = getEdad(registro);
        StringTokenizer st = new StringTokenizer(registro, ",");

        if(edad > 30){

            st.nextToken();
            System.out.println("Nombre del vendedor: " + st.nextToken());
            System.out.println("Edad: "+edad);
           System.out.println("Fecha de nacimiento: " + st.nextToken());
        }
    }

    //  El siguiente método calcula la edad con las clases de Java de tiempo
    public static int getEdad(String registro){
        LocalDate fechaNacimiento = getFechaNacimiento(registro);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        return edad.getYears();
    }


    //  El siguiente método le da el mismo formato a todas las fechas de nacimiento
    public static LocalDate getFechaNacimiento(String registro){
        String[] campo = registro.split(",");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
        try {
            Date date = sdf.parse(campo[2]);
            LocalDate fecha = LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
            return fecha;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    //  El siguiente método regresa el estado al que pertenece el vendedor
    public static String estadoDelVendedor(String registro){
        String[] campo = registro.split(",");
        String estado = campo[3];
        return estado;
    }

    //  El siguiente método obtiene mediante bucles la cantidad de vendedores por estado
    public static void vendedoresPorEstado(ArrayList<String> listaEstados) {
        int contador;

        for (int i = 0; i < listaEstados.size(); i++) {
            contador = 1;
            for (int j = i+1; j < listaEstados.size(); j++) {
                if (listaEstados.get(i).equals(listaEstados.get(j))) {
                    contador++;
                    listaEstados.set(j, "0");
                }
            }
            if (contador>1 && listaEstados.get(i)!="0") {
                System.out.println("Hay " + contador + " vendedores en " + listaEstados.get(i));
            }
        }
    }

}

