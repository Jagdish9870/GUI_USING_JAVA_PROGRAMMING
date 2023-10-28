package event_handling;

import java.awt.Container;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

// caret refers to position of cursor while entering or deleting text..............

class frame3 extends JFrame implements CaretListener{
    JTextField tf;
    JTextArea jt;


    public frame3(){
        Container c= getContentPane();
        c.setLayout(null);
         tf= new JTextField("position of caret");
        tf.setBounds(20,20,100,50);
        c.add(tf);
        jt=new JTextArea();
        jt.setBounds(130,50 ,200,200);
        c.add(jt);
        tf.addCaretListener(this);

    }


    @Override
    public void caretUpdate(CaretEvent e) {
        jt.setText(jt.getText()+"\ncaret updated : "+e.getMark());
    }
}

public class CaretListenerProg {
    public static void main(String[] args) {
        frame3 f= new frame3();
         f.setBounds(200, 200, 600, 400);  
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


    }
    
}
