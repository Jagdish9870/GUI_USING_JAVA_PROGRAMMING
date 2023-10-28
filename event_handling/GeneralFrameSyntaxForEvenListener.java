package event_handling;

import java.awt.Container;

import javax.swing.*;

class frame extends JFrame{


    public frame(){
        Container c= getContentPane();
        c.setLayout(null);

    }
}

public class GeneralFrameSyntaxForEvenListener {
    public static void main(String[] args) {
        frame f= new frame();
         f.setBounds(200, 200, 600, 400);  
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


    }
    
}
