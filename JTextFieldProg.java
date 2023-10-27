import javax.swing.*;
import java.awt.*;

public class JTextFieldProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(100, 50, 100, 200);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        

            // used to enter single line as input

        JTextField jt = new JTextField();
        jt.setBounds(100, 50, 200, 100);
        jf.add(jt);
        jt.setBackground(Color.BLACK);
        jt.setForeground(Color.WHITE);
        jt.setText("This is a text area");
        jt.setFont(new Font("Arial",Font.BOLD,20));
        jt.setEditable(false); // by this method we can set text as non editable...
        
    }
    
}
