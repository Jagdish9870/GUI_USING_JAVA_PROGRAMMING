
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

import javax.swing.*;

public class JGlassPanePro  {
    /*GlassPane is like glass showing on top of container
     it is transparent and hidden by default
     used when we have to paint an area which already contains some component

     example :->

     deactivating the mouse event on specific area

     displaying the image over multiple component using glass pane 

*/
    // JGlassPanePro(){
        
    // }

    public static void main(String[] args) {
       JFrame jf= new JFrame();

       jf.setSize(600, 400);
       jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel jp= new JPanel();


        JLabel jl= new JLabel("mouse hover area");
        JButton jb1= new JButton("label Hide/Show");
        JButton jb2= new JButton("show");
        JButton jb3= new JButton("Hide glass pane");
        jb1.setBackground(Color.gray);
        jb1.setForeground(Color.black);
        jb1.setBounds(20, 20, 100, 100);

        jb2.setBackground(Color.gray);
        jb2.setForeground(Color.black);
        jb2.setBounds(40, 40, 100, 100);
            jb3.setBackground(Color.green);
            jb3.setForeground(Color.black);
            jb3.setBounds(40, 40, 100, 100);

            jp.add(jl);
            jp.add(jb1);
            jp.add(jb2);
            jf.getContentPane().add(jp);
           

        jb1.addActionListener((ActionEvent e)->{
            jl.setVisible(!jl.isVisible());   // this is used to activate the visibility of any component.....


        });

        // basically every frame has its glassPane which is hidden by default to show that we use below code......................
        // this is laso used to set color and component to glasspane
        jf.setGlassPane(new JComponent(){
            protected void paintComponent(Graphics g){
                // this is used to define color for glass pane...
                g.setColor(new Color(0,0,0,150));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        });

       final Container glassPane = (Container)jf.getGlassPane();    // this is used to show glasspane
        glassPane.setLayout(new GridBagLayout());   // this is used to set layout for glass pane
       
        glassPane.add(jb3);   // adding button to glasspane


        glassPane.addMouseListener((new MouseAdapter()  // this will prevent mouse action on jframe untill the glasspane is open....
        {
            
        }));
        jb2.addActionListener((ActionEvent e)->{
           
                glassPane.setVisible(true);      // this method will used to show the glasspane



        });
        
            
            jb3.addActionListener((ActionEvent e)->{
           
                glassPane.setVisible(false);   // to hide the glasspane
        });
        jf.setVisible(true);
    }

}
