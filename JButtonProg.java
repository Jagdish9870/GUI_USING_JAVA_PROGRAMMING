import javax.swing.*;
import java.awt.*;

public class JButtonProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  // we can define  size  and location using this method  also
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb= new JButton();
        jb.setBounds(100, 50, 100, 50);
        jb.setText("click here");
        jf.add(jb);
        jb.setBorder(BorderFactory.createLineBorder(Color.RED,3));     
        jb.setBackground(Color.BLACK);
        jb.setForeground(Color.WHITE);
        jb.setCursor(new Cursor(Cursor.HAND_CURSOR)); //example---->(CROSSHAIR_CURSOR),(WAIT_CURSOR)
        jb.setVisible(true);
        jb.setFont(new Font("Arial",Font.BOLD,20));
        
        //to see the image in button

        
        
        //jb.setEnabled(false);       // to disble the button
       // jb.setVisible(false);    // to set the visibility of button....
        
        
    }
    
}
