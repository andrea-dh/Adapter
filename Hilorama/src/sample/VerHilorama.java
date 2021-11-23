package sample;
import javax.swing.JFrame;
public class VerHilorama {
    public static void main(String[] args) {
        Hilorama pantalla=new Hilorama();
        JFrame app= new JFrame();
        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        app.add( pantalla );
        app.setSize( 400, 400 );
        app.setVisible( true );

    }
}
