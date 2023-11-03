import java.awt.event.ItemEvent;

import javax.swing.*;


public class JcheckBoxMenuItemProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  // we can define  size  and location using this method  also
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();
        JMenu mb1= new JMenu("Menu");
        mb.add(mb1);
        jf.setJMenuBar(mb);
        
        JTextArea jt = new JTextArea();
        jt.setBounds(100, 50, 200, 400);
        jf.add(jt);




        JCheckBoxMenuItem cbmi = new JCheckBoxMenuItem("VPN");
        mb1.add(cbmi);
        cbmi.addItemListener((ItemEvent e)->{
           
         if(cbmi.isSelected()){
            jt.setText("selected");
         }
         else
         {
            jt.setText("not selected");
         }
         
        });
      
        

    }
    
}
