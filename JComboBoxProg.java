import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class JComboBoxProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(200, 200); 
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // to put the values in combobox..
        String[] str={"mango","grapes","apple"};
        JComboBox<String> b1 = new JComboBox<String>(str);

        b1.setFont(new Font("arial",Font.BOLD,20));
        b1.setBounds(100, 50, 200, 50);

       //  b1.addItem("guava");   //by this mehthod we can add more element into the list....

        jf.add(b1);

        // select items by default.......................
        b1.setSelectedItem("apple");
       // b1.setSelectedIndex(1);     // default selection by index..

       JTextArea jt = new JTextArea(" ");
       jt.setBounds(400,50,200,150);
       jf.add(jt);


       JButton jb= new JButton("select");
       jb.setBounds(400, 250, 100, 50);
       jf.add(jb);

       jb.addActionListener((ActionEvent e)->{
           String sel= String.valueOf(b1.getSelectedIndex());
           String sel2 = (String)b1.getSelectedItem();
        jt.setText(sel+" "+ sel2);
        
       });

      

       
        
    }
    
}
