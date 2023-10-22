import java.awt.*;

import javax.swing.*;

public class JPasswordFieldProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(100, 50, 200, 200);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPasswordField pf= new JPasswordField(); 
        pf.setBounds(100, 50, 200, 100);
        jf.add(pf);
        pf.setBorder(BorderFactory.createLineBorder(Color.RED,3));     
        pf.setBackground(Color.BLACK);
        pf.setForeground(Color.WHITE);
        pf.setFont(new Font("Arial",Font.BOLD,20));
        pf.setText("This is a text area");
        pf.setEchoChar('*');               // by using this method we can convert our password into "*"... otherwise it will show characters as (..........)

        // if you want to see your password.....................
       // pf.setEchoChar((char)0);

        
    }
    
}
