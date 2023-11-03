
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JToggleButton;




class frame16 extends JFrame {
    JTable t;
    Container c;


    public frame16(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        
        c= getContentPane();
        c.setLayout(null);

        JToggleButton tb= new JToggleButton("DARK");
        tb.setBounds(0, 0, 100, 30);
        add(tb);

        tb.addActionListener((ActionEvent e)->{
            if (tb.isSelected()){
                c.setBackground(Color.BLACK);
                tb.setText("LIGHT");

            }
            else{
                c.setBackground(Color.WHITE);
            }
        });
        
        

        
      
    }
}

public class JToggleBUttonpro {
    public static void main(String[] args) {
        frame16 f= new frame16();
        f.setDefaultCloseOperation(frame16.EXIT_ON_CLOSE);
        


    }
    
}






        
        
    
