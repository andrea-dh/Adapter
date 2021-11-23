package baseDeDatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
/*
 * Base de datos I
 *
 * Procesamiento de archivos csv
 *
 * 14/08/2021
 *
 * Alumno: David Nuñez Gurrola
 *
 * Version 1
 */
public class Reporte_Vendedores {
    public static void main(String[] args) {
        FileReader fin = null;
        BufferedReader leer = null;
        String registro = null;
        try {
            fin = new FileReader("vendors-data.dat");
            leer = new BufferedReader(fin);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // creacion de Arrays y listas
        ArrayList<String> listaEdos=new ArrayList<>();
        System.out.println("|||||||||||||||||||Reporte de vendedores mayores de 30 años||||||||||||||||\n");
        try {
            leer.readLine();                                                // le di que leyera una linea porque el primer renglon no contiene informacion
            while ((registro = leer.readLine()) != null) {
                solo30(registro);
                String[] partido = registro.split(",");
                listaEdos.add(partido[3]);                                  // se llena la lista de los Estados
            }
            System.out.println("||||||||||||||||||Reporte de vendedores por Estado|||||||||||||||||||||||\n");
            getFrecuenciaEdos(listaEdos);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    // Este metodo sirve para obtener la edad de la persona usando getDate
    public static int getEdad(String registro) throws ParseException {
        String[] partes = registro.split(",");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
        Date fecha = sdf.parse(partes[2]);                                        // se crea el objeto Date del registro partido
        String[] parte = registro.split(",");
        LocalDate nacimiento= LocalDate.ofInstant(fecha.toInstant(), ZoneId.systemDefault());
        Period diferencia= Period.between(nacimiento,LocalDate.now());
        return diferencia.getYears();
    }
    // Este metodo checa a los vendedores y muestra la información a solo mayores de 30 años  Codigo, nombre y fecha de nacimiento
    public static void solo30(String registro) throws ParseException {
        String[] partes=registro.split(",");
        if (getEdad(registro)>30){
            System.out.println("Código= "+partes[0]+"\nNombre= "+partes[1]+"\nFecha de nacimiento= "+partes[2]+"\nEdad= "+getEdad(registro)+"\n");
        }
    }
    // Este metodo recibe la lista con los estados y cuenta la frecuencia y se imprime el mismo estado una vez.
    public static void getFrecuenciaEdos(ArrayList<String> estados){
        int contador;
        for (int i = 0; i < estados.size(); i++) {
            contador=1;
            for (int j = i+1; j < estados.size(); j++) {
                if (estados.get(i).equals(estados.get(j))){
                    contador++;
                    estados.set(j,"");
                }
            }
            if ((contador>1) && (!estados.get(i).equals(""))){
                System.out.println("Tiene "+contador+" vendedores el estado de "+estados.get(i)+"\n");
            }
        }
    }
}