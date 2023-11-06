import java.awt.GridLayout;

import javax.swing.*;


public class JSeparatorPro extends JFrame {
    // Jseparator is used to implement divider lines ,horizontaly or vertically


    JSeparatorPro(){
        setBounds(200, 200, 600, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel jp= new JPanel();
        jp.setLayout(new GridLayout(1,0));
        add(jp);
        JLabel l1 = new JLabel("first");

        JLabel l2 = new JLabel("second");
        jp.add(l1);
       // jp.add(new JSeparator());   // by default it is horizontally...
        jp.add(new JSeparator(SwingConstants.VERTICAL)); // set it vertically..........
        jp.add(l2);
        // adding separator in menu bar

        JMenuBar mb= new JMenuBar();
        JMenu file = new JMenu("FIle");
        JMenu Edit= new JMenu("Edit");
        JMenuItem cop= new JMenuItem("copy");
        JMenuItem pas= new JMenuItem("paste");
        JMenuItem sel= new JMenuItem("select");
        JMenuItem selAl= new JMenuItem("select ALL");

        JMenuItem exi= new JMenuItem("exit");
        
        Edit.add(cop);
        Edit.add(pas);
        Edit.addSeparator();   // used to draw lines btw component
        Edit.add(sel);
        Edit.add(selAl);
        Edit.addSeparator();  // used to draw lines btw component
        Edit.add(exi);
        
        mb.add(file);
        mb.add(Edit);
        setJMenuBar(mb);  
        setVisible(true);
    }
    public static void main(String[] args) {
        new JSeparatorPro();
    }
    
}
