import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPane3Prog {
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
           int sel= JOptionPane.showConfirmDialog(jf, "Do you want to exit", "confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

           if(sel==JOptionPane.YES_OPTION){

            System.out.println("choosed yes ..");
            System.exit(0);
           }
          else if(sel==JOptionPane.NO_OPTION){

            System.out.println("choosed NO ..");
            
           }
           else if(sel==JOptionPane.CANCEL_OPTION){

            System.out.println("cancled ..");
           
           }

           
        });
       
    }

    
}
