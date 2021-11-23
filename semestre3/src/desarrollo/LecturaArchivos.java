/*
    Java v14.0.2        Creado: 20/agosto/2021

    Materia: Desarrollo de Sistemas III

    Autor: Andrea Duarte Hernández
    Copyright (c)
 */
package desarrollo;
import java.io.*;
import java.util.*;

/*
    Desarrollar una aplicación que construya un histograma
    con la longitud en carácteres de cada palabra que contiene
    el archivo. El histograma de mostrar cuántas palabras de
    longitud 1, cuántas palabras de longitud 2, cuántas longitud 3
    y así sucesivamente. El histograma de debe mostrar en consola y
    además se debe almacenar en un archivo de texto.

 */
public class LecturaArchivos {
    public static void main(String[] args) {
        Scanner s = null;
        TreeMap<Integer, Integer> tabla = new TreeMap<>();      // Guarda los datos de forma ordenada
        String file = "divina_comedia.txt";

        try{
            s = new Scanner(new BufferedReader(new FileReader(file)));

            while(s.hasNext()){
                String palabra = s.next();
                int num_caracteres = palabra.length();
                s.useDelimiter("\\W+");     // Descomentar esta línea si se quieren omitir símbolos como -_/!.,


                try{
                    Double.parseDouble(palabra);
                } catch (NumberFormatException e){
                    if(tabla.containsKey(num_caracteres)){
                        int contador = tabla.get(num_caracteres);
                        tabla.put(num_caracteres, contador+1);
                    }
                    else{
                        tabla.put(num_caracteres, 1);
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Set set = tabla.entrySet();
        Iterator i = set.iterator();
        FileWriter fw = null;
        try {
            fw = new FileWriter("histograma.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter output = new PrintWriter(fw);


        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            String mensaje = "Palabras con "+me.getKey() + " caracteres: "+me.getValue()+"\n";
            output.print(mensaje);
            System.out.print(mensaje);
    }
        output.close();
}

    }

