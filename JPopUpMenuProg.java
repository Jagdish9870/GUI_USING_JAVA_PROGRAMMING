




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

class frame12 extends JFrame implements ActionListener{

     JPopupMenu pm;
     JMenuItem j1,j2,j3;
    public frame12(){
        setBounds(200, 200, 600, 400);  
        setLayout(null);
        setVisible(true);
       

          j1= new JMenuItem("cut");
          j2= new JMenuItem("copy");
          j3= new JMenuItem("paste");
          j1.addActionListener(this);
          j2.addActionListener(this);
          j3.addActionListener(this);
         
        pm = new JPopupMenu();
         
         pm.add(j1);
         pm.add(j2);
         pm.add(j3);
         add(pm);
         JLabel jl = new JLabel("right click to see");
         jl.setBounds(10, 50, 100, 100);
         add(jl);



         // if you want to open the pop up menu on mouse click event...............
         addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getButton()==MouseEvent.BUTTON3){
                    int x= e.getX();
                    int y= e.getY();
                    
                        pm.show(frame12.this,x,y);

                }
            }
            
         });

         // to perform option on the popup menu options.........

         
         



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // we can perform any option..........
        if(e.getSource()==j1){
            System.out.println("first option is selected");

        }
        if(e.getSource()==j2){
            System.out.println("secod option is selected");
            
        }
        if(e.getSource()==j3){
            System.out.println("third option is selected");
            
        }
        
    }
}

public class JPopUpMenuProg {
    public static void main(String[] args) {
        frame12 f= new frame12();
        f.setDefaultCloseOperation(frame12.EXIT_ON_CLOSE);
       


    }
    
}

