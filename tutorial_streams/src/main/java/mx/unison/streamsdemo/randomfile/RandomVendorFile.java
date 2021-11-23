package mx.unison.streamsdemo.randomfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RandomVendorFile {
    private String fileName;

    public RandomVendorFile(String fileName) {
        this.fileName = fileName;
    }

    public long write(Vendor v) {
        RandomAccessFile out = null;
        long position = 0;
        byte buffer[] = null;

        try {
            out = new RandomAccessFile(fileName,"rws");

            // cuantos bytes hay en archivo
            position = out.length();

            // ir al ultimo byte
            out.seek( position  );

            // escribir el codigo
            out.writeInt( v.getCodigo() );

            // escribir los bytes que se requieren para imprimir
            // la cadena con el nombre
            buffer = v.getNombre().getBytes();
            out.write(buffer);

            // convertir de Date a long
            long dob = v.getFecha().getTime();
            out.writeLong(dob);

            // escribir los bytes que se requieren para imprimir
            // la cadena con la zona
            buffer = v.getZona().getBytes();
            out.write(buffer);
            out.close();

        } catch (IOException ex) {
            Logger.getLogger(RandomVendorFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return position;
    }


    public Vendor read(long position) {
        RandomAccessFile out = null;
        long bytes = 0;
        byte buffer[] = null;
        Vendor vendor = null;
        try {
            out = new RandomAccessFile(fileName,"rws");

            out.seek( position );

            int codigo = out.readInt();

            byte[] nameBytes = new byte[Vendor.MAX_NAME];
            out.read(nameBytes);

            long dateBytes =  out.readLong();

            byte[] zonaBytes = new byte[Vendor.MAX_ZONE];
            out.read(zonaBytes);

            vendor = new Vendor(codigo,  new String(nameBytes), new Date( dateBytes ),
                    new String(zonaBytes) );
            out.close();

        } catch (IOException ex) {
            Logger.getLogger(RandomVendorFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendor;
    }


    public static void main(String[] args) {

        final String dataPath = "/Users/rnavarro/data/vendors-data.dat";

        RandomVendorFile randomFile = new RandomVendorFile(dataPath);

        Scanner input = new Scanner(System.in);

        System.out.println("Numero de registro:");

        int n = input.nextInt();

        int pos  = (n * Vendor.RECORD_LEN) - Vendor.RECORD_LEN;

        Vendor p = randomFile.read(pos);

        System.out.println(p);

    }

}
