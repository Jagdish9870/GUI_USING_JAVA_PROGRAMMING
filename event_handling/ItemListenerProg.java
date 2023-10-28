package event_handling;

import java.awt.Font;

import java.awt.event.ItemEvent;

import javax.swing.*;

public class ItemListenerProg {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  // we can define  size  and location using this method  also
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
 
 
       //item listener is applied when we have to select item like in checkbox, combobox, radio button etc........
 
        b1.addItemListener((ItemEvent e)->{
            String sel= String.valueOf(b1.getSelectedIndex()); // to get the index of selected item..................
            String sel2 = (String)b1.getSelectedItem();
         jt.setText(sel+" "+ sel2);
         
        });
 

    
    }
       
}
