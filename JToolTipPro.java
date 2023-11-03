import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTable;




class frame18 extends JFrame {
     // tooltip generally describe the info when we hover on any element.........
    JTable t;
    Container c;


    public frame18(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        
        c= getContentPane();
        c.setLayout(null);

        JLabel jl= new JLabel("Password");
        jl.setBounds(10, 50, 100, 40);
        add(jl);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(120, 50, 100, 40);
        add(pf);

        // for single line tool tip................
       // pf.setToolTipText(" *length atleast 8 char");

        // for multiple line.................

        String str ="<html>"+"<div bgcolor='#00080'color='black' >"+"special character is mandatory<br>"+"there should be atleast one number"+"</div>"+"</html>";
        pf.setToolTipText(str);


      
        
        

        
      
    }
}

public class JToolTipPro {
    public static void main(String[] args) {
        frame18 f= new frame18();
        f.setDefaultCloseOperation(frame18.EXIT_ON_CLOSE);
        


    }
    
}






        
        
    

