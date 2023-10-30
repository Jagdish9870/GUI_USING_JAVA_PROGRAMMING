package Layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400);  
         
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         Container c= jf.getContentPane();
         
         BoxLayout box= new BoxLayout(c,BoxLayout.X_AXIS);
         c.setLayout(box);
        JButton jb= new JButton("1");
      
        JButton jb2= new JButton("2");
       
        JButton jb3= new JButton("3");
       
        JButton jb4= new JButton("4");
  
        JButton jb5= new JButton("5");

             // we can align the items separately ..
        jb5.setAlignmentX(Component.CENTER_ALIGNMENT);
   
        c.add(jb);
        c.add(jb2);
        c.add(Box.createRigidArea(new Dimension(10,50)));   // fill the gap between button ..
        c.add(jb3);
        c.add(jb4);
        c.add(jb5);

   
        
        
    }

   
    
}
