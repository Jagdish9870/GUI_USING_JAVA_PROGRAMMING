package Layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400);  
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c= jf.getContentPane();
        CardLayout card= new CardLayout();
        c.setLayout(card);

        JButton jb= new JButton("1");
      
        JButton jb2= new JButton("2");
       
        JButton jb3= new JButton("3");
     
        JButton jb4= new JButton("4");
       
        JButton jb5= new JButton("5");
       

        c.add(jb,"1");
        c.add(jb2,"2");
        c.add(jb3,"3");
        c.add(jb4,"4");
        c.add(jb5,"5");
       

        card.next(c); // used to show the second componenet by default....

        // bythis method we can show the desired component...

        card.show(c,"3");
        
    }
    
}
