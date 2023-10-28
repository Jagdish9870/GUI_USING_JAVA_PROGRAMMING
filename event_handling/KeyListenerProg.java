package event_handling;

import java.awt.Container;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class Myframe extends JFrame implements KeyListener{

    JTextArea jt;

   public Myframe(){
    Container c=getContentPane();
    c.setLayout(null);

        jt = new JTextArea();
        jt.setBounds(10, 10, 600, 400);  
        c.add(jt);
        jt.addKeyListener(this);

    }
   
     @Override
    public void keyPressed(KeyEvent e) {
        jt.setText(jt.getText()+"\n "+" pressed : "+ e.getKeyChar());
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        jt.setText(jt.getText()+"\n "+"Typed : " );
       
       
    }

   

    @Override
    public void keyReleased(KeyEvent e) {
        jt.setText(jt.getText()+"\n "+" released : "+ e.getKeyChar());
      
    }

  
}

public class KeyListenerProg {
    public static void main(String[] args) {
        Myframe jf = new Myframe();
        jf.setBounds(200, 200, 600, 400);  
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       


       

    }

    
}
