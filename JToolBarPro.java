import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTable;




class frame19 extends JFrame {
     // tooltip generally describe the info when we hover on any element.........
    JTable t;
    Container c;


    public frame19(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        
        c= getContentPane();
        c.setLayout(null);

        JLabel jl= new JLabel("Password");
        jl.setBounds(10, 50, 100, 40);
        add(jl);

        
       



      
        
        

        
      
    }
}

public class JToolBarPro {
    public static void main(String[] args) {
        frame18 f= new frame18();
        f.setDefaultCloseOperation(frame19.EXIT_ON_CLOSE);
        


    }
    
}






        
        
    

