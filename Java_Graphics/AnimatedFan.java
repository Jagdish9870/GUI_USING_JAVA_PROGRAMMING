package Java_Graphics;




import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.*;


 class MyAnimation3 extends JPanel{
    int x;
    int y;
    int FWidth=300;
    int FHeight=300;
    int CenterX;
    int CenterY;
    int angle=0;
   


    MyAnimation3(int w,int h){
        this.CenterX=w/2;
        this.CenterY=h/2;
        this.x=CenterX-FWidth/2;
        this.y=CenterY-FHeight/2;

    }

    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.WHITE);
       

        g.fillArc(x, y, FWidth, FHeight, angle, 30);
        g.fillArc(x, y, FWidth, FHeight, angle+120, 30);
        g.fillArc(x, y, FWidth, FHeight, angle+240, 30);
        g.fillRect(CenterX-3, CenterY, 6, FHeight+100);
        g.fillRect(CenterX-150, CenterY+350, 300, 100);

        angle=angle-30;

        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
         g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
         g.setColor(Color.BLACK);
        g.drawString("BAJAJ 4g", CenterX-100, CenterY+400);



        repaint();



    }
}
public class AnimatedFan  {

    AnimatedFan(){

         JFrame jf= new  JFrame();
         
        jf.setBounds(200, 200, 600, 400);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setLayout(null);
        
        MyAnimation3 mp= new MyAnimation3(580,380);
        mp.setBackground(Color.BLACK);
        jf.add(mp);
        
        
        jf.setVisible(true);
        






    }

    public static void main(String[] args) {

        
        new AnimatedFan();
    }
    
}