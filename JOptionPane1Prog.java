import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPane1Prog {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // for input dialogue............

        JButton jb= new JButton("click me");
        jb.setBounds(10,50,100,50);
        jf.add(jb);

        jb.addActionListener((ActionEvent e)->{
            String str =JOptionPane.showInputDialog("Enter Name");

            if(str.length()>0){
                System.out.println("the name of user is : "+ str);
            }
        });
       
    }

    
}
