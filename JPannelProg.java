import java.awt.Color;

import javax.swing.*;

public class JPannelProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(20, 20, 200, 400);   

        JLabel jl = new JLabel("hii this is jlabel ");
        jl.setForeground(Color.WHITE);

        JPanel jp = new JPanel(); // panel is light weight componenent(means it can be added to other heavy weight component(ex.. in jfrme)) and container also means it can add buttons, labels also.
        jp.setBounds(100,50 , 200, 200);
        jp.setBackground(Color.BLACK);
        jp.add(jl);
        jf.add(jp);


        jf.setLayout(null);
        jf.setSize(200,300); 
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
