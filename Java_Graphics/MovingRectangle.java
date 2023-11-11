package Java_Graphics;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.*;


class MyAnimation extends JPanel{

    int x=100;
    int y=150;
    int Width=250;
    int Height=100;
    int stepSize=20;
    int Max_H;
    int Max_W;
    MyAnimation(int w,int h){
        this.Max_H =h;
        this.Max_W =w;
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        g.drawString("Second Graphics", 50, 50);
         g.fillRect(x, y, Width, Height); 

         if(x+Width>Max_W || x<0){

            stepSize=-stepSize;
         }
        
         x=x+stepSize;   // step size == movement of rectangle(on x in pixels...)
         try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
          
            e.printStackTrace();
        }
        repaint();  // this calls the paint method again and again....



      



    }
}
public class MovingRectangle  {

    MovingRectangle(){

         JFrame jf= new  JFrame();
         
        jf.setBounds(200, 200, 600, 400);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setLayout(null);
        
        MyAnimation mp= new MyAnimation(580,380);
        mp.setBackground(Color.BLACK);
        jf.add(mp);
        
        
        jf.setVisible(true);
        






    }

    public static void main(String[] args) {

        
        new MovingRectangle();
    }
    
}