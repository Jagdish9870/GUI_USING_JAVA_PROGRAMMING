package PROJECTS;


import javax.swing.*;
public class WelcomePage  {

    WelcomePage(){

         JFrame jf= new  JFrame();
         
        jf.setBounds(200, 200, 600, 400);  
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);


        



    }

    public static void main(String[] args) {

        
        new WelcomePage();
    }
    
}
