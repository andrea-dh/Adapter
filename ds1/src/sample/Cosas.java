package sample;
import javax.swing.*;

public class Cosas {

    /*public class Cosas<mes> {
    public int leermes(String mensaje) {
        int mes = 0;

        while (true) {
            String m = JOptionPane.showInputDialog(mensaje);
            try {
                mes = Integer.parseInt(m);
                break;
            } catch (Exception e) {
                System.out.println("Numero entero");
                mensaje = mensaje + "\nEscribe un NÚMERO ENTERO \nElige un número entero del 1 al 12";
            }

        }
        return mes;}

    public int leerdia(String mensaje) {
        int dia = 0;
        while (true) {
            String d = JOptionPane.showInputDialog(mensaje);
            try {
                dia = Integer.parseInt(d);
                break;
            } catch (Exception e) {
                System.out.println("Numero entero");
                mensaje = mensaje + "\nEscribe un NÚMERO ENTERO";
            }

        }

        return dia;}



    public int leeraño(String mensaje) {
        int año = 0;
        while (true) {
            String a = JOptionPane.showInputDialog(mensaje);
            try {
                año = Integer.parseInt(a);
                break;
            } catch (Exception e) {
                System.out.println("Numero entero");
                mensaje = mensaje + "\nEscribe un NÚMERO ENTERO";

            }

        }
        return año;*/

        public int leerentero(String mensaje){
            int num=0;
            while(true) {
                String texto = JOptionPane.showInputDialog(mensaje);
                //System.out.println(texto);
                try {
                    num = Integer.parseInt(texto);
                    break;
                } catch (Exception e) {
                    //System.out.println(e);
                    //System.out.println("error");
                    mensaje=mensaje+"\n Como eres burro, NUMERO ENTERO\n  ejemplo 5";
                }
            }
            return num;
        }
        public void imprime(String mensaje){
            JOptionPane.showMessageDialog(null,mensaje);
        }
    }





