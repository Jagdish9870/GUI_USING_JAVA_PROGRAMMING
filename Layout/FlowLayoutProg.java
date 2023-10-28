package Layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400);  
         jf.setLayout(null);
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
        jf.add(jb4,0);  // here we can also pass the index to change the postion of any component....
        jf.add(jb5);

        // in flow layout positon of component vary on frame size...........
        // by default component are organized in center but we can set in left or according to our need...
        
       FlowLayout f= new FlowLayout();
       // this is used to set gaps when we dont use left or right to align the component..
       f.setHgap(10);  
       f.setVgap(20);
        // for aligning componenet in left
        // and to set the gap between component we simple pass the value in flowlayout
        // FlowLayout f= new FlowLayout(FlowLayout.LEFT,10,20);

        // for right use->  (FlowLayout.Right)

        jf.setLayout(f);

        
    }
    
}
