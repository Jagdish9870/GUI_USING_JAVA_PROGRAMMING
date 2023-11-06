import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;




class frame19 extends JFrame {
     // toolBar is a group of component such as buttoons with icons or dropdown Menus....
  
   


    public frame19(){
        setBounds(200, 200, 600, 400); 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
       
        
        JToolBar tb= new JToolBar();
        JButton jb= new JButton("first");
        JButton jb2= new JButton("second");
        JTextField tf= new JTextField();
        JComboBox<String> cb=new JComboBox<>(new String[]{"item1","itm2","item3"});
        tb.add(cb);
        tb.add(tf);
        tb.add(jb);
        tb.addSeparator();   // space btw the button
        tb.add(jb2);
        add(BorderLayout.PAGE_START,tb);

        // disable the movement of toolbar
         tb.setFloatable(false);
        
        setVisible(true);


        // we can also apply the action event on each buttons...
      

    }
}

public class JToolBarPro {
    public static void main(String[] args) {
        frame19 f= new frame19();
        f.setDefaultCloseOperation(frame19.EXIT_ON_CLOSE);
        


    }
    
}






        
        
    

