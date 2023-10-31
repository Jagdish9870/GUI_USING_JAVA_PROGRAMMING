

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class JPopUpMenuProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400); 
         jf.setLayout(null);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         jf.setVisible(true);
         
         JMenuItem j1= new JMenuItem("cut");
         JMenuItem j2= new JMenuItem("copy");
         JMenuItem j3= new JMenuItem("paste");
         
         JPopupMenu pm = new JPopupMenu();
         
         pm.add(j1);
         pm.add(j2);
         pm.add(j3);
         jf.add(pm);
         pm.show(jf,200,200);


         // if you want to open the pop up menu on mouse click event................

         
         
    }
    
}
