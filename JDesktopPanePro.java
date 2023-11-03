import java.awt.BorderLayout;

import javax.swing.*;

class Frame22 extends JFrame{
        Frame22(){
        setBounds(50, 50, 600, 500);  
        setVisible(true);
       // setLayout(null);  // we will not setLayout to null
        JDesktopPane desktop = new JDesktopPane();
        add(desktop,BorderLayout.CENTER);
        display(desktop);

     

    }

        private void display(JDesktopPane desktop) {
            int numFrame=3,x=30,y=30;
            for(int i=0;i<numFrame;i++){
                JInternalFrame jf2= new JInternalFrame("internalFrame"+(i+1),true,true,true,true);
                jf2.setBounds(x, y, 200, 100);
                
                jf2.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);  // only despose works in multiple desktop pane
                jf2.add(new JLabel(" frame "+i));
                jf2.setVisible(true);
                desktop.add(jf2);
                x+=150; // to set the distence between frame on x axis..... 
                y+=130; // to set the distence between frame on y axis.....
            }
        }
}
public class JDesktopPanePro {
    // JDesktopPane is used to create multi-document Application......(many small windows in one window....)..
    
    public static void main(String[] args) {
        Frame22 jf2=new Frame22();
        jf2.setDefaultCloseOperation(Frame22.EXIT_ON_CLOSE);
       
        
        
        
    }
    
}

