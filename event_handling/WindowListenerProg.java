package event_handling;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

class frame4 extends JFrame implements WindowListener{
    JTextArea jt;

    public frame4(){
        Container c= getContentPane();
        c.setLayout(null);
        jt=new JTextArea();
        jt.setBounds(130,50 ,200,200);
        c.add(jt);
        this.addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {
       jt.setText(" window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
      System.out.println(" window closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println(" window closed");
      
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println(" window Iconfied");
      
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println(" window deiconfied");
       
    }

    @Override
    public void windowActivated(WindowEvent e) {
        jt.setText(" window activated");
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println(" window deactivated");
       
    }
}

public class WindowListenerProg {
    public static void main(String[] args) {
        frame4 f= new frame4();
        f.setBounds(200, 200, 600, 400);  
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


    }
    
}
