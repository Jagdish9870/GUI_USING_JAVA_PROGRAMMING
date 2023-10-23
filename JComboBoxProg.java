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
        JComboBox b1 = new JComboBox(str);

        b1.setBounds(100, 50, 200, 50);
        jf.add(b1);

        // select items by default......................
        b1.setSelectedItem("apple");
       // b1.setSelectedIndex(1);     // default selection by index..
       
        
    }
    
}
