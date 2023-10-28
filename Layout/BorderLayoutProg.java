package Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class BorderLayoutProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400);  
       
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb= new JButton("1");
        jb.setBounds(20, 20, 80, 50);
        JButton jb2= new JButton("2");
        jb2.setBounds(120, 20, 80, 50);
        JButton jb3= new JButton("3");
        jb3.setBounds(220, 20, 80, 50);
        JButton jb4= new JButton("4");
        jb4.setBounds(20, 120, 80, 50);
        JButton jb5= new JButton("5");
        jb5.setBounds(120, 120, 100, 50);

        // to se the gap between horizontal and vertical...............otherwise there is no need...
        BorderLayout b= new BorderLayout(10,10);
        jf.setLayout(b);
        jf.add(jb,BorderLayout.PAGE_START);
        jf.add(jb2,BorderLayout.PAGE_END);
        jf.add(jb3,BorderLayout.LINE_START);
        jf.add(jb4,BorderLayout.LINE_END);
        jf.add(jb5,BorderLayout.CENTER);

        
    }
    
}
