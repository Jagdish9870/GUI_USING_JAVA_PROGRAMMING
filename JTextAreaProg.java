import javax.swing.*;
import java.awt.*;

public class JTextAreaProg {
    public static void main(String[] args) {
        // when we have to add single line as text -> textField
        // multiple line or text->  TextArea

           JFrame jf = new JFrame();
        jf.setBounds(100, 50, 100, 200);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        



        JTextArea jt = new JTextArea();
        jt.setBounds(100, 50, 200, 400);
        jf.add(jt);
        jt.setBackground(Color.BLACK);
        jt.setForeground(Color.WHITE);
        jt.setText("This is a text area");
        jt.setFont(new Font("Arial",Font.ITALIC,20));
       // jt.setEditable(false); // by this method we can set text as non editable...
       jt.setLineWrap(true);
        

        
    }
    
}
