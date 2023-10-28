import java.awt.Container;
import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
class frame extends JFrame implements MouseMotionListener{
    JTextArea jt;
    JLabel l1;
    
    public frame(){

        Container c= getContentPane();
        c.setLayout(null);

        jt=new JTextArea();
        jt.setBounds(100,50 ,400,500);
        c.add(jt);

        l1= new JLabel("mouse Event");
        l1.setBounds(10,10 ,100,100);
        c.add(l1);
        l1.addMouseMotionListener(this);

    }


    @Override
    public void mouseDragged(MouseEvent e) {
       jt.setText(jt.getText()+"mouse dragged : "+ "\n");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        jt.setText(jt.getText()+"mouse moved : "+ "\n");
    }
    
}

public class MouseMotionLIstenerProg {
    public static void main(String[] args) {
         frame jf = new frame();
        jf.setBounds(200, 200, 600, 400);  
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }
    
}
