package JFrame_creation_Ways;
// this frame have constructor and main function in different class
import javax.swing.*;

class Frame21 extends JFrame{
        Frame21(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        setLayout(null);

     

    }
}
public class JFramepro2 {
    
    
    public static void main(String[] args) {
        Frame21 jf2=new Frame21();
        jf2.setDefaultCloseOperation(Frame21.EXIT_ON_CLOSE);
        
        
    }
    
}

