import java.awt.FlowLayout;

import javax.swing.*;

class Frame20 extends JFrame{
        Frame20(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        setLayout(null);

       JInternalFrame jf2= new JInternalFrame();      // creating a another Jframe....
        add(jf2);    // adding jInternal Frame

        initFrame(jf2);   // this is used to create another jframe property........
            
        }

        private void initFrame(JInternalFrame jf2)  // by this method we write the property for internal jframe.....
        {
            jf2.setSize(350, 180);     // setting size of the frame...
            jf2.setLocation(70, 90);         // setting location of the frame..
            jf2.setTitle("Another Internal Frame");           // title for internal frame...
            jf2.setResizable(false);          // resizing is disabled or not...
            jf2.show();                               // showing the frame to user.....
            jf2.setLayout(new FlowLayout());

            //below we will write the code for internal jframe..

            JButton b1= new JButton("click");
            jf2.add(b1);
        }

    }

public class JInternalFramepro {
    // jInternalFrame is same like Jframe but we can use this inside the container unlike JFrame.... 
    
    public static void main(String[] args) {
        Frame20 jf=new Frame20();
        jf.setDefaultCloseOperation(Frame20.EXIT_ON_CLOSE);
        
        
    }
    
}
