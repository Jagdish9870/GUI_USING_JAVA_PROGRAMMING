import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class JSplitPanePro {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JSplitPane is used to divide  a container into two parts and both work as a separate container and it can be two types, vertical and horizontal........

        JButton jb= new  JButton("1");
        JButton jb2= new  JButton("2");

        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        sp.setTopComponent(jb);
        sp.setBottomComponent(jb2);
        sp.setDividerSize(10);  // size of divider 
        sp.setDividerLocation(100);  // location of divider
        
        sp.setOneTouchExpandable(true);
        jf.add(sp);
        
        jf.validate();  // this is necessary line to show split line....
        
        jf.setLayout(null);
        

        

    }
    
}
