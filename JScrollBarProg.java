

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JScrollBarProg {
     public static void main(String[] args) {
        JFrame jf= new JFrame();
        jf.setBounds(100, 100, 600, 450);
        JTextArea ta = new JTextArea();
        ta.setBounds(200, 200, 200, 200);
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(600, 200, 400, 260);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jf.add(sp);
        
        
        
        
        jf.setLayout(null);
        jf.setTitle("SCrollBar");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
