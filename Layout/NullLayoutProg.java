package Layout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400);  
         jf.setLayout(null);
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
        jf.add(jb);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);

        
    }
    
}
