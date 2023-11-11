package Java_Graphics;




import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.*;


 class MyAnimation2 extends JPanel{
    int x=100;
    int y=100;
    int BWidth=50;
    int BHeight=50;
    int SpeedX=20;
    int SpeedY=30;
    int Max_H;
    int Max_W;


    MyAnimation2(int w,int h){
        this.Max_H =h-BHeight;
        this.Max_W =w-BWidth;
    }

    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        g.drawString("Bouncing  Ball", 50, 50);


        g.fillOval(x, y, BWidth, BHeight);

        if(x>Max_W || x<0){
            SpeedX=-SpeedX;
        }
        
        if(y>Max_H||y<0){
            SpeedY=-SpeedY;
        }

        x+=SpeedX;
        y+=SpeedY;
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        







        repaint();



    }
}
public class BouncingBall  {

    BouncingBall(){

         JFrame jf= new  JFrame();
         
        jf.setBounds(200, 200, 600, 400);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setLayout(null);
        
        MyAnimation2 mp= new MyAnimation2(580,380);
        mp.setBackground(Color.BLACK);
        jf.add(mp);
        
        
        jf.setVisible(true);
        






    }

    public static void main(String[] args) {

        
        new BouncingBall();
    }
    
}