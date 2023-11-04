import java.awt.Label;
import java.awt.event.ActionEvent;

import javax.swing.*;

class Frame26 extends JFrame{
    JDialog jd;
    JPanel jp;
    JButton jb;

        Frame26(){
        setBounds(50, 100, 600, 400);  
        
        
        jp= new JPanel();
        
        jb= new JButton("Jdialogue");
        jp.add(jb);
        add(jp);

        
            jb.addActionListener((ActionEvent e)->{
                
                jd= new JDialog();
                jd.setBounds(200, 200, 300, 200);  
                jd.setVisible(true);
               // jd.setLayout(null);
               jd.add(new Label("this is inside dialogueBox"));
                
                
            });
            
            setVisible(true);


     

    }
}
public class JDialoguePro {
    // jdialogue is like a jframe but it does not have max or minimize button...............
    
    
    public static void main(String[] args) {
        Frame26 jf2=new Frame26();
        jf2.setDefaultCloseOperation(Frame26.EXIT_ON_CLOSE);
        
        
    }
    
}

