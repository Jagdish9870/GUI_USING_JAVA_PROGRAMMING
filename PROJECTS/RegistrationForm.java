package PROJECTS;
import javax.swing.*;
public class RegistrationForm  {

    RegistrationForm(){

         JFrame jf= new  JFrame();
         
        jf.setBounds(200, 200, 600, 400);  
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);


        JLabel l1= new JLabel("name");
        JLabel l2= new JLabel("SurName");
        JLabel l3= new JLabel("Email");
        JLabel l4= new JLabel("Password");
        
        


        






    }

    public static void main(String[] args) {

        
        new RegistrationForm();
    }
    
}
