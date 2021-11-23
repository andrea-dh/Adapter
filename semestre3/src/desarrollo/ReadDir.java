/*
    Java v14.0.2        Creado: 27/agosto/2021

    Materia: Desarrollo de Sistemas III

    Autor: Andrea Duarte Hernández
    Copyright (c)
 */
package desarrollo;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/*
    Desarrollar una aplicación que reciba como argumento en nombre de un directorio o carpeta
    y muestre para cada archivo de texto (.txt) cuantas lineas, palabras y caracteres contiene
    el archivo. Se debe utilizar la clase SimpleVisitor y el método Paths.walkFileTree.
 */
public class ReadDir extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException {
        if(args.length<1) {
            System.exit(2);
        }

        //  Iniciar en este directorio
        Path startigDir = Paths.get(args[0]);

        //  Clase para procesar los archivos
        ReadDir readDir = new ReadDir();

        //  Iniciar el recorrido de los archivos
        Files.walkFileTree(startigDir, readDir);


    }
    //  Se manda llamar para cada archivo en un directorio
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
        String file = path.toAbsolutePath().toString();
        BufferedReader br = null;
        String linea = null;
        int num_lineas=0;
        int num_palabras=0;
        int num_chars=0;

        if(file.toLowerCase().endsWith(".txt")) {
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


            try {
                while((linea=br.readLine()) != null) {
                    //  Contar cada línea
                    num_lineas++;
                    num_chars += linea.length();
                    StringTokenizer palabras = new StringTokenizer(linea, " .,()!?:;");
                    num_palabras+=palabras.countTokens();
                    //String[] palabras = linea.split("\\W");
                    //for (int i = 0; i < palabras.length; i++) {
                    //    try {
                    //        Double.parseDouble(palabras[i]);
                    //    } catch (NumberFormatException e) {
                    //        num_palabras++;
                    //    }
                    //}
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("%30s \t\tLineas:  %,6d \t\tPalabras: %,6d \t\tCaracteres: %,6d %n", path, num_lineas, num_palabras, num_chars);

        return super.visitFile(path, attrs);
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException e) throws IOException {
        System.out.printf("No se puede procesar el archivo: %30s%n", file.toString());
        return super.visitFileFailed(file, e);
    }
}


