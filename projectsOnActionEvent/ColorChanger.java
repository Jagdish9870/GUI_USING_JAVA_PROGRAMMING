package projectsOnActionEvent;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;


public class ColorChanger {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  // we can define  size  and location using this method  also
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea jt = new JTextArea("hii");
        jt.setBounds(150, 50, 300, 100);
        
        jf.add(jt);

        JButton jb = new JButton("Black Background ");
        JButton jb2 = new JButton("gray Background ");
        JButton jb3 = new JButton("yellow Background ");
        jb.setBounds(150,150,100,50);
        jb2.setBounds(250,150,100,50);
        jb3.setBounds(350,150,100,50);
        jf.add(jb);
        jf.add(jb2);
        jf.add(jb3);

         jb.addActionListener((ActionEvent a)->{
           
                jt.setBackground(Color.BLACK);
                jt.setForeground(Color.WHITE);
                
        }
        );
         jb2.addActionListener((ActionEvent a)->{
           
                 jt.setBackground(Color.GRAY);
                 jt.setForeground(Color.BLACK);
                
        }
        );
         jb3.addActionListener((ActionEvent a)->{
           
                 jt.setBackground(Color.YELLOW);
                 jt.setForeground(Color.red);
                
        }
        );

       


       
       


        
    }
    
}
