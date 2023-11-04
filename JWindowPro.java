
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

class Frame24 extends JFrame{
    JButton jb;
    JPanel jp;
        Frame24(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        setLayout(new FlowLayout());
        jp = new JPanel();
        jb= new JButton(" click ");
        jp.add(jb);
        add(jb);

        jb.addActionListener((ActionEvent e)->{
            JWindow jw = new JWindow();
            jw.setBounds(50,100,200,200);
            jw.setVisible(true);
           jw.setLayout(new FlowLayout());

            JLabel jl2= new JLabel();
            jl2.setText("this is window");
            jw.add(jl2);

     // this code is used to close jwindow otherwise it will not close as it doen'nt have any close button..........
            jw.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent m){
                    if(m.getClickCount()==2){
                        jw.dispose();
                    }
                }
            });
        });



     

    }
}
public class JWindowPro {
    // jwindow is just like container but it does not hava any title, minimize ,maximize or close button...
    // can we displayed anywhere on user's desktop...........
    
    
    public static void main(String[] args) {
        Frame24 jf2=new Frame24();
        jf2.setDefaultCloseOperation(Frame24.EXIT_ON_CLOSE);
        
        
    }
    
}

