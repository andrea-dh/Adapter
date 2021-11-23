package sample;

import java.io.*;

public class Archivos {
    public static void main(String[] args) throws IOException {
        File archivo=new File("/Users/andreadh/Downloads/Doc3.txt");
        System.out.println(archivo.exists());
        FileWriter lapiz= new FileWriter(archivo, true);


        lapiz.write("Hola mundo");
        lapiz.flush();
        BufferedWriter lapicero= new BufferedWriter(lapiz); //tiene la opcion de saltarse linea
        lapicero.newLine();
        lapicero.write("Amigos de ISI");
        lapicero.flush();


        FileReader ojos= new FileReader(archivo);
        System.out.println(ojos.read()); //lee caracter en codigo ascii

        BufferedReader lentes= new BufferedReader(ojos);
        System.out.println(lentes.readLine()); //guarda como string una linea
    }
}
