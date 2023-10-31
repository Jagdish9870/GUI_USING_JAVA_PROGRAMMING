import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPane2Prog {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400);  
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // for input dialogue............

        JButton jb= new JButton("plain msg");
        jb.setBounds(10,50,100,50);
        jf.add(jb);

         JButton jb2= new JButton("info ");
        jb2.setBounds(110,50,100,50);
        jf.add(jb2);

         JButton jb3= new JButton("que ");
        jb3.setBounds(210,50,100,50);
        jf.add(jb3);

         JButton jb4= new JButton("error ");
        jb4.setBounds(310,50,100,50);
        jf.add(jb4);

         JButton jb5= new JButton("warning ");
        jb5.setBounds(410,50,100,50);
        jf.add(jb5);

        
        jb.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(jf, "this is the type of plain msg", "message", JOptionPane.PLAIN_MESSAGE);

           
        });
         jb2.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(jf, "this is the type of info msg", "message", JOptionPane.INFORMATION_MESSAGE);

           
        });
         jb3.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(jf, "this is the type of que msg", "message", JOptionPane.QUESTION_MESSAGE);

           
        });
         jb4.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(jf, "this is the type of error msg", "message", JOptionPane.ERROR_MESSAGE);

           
        });
         jb5.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(jf, "this is the type of warning msg", "message", JOptionPane.WARNING_MESSAGE);

           
        });
        
       
    }

    
}
