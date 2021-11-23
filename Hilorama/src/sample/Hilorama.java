package sample;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Hilorama extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.black);


        // estrellas de 4 picos
            g.setColor(Color.orange);
            int x[] = {170, 190, 340, 190, 170, 150, 0, 150, 170};
            int y[] = {0, 150, 170, 190, 340, 190, 170, 150, 0};
            g.drawPolyline(x, y, 9);

            g.setColor(Color.orange);
            int a[] = {50,170,290, 200, 290, 170, 50, 150, 50};
            int b[] = {50,150,50, 170, 290, 190, 290, 170, 50};
            g.drawPolyline(a, b, 9);


            //Margen azul
            for(int i=0; i<41; i=i+8) {
                g.setColor(Color.cyan);
                int c[] = {50+i, 120, 170, 220, 290-i, 290, 340-i, 290, 290-i, 220, 170, 120, 50+i, 50, 0+i, 50, 50+i};
                int d[] = {50+i, 50, 0+i, 50, 50+i, 120, 170, 220, 290-i, 290, 340-i, 290, 290-i, 220, 170, 120, 50+i};
                g.drawPolyline(c, d, 17);

            }

            //margen magenta
            for(int i=0; i<60; i=i+7) {
                g.setColor(Color.magenta);
                int e[] = {50 + i, 170, 290-i, 260+i, 290 - i, 170, 50 + i, 80-i, 50 + i};
                int f[] = {50 + i, 80-i, 50 + i, 170, 290 - i, 260+i, 290-i, 170, 50 + i};
                g.drawPolyline(e, f, 9);
            }

            //margen verde
            for(int i=0; i<50; i=i+6) {
                g.setColor(Color.green);
                int e[] = {83 + i, 170, 250-i, 230+i, 250 - i, 170, 90 + i, 120-i, 83 + i};
                int f[] = {83 + i, 120-i, 90 + i, 170, 250 - i, 230+i, 250-i, 170, 83 + i};
                g.drawPolyline(e, f, 9);
            }

        }

    }