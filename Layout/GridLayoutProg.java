package Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400);  
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb= new JButton("1");
      
        JButton jb2= new JButton("2");
       
        JButton jb3= new JButton("3");
     
        JButton jb4= new JButton("4");
       
        JButton jb5= new JButton("5");
       

        jf.add(jb);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);
        GridLayout g= new GridLayout(2,3);
        g.setHgap(10);
        g.setVgap(10);

        // to set number of row and col to fit component and we can also set the gap
        //  GridLayout g= new GridLayout(2,3,10,20);
         jf.setLayout(g);

        
    }
    
}
