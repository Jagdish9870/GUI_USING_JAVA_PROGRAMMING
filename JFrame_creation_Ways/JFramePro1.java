package JFrame_creation_Ways;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class JFramePro1{
    public static void main(String[] args) {
        // we can define  size  and location using this method  also
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  
         jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         // jf.setSize(200,400);  // here we define the opening size of jframe
         jf.setLocationRelativeTo(null);   // open the window in center...........



         // to set image instead of java icon into frame
         ImageIcon icon= new ImageIcon("hi.avif");
         jf.setIconImage(icon.getImage());
         
         //to change the bg color of jframe
         Container c= jf.getContentPane();
         c.setBackground(Color.black);
         
         //to stop window resize......
         jf.setResizable(false);


        
        
    }
}