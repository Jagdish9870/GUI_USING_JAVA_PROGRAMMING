

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneProg {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTabbedPane");
        
        JTabbedPane tp= new JTabbedPane();
        tp.setBounds(200,200,400,400);

        JPanel p1= new JPanel();
        JPanel p2= new JPanel();
        JPanel p3= new JPanel();
        p1.add(new JLabel("this is Home page"));
        p2.add(new JLabel("this is Edit page"));
        p3.add(new JLabel("this is More page"));

        tp.add("home",p1);
        tp.add("Edit",p2);
        tp.add("More",p3);
        
        frame.add(tp);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
