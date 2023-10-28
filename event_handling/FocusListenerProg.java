package event_handling;

import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

class frame2 extends JFrame implements FocusListener{
    JTextField tf; 
    JTextArea jt;


    public frame2(){
        Container c= getContentPane();
        c.setLayout(null);
        tf= new JTextField("move to text area");
        tf.setBounds(20,20,100,50);
        c.add(tf);
        jt=new JTextArea();
        jt.setBounds(130,50 ,200,200);
        c.add(jt);
        tf.addFocusListener(this);
        

    }


    @Override
    public void focusGained(FocusEvent e) {
       jt.setText("focused");
    }


    @Override
    public void focusLost(FocusEvent e) {
        jt.setText("focus lost ");
    }
}

public class FocusListenerProg {
    public static void main(String[] args) {
        frame2 f= new frame2();
        f.setBounds(200, 200, 600, 400);  
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


    }
    
}
