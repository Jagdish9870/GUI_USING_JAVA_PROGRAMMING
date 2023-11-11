package Java_Graphics;




import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.*;


 class MyPanelS extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        g.drawString("Sample Code", 50, 50);

      



    }
}
public class Graphics_sampleCode  {

    Graphics_sampleCode(){

         JFrame jf= new  JFrame();
         
        jf.setBounds(200, 200, 600, 400);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setLayout(null);
        
        MyPanelS mp= new MyPanelS();
        mp.setBackground(Color.BLACK);
        jf.add(mp);
        
        
        jf.setVisible(true);
        






    }

    public static void main(String[] args) {

        
        new Graphics_sampleCode();
    }
    
}