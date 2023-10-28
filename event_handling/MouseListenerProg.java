package event_handling;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
class frame extends JFrame implements MouseListener,MouseMotionListener{
    JTextArea jt,jt2;
    JLabel l1,l2;
    
    public frame(){

        Container c= getContentPane();
        c.setLayout(null);

        jt=new JTextArea();
        jt.setBounds(100,50 ,200,200);
        c.add(jt);
        jt2=new JTextArea();
        jt2.setBounds(100,270 ,200,200);
        c.add(jt2);

        l1= new JLabel("mouse Event");
        l1.setBounds(10,10 ,100,50);
        c.add(l1);
        l2= new JLabel("mouse Event");
        l2.setBounds(330,10 ,100,50);
        c.add(l2);
        l1.addMouseListener(this);
        l2.addMouseMotionListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jt.setText(jt.getText()+ " mouse clicked : "+ "\n");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       jt.setText(jt.getText()+"mouse pressed : "+ "\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jt.setText(jt.getText()+"mouse released : "+ "\n");
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jt.setText(jt.getText()+"mouse entered : "+ "\n");
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jt.setText(jt.getText()+"mouse exit : "+ "\n");
       
    }
    @Override
    public void mouseDragged(MouseEvent e) {
       jt2.setText("mouse dragged : "+ "\n");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        jt2.setText("mouse moved : "+ "\n");
    }

    
}

public class MouseListenerProg {
    public static void main(String[] args) {
         frame jf = new frame();
        jf.setBounds(200, 200, 600, 400);  
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }
    
}
