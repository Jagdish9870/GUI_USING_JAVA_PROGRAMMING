import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class JLayeredPanePro extends JFrame {
    /*layeredane is used to provide depth to swing container and 
    1. provide third dimension for positioning the container
    2.allows componenent to overlap each othe rwhen needed...
    3. integer object specify the ech component depth in the conatainer...
    4. highered numbered component displays on top of other component.


    types of layer :   based on depth 
    1. frame content layer  (-30000)   -> contain contentpane and menu bar
    2.defualt layer    (0)           -> bottom most layer
    3.palette_layer     (100)   --> toolBar and Pallete
    4.modal             (200)   -> appear on the top of toolbar and used to show modal dialogue
    5. popup            (300)   -- pop up component...
    6.drag-layer         (400)-> most uppr layer  and containe the component when we drag them....


*/
    JLayeredPanePro(){
        setBounds(200, 200, 600, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(null);


        JLayeredPane lp= new JLayeredPane();

        JButton jb1= new JButton("first");
        jb1.setBackground(Color.GREEN);
        jb1.setForeground(Color.black);
        jb1.setBounds(20, 20, 100, 100);

        JButton jb2= new JButton("second");
        jb2.setBackground(Color.red);
        jb2.setForeground(Color.black);
        jb2.setBounds(40, 40, 100, 100);

        JButton jb3= new JButton("third");
        jb3.setBackground(Color.gray);
        jb3.setForeground(Color.black);
        jb3.setBounds(60, 60, 100, 100);

        // we can also add button like this 
        //  lp.add(jb1);            
        // lp.add(jb2);
        // lp.add(jb3 );
            // by these method we can define the depth of buttons..
        lp.add(jb1,JLayeredPane.DEFAULT_LAYER);            
        lp.add(jb2,JLayeredPane.POPUP_LAYER);
        lp.add(jb3,JLayeredPane.PALETTE_LAYER);

        add(lp);
;

        
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLayeredPanePro();
    }
    
}
