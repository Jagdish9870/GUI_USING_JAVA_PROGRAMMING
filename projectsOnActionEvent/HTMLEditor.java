package projectsOnActionEvent;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

class Frame24 extends JFrame{
    JEditorPane ep;
        Frame24(){
        setBounds(200, 200, 600, 400);  
        ep= new JEditorPane();   // editor have inbuilt wrapper function..............unlike jTextArea...
        ep.setContentType("Text/html");
        String str="<html> "
        +"<ol>"
        + "<li><h1 color='red'>Java</h1></li>"
        +"<li>JSP</li>"
        +"</ol>" +
        "</html> ";
        ep.setText(str);
        add(ep,BorderLayout.CENTER);
        
        JButton jb= new JButton("show code");
        jb.addActionListener((ActionEvent e)->{
            System.out.println(""+ep.getText());
            
        });
        add(jb, BorderLayout.PAGE_END);
        setVisible(true);



     

    }
}
public class HTMLEditor {
    // it is used to create simple text editor window...
    
    
    public static void main(String[] args) {
        Frame24 jf2=new Frame24();
        jf2.setDefaultCloseOperation(Frame24.EXIT_ON_CLOSE);
        
        
    }
    
}

