package LOOK_AND_FEEL;

import javax.swing.*;

//cross platform look and feel and it looks same on all the platform.....

// it is default look and feel also for java...

public class Metal_pro  {

    Metal_pro(){

         JFrame jf= new  JFrame();
         
        jf.setBounds(200, 200, 600, 400);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);



        JLabel jl= new JLabel("UserName");
        JTextField jt =new JTextField(30);
        JLabel jl2= new JLabel("PassWord");
        JPasswordField jpw=new JPasswordField(30);
        JButton jb1= new JButton("LogIn");
        JButton jb2= new JButton("SignUp");
        jl.setBounds(20,50,100,50);
        jt.setBounds(170,50,200,50);
        jpw.setBounds(170,100,200,50);
        jl2.setBounds(20,100,100,50);
        jb1.setBounds(150,190,100,50);
        jb2.setBounds(250,190,100,50);
        

        jf.add(jl);
        jf.add(jt);
        jf.add(jl2);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jpw);




        


        jf.setVisible(true);




    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        String str="javax.swing.plaf.metal.MetalLookAndFeel";

        UIManager.setLookAndFeel(str);

        
        new Metal_pro();
    }
    
}
