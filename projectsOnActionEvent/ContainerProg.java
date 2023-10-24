package projectsOnActionEvent;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class ContainerProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBackground(Color.RED);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setBounds(100,50,400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setBounds(0,50,100,100);
        c.setBackground(Color.BLACK);
        jf.add(c);
        
    }

}
