import javax.swing.*;
import java.awt.*;


public class JLabelProg {
    public static void main(String[] args) {
        JFrame jf= new JFrame();
        jf.setBounds(100, 100, 1000, 500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c= jf.getContentPane();
        c.setLayout(null);

        //to set image into JLabel..........
        ImageIcon icon= new ImageIcon("c.png");
        JLabel jl= new JLabel("hello",icon,JLabel.RIGHT);
        jl.setBounds(0, 50, 1200, 1000);

        // to change font of jlabel
        Font f= new Font("Arial",Font.ITALIC,20);
        jl.setFont(f);
        
        


        c.add(jl);


        
    }
    
}
