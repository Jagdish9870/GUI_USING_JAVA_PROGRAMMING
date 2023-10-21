import javax.swing.*;
import java.awt.*;

public class JTextAreaProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(100, 50, 100, 200);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        
        



        JTextArea jt = new JTextArea();
        jt.setBounds(100, 50, 200, 100);
        jf.add(jt);
        
    }
    
}
