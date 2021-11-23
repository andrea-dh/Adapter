package sample;
import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class SimpleAudioPlayer {
    Long currentFrame;
    Clip clip;
    String status;
    AudioInputStream audioInputStream;
    static String filePath;
    public SimpleAudioPlayer()
            throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        audioInputStream =
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public static void main(String[] args) {
        Hilorama pantalla=new Hilorama();
        JFrame app= new JFrame();
        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        app.add( pantalla );
        app.setSize( 380, 380 );
        app.setVisible( true );
        try {
            filePath = "C:\\Users\\Hp\\IdeaProjects\\Hilorama\\Music\\Music.wav";
            SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer();
            audioPlayer.play();
            Scanner sc = new Scanner(System.in);
            while (true)
            {
                int c = sc.nextInt();
                audioPlayer.gotoChoice(c);
                if (c == 4)
                    break;
            }
            sc.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    private void gotoChoice(int c)
            throws IOException, LineUnavailableException, UnsupportedAudioFileException
    {
    }
    public void play()
    {
        //start the clip
        clip.start();
        status = "play";
    }
}


