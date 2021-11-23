package sample;
import javax.swing.*;
import java.awt.*;

class Vida extends JPanel {
    boolean[][] tab;
    Vida (boolean[][] t){
        tab=t;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        int ar=10, ac=10, sep=2;
        for(int i=0; i< tab.length; i++){
            for(int j=0; j<tab[0].length; j++){
                if(tab[i][j]) g.drawRect(i*(ar+sep),j*(ac+sep), ar, ac);
                else{
                    g.setColor( Color.WHITE );
                    g.drawRect(i*(ar+sep),j*(ac+sep), ar, ac);
                }
            }
        }

    }



}

public class JuegoVida {

    public static void main(String[] args) {
        /*
        Una célula muerta con exactamente 3 células vecinas vivas "nace" (es decir, al turno siguiente estará viva).
        Una célula viva con 2 o 3 células vecinas vivas sigue viva, en otro caso muere (por "soledad" o "superpoblación").
         */
        boolean tablero [][]=new boolean[20][20];
        generar(tablero);
        Vida panel=new Vida(tablero);
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(800, 600);
        app.repaint(1000);
        app.setVisible(true);


        //true=vivo             false=muerto
        imprime(tablero);
        tablero=sigGen(tablero);
        System.out.println("SIGUIENTE GENERACION");
        imprime(tablero);
    }

    static boolean[][] sigGen(boolean[][] original){
        boolean[][] siguiente=new boolean[original.length][original[0].length];

//centro
        for(int i=1; i<siguiente.length-1; i++){
            for(int j=1; j<siguiente[0].length-1; j++){
                int tot=0;
                if(original[i-1][j-1]) tot++;
                if(original[i][j-1]) tot++;
                if(original[i+1][j-1]) tot++;
                if(original[i-1][j]) tot++;
                if(original[i+1][j]) tot++;
                if(original[i-1][j+1]) tot++;
                if(original[i][j+1]) tot++;
                if(original[i+1][j+1]) tot++;
                boolean vive=false;
                if (!original[i][j] && tot==3) vive=true;
                if (original[i][j] && (tot==3 || tot==2)) vive= true;

                siguiente[i][j]=vive;
            }
        }

//esquinas

        //esq 1
        int tot=0;
        if(original[1][0]) tot++;
        if(original[0][1]) tot++;
        if(original[1][1]) tot++;
        boolean vive=false;
        if (!original[0][0] && tot==3) vive=true;
        if (original[0][0] && (tot==3 || tot==2)) vive= true;
        siguiente[0][0]=vive;


        //esq 2
        tot=0;
        if(original[1][original.length-1]) tot++;
        if(original[1][original.length-2]) tot++;
        if(original[0][original.length-2]) tot++;
        vive=false;
        if (!original[0][original.length-1] && tot==3) vive=true;
        if (original[0][original.length-1] && (tot==3 || tot==2)) vive= true;
        siguiente[0][original.length-1]=vive;


        //esq 3
        tot=0;
        if(original[original.length-2][0]) tot++;
        if(original[original.length-2][1]) tot++;
        if(original[original.length-1][1]) tot++;
        vive=false;
        if (!original[original.length-1][0] && tot==3) vive=true;
        if (original[original.length-1][0] && (tot==3 || tot==2)) vive= true;
        siguiente[original.length-1][0]=vive;


        //esq 4
        tot=0;
        if(original[original.length-2][original.length-1]) tot++;
        if(original[original.length-1][original.length-2]) tot++;
        if(original[original.length-2][original.length-2]) tot++;
        vive=false;
        if (!original[original.length-1][original.length-1] && tot==3) vive=true;
        if (original[original.length-1][original.length-1] && (tot==3 || tot==2)) vive= true;
        siguiente[original.length-1][original.length-1]=vive;

        //orillas

        //arriba
        for(int i=1; i< original[0].length-2; i++){
            tot=0;
            if(original[0][i-1]) tot++;
            if(original[1][i-1]) tot++;
            if(original[1][i]) tot++;
            if(original[1][i+1]) tot++;
            if(original[0][i+1]) tot++;
            vive=false;
            if (!original[0][i] && tot==3) vive=true;
            if (original[0][i] && (tot==3 || tot==2)) vive= true;
            siguiente[0][i]=vive;
        }

        //abajo
        for(int i=1; i< original[0].length-2; i++){
            tot=0;
            if(original[original.length-1][i-1]) tot++;
            if(original[original.length-2][i-1]) tot++;
            if(original[original.length-2][i]) tot++;
            if(original[original.length-2][i+1]) tot++;
            if(original[original.length-1][i+1]) tot++;
            vive=false;
            if (!original[original.length-1][i] && tot==3) vive=true;
            if (original[original.length-1][i] && (tot==3 || tot==2)) vive= true;
            siguiente[original.length-1][i]=vive;
        }

        //izquierda
        for(int i=1; i< original.length-2; i++){
            tot=0;
            if(original[i-1][0]) tot++;
            if(original[i-1][1]) tot++;
            if(original[i][1]) tot++;
            if(original[i+1][1]) tot++;
            if(original[i+1][0]) tot++;
            vive=false;
            if (!original[i][0] && tot==3) vive=true;
            if (original[i][0] && (tot==3 || tot==2)) vive= true;
            siguiente[i][0]=vive;
        }

        //derecha
        for(int i=1; i< original.length-2; i++){
            tot=0;
            if(original[i-1][original.length-1]) tot++;
            if(original[i-1][original.length-2]) tot++;
            if(original[i][original.length-2]) tot++;
            if(original[i+1][original.length-2]) tot++;
            if(original[i+1][original.length-1]) tot++;
            vive=false;
            if (!original[i][original.length-1] && tot==3) vive=true;
            if (original[i][original.length-1] && (tot==3 || tot==2)) vive= true;
            siguiente[i][original.length-1]=vive;
        }
// se genera una nueva generacion

        return siguiente;
    }
    static void imprime(boolean[][] temp){
        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp[0].length; j++){
                System.out.print(temp[i][j]?"x ":"  ");
        }
            System.out.println();
    }
    }

    static void generar(boolean[][] temp){
        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp[0].length; j++){
                temp[i][j]= Math.random()<0.5;
            }
        }

    }
}


