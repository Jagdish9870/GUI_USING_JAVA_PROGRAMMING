import javax.swing.*;
public class JRadioButtonProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  
        jf.setLayout(null);
        jf.setVisible(true);

        JRadioButton first= new JRadioButton("CSE");
        first.setBounds(100, 70, 80,30);   
        JRadioButton second= new JRadioButton("ECE");
        second.setBounds(200, 70, 80,30);   
        JRadioButton third= new JRadioButton("MECH");
        third.setBounds(300, 70, 80,30);   

        ButtonGroup branch= new ButtonGroup();
        branch.add(first);
        branch.add(second);
        branch.add(third);
        jf.add(first);
        jf.add(second);
        jf.add(third);
        first.setSelected(true);
        third.setEnabled(false);  //to make selection disable
        

        
    }

 
}
