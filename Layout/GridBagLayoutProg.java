package Layout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
         jf.setBounds(200, 200, 600, 400);  
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c =jf.getContentPane();
        GridBagLayout gb= new GridBagLayout();
        c.setLayout(gb);

        JButton jb= new JButton("1");
      
        JButton jb2= new JButton("2");
       
        JButton jb3= new JButton("3");
     
        JButton jb4= new JButton("4");
       
        JButton jb5= new JButton("5");
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill=GridBagConstraints.HORIZONTAL;   // to fill the extra space availble by components..
        gbc.weightx=0.5;  // for increase horizontally extra space..
        gbc.gridx = 0; 
        gbc.gridy = 0;
        c.add(jb,gbc);

        gbc.gridx = 1; 
        gbc.gridy = 0;
        c.add(jb2,gbc);

        gbc.weightx=0;   // reset 
     
        gbc.gridx = 2; 
        gbc.gridy = 0;
        c.add(jb3,gbc);


        gbc.gridwidth=3;   // it will occupu the space of all three button..
        gbc.gridx = 0; 
        gbc.gridy = 1;    // set in second column
        gbc.ipady=40;      // increase the height of button
        c.add(jb4,gbc);


        gbc.gridwidth=2;
        gbc.ipady=0;  // rreset the width which is defined above if we donot do this it will occupy the same width , defined above....
        gbc.gridx = 1; 
        gbc.gridy = 2;
        gbc.weighty=1;
        gbc.anchor=GridBagConstraints.PAGE_END;  // to stick the component with end 
        c.add(jb5,gbc);
       

    
        

        
    }

    
   
    
}
