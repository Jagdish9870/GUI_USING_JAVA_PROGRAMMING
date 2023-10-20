import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class JFrameProg{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400);  // we can define  size  and location using this method  also
         jf.setLayout(null);
        jf.setVisible(true);

         // jf.setSize(200,400);  // here we define the opening size of jframe
         //jf.setLocation(20, 20);



         // to set image instead of java icon into frame
         ImageIcon icon= new ImageIcon("hi.avif");
         jf.setIconImage(icon.getImage());
         
         //to change the bg color of jframe
         Container c= jf.getContentPane();
         c.setBackground(Color.black);
         
         //to stop window resize......
         jf.setResizable(false);


        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}