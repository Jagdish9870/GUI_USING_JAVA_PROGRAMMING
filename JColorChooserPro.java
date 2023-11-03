
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTable;




class frame17 extends JFrame {
    JTable t;
    Container c;


    public frame17(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        
        c= getContentPane();
        c.setLayout(null);

        JButton jb= new JButton("choose color");
        jb.setBounds(100, 100, 200, 30);
        add(jb);

        jb.addActionListener((ActionEvent e)->{
            Color col=JColorChooser.showDialog(null, "select color", Color.WHITE);
            c.setBackground(col);
           
        });
        
        

        
      
    }
}

public class JColorChooserPro {
    public static void main(String[] args) {
        frame17 f= new frame17();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


    }
    
}






        
        
    
