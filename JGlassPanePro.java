
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class JGlassPanePro extends JFrame {
    /*GlassPane is like glass showing on top of container
     it is transparent and hidden by default
     used when we have to paint an area which already contains some component

     example :->

     deactivating the mouse event on specific area

     displaying the image over multiple component using glass pane 

*/
    JGlassPanePro(){
        setBounds(200, 200, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());



        JLabel jl= new JLabel("mouse hover area");


        JButton jb1= new JButton("first");
        jb1.setBackground(Color.gray);
        jb1.setForeground(Color.black);
        jb1.setBounds(20, 20, 100, 100);

        JButton jb2= new JButton("second");
        jb2.setBackground(Color.gray);
        jb2.setForeground(Color.black);
        jb2.setBounds(40, 40, 100, 100);
        add(jl);
        add(jb1);
        add(jb2);

        jb1.addActionListener((ActionEvent e)->{
            jl.setVisible(!jl.isVisible());


        });

        // basically every frame has its glassPane which is hidden by default to show that we use below code......................

        setGlassPane(new JComponent(){
            protected void paintComponent(Graphics g){
                g.setColor(new Color(0,0,0,180));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        });

        Container glassPane = (Container)getContentPane();
        glassPane.setVisible(true);



        // jb2.addActionListener((ActionEvent e)->{
        //     JGlassPane gp= new JGlassPane();
        //     JButton jb3= new JButton("Hide glass pane");
        //     jb3.setBackground(Color.green);
        //     jb3.setForeground(Color.black);
        //     jb3.setBounds(40, 40, 100, 100);
        //     gp.add(jb3);



        // });



        // JGlassPane gp = new JGlassPane();












        setVisible(true);
    }

    public static void main(String[] args) {
        new JGlassPanePro();
    }

}
