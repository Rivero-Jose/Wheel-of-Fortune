import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;


public class MUSE implements LineListener {
	boolean b = true;
	boolean c = true;
	boolean playCompleted;
	public void msg(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	
	public void play(){
		InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("WHEELOFFORTUNETHEMESONG.wav"));
		Wheel M = new Wheel();
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            audioClip.loop(9999);
            if(c == true){
            	M.start();
            c = false;
            }
            
            
			while (!playCompleted) {
                // wait for the playback completes
				audioClip.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
			audioClip.close();
             
       }catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
        
	}
	
	public void play2(){
		InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("WHEELOFFORTUNECHANT.wav"));
		Wheel M = new Wheel();
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            audioClip.start();
            if(b == true){
            	play();
            b = false;
            }
            
            
			while (!playCompleted) {
                // wait for the playback completes
				audioClip.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
			audioClip.close();
             
       }catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
        
	}
	public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
        
        //if (type == LineEvent.Type.OPEN) {
        //    JOptionPane.showMessageDialog(null,"Playback started.");
             
        //} else if (type == LineEvent.Type.STOP) {
          //  playCompleted = true;
            //JOptionPane.showMessageDialog(null,"Playback completed.");
        //}
 
    }
}
