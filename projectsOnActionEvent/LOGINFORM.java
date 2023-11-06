package projectsOnActionEvent;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LOGINFORM {
    

    public static void main(String[] args) {
    JFrame jf= new JFrame();
    jf.setSize( 600, 400);  
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        JLabel jl1=new JLabel("USERNAME : ");
        JLabel jl2=new JLabel("PASSWORD : ");
        jl1.setBounds(10, 50,100,20);
        jl2.setBounds(10, 100,100,20);

       JTextField tf1=new JTextField();
        tf1.setBounds(120, 50,120 ,20);
       JPasswordField jp= new JPasswordField();
        jp.setBounds(120, 100,120 ,20);


        JButton jb = new JButton("Login");
        jb.setBounds(200, 150,100 ,20);
        
        jb.addActionListener((ActionEvent e)->{
        System.out.println("Username : "+ tf1.getText());
        String password = new String(jp.getPassword());
        System.out.println("Pass : "+password);
    });

        jf.add(jl1);
        jf.add(jl2);
        jf.add(tf1);
        jf.add(jp);
        jf.add(jb);
        
        
        
        
        jf.setVisible(true);


       
    }
    
}
