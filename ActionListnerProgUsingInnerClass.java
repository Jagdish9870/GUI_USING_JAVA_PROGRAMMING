import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;


public class ActionListnerProgUsingInnerClass {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  // we can define  size  and location using this method  also
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea jt = new JTextArea();
        jt.setBounds(150, 50, 100, 100);
        
        jf.add(jt);

        JButton jb = new JButton("click me");
        jb.setBounds(150,150,100,50);
        jf.add(jb);
        jb.addActionListener((ActionEvent a)->{

            jt.setBackground(Color.BLACK);
            jt.setForeground(Color.WHITE);
        }
        );



        
    }
    
}
