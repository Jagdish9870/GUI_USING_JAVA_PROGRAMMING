
import javax.swing.*;

class Frame23 extends JFrame{
        Frame23(){
        setBounds(200, 200, 600, 400);  
        JEditorPane ep= new JEditorPane();   // editor have inbuilt wrapper function..............unlike jTextArea....
        ep.setContentType("Text/plain");
        ep.setText("hii what is your name...");
        add(ep);
        setVisible(true);



     

    }
}
public class JEditorPanePro {
    // it is used to create simple text editor window...
    
    
    public static void main(String[] args) {
        Frame23 jf2=new Frame23();
        jf2.setDefaultCloseOperation(Frame23.EXIT_ON_CLOSE);
        
        
    }
    
}

