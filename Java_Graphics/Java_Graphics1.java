package Java_Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;


 class MyPanel extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
        g.drawString("First Graphics", 50, 50);

        g.drawLine(100, 250, 200, 150);             // to draw line
        g.drawRect(200, 150, 100, 200);        // to draw rectangle
        g.fillRect(300, 150, 100, 200);      // to draw filled rect

        g.drawOval(400, 150, 100, 200);     // to draw oval 
        g.fillOval(500, 150, 100, 200);       // filled...

        g.drawArc(150, 100, 100, 100, 0, 90);     // to draw arch

        // to draw  poolygon...........
        int x[]={600,700,800};
        int y[]={400,200,400};
        int n=3;
        g.drawPolygon(x,y,n);

       // to draw  poolyline...........   // all the lines are not connected...
        int a[]={700,800,900};
        int b[]={400,200,400};
        int c=3;
        g.drawPolyline(a,b,c);


        // for the image...
        String url="C:\\Users\\jagdish gupta\\Desktop\\languages\\java codes\\GUI USING JAVA\\c.png";
        Image image = new ImageIcon(url).getImage();
        g.drawImage(image,1000,150,200,200,null);




    }
}
public class Java_Graphics1  {

    Java_Graphics1(){

         JFrame jf= new  JFrame();
         
        jf.setBounds(200, 200, 600, 400);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setLayout(null);
        
        MyPanel mp= new MyPanel();
        mp.setBackground(Color.BLACK);
        jf.add(mp);
        
        
        jf.setVisible(true);
        






    }

    public static void main(String[] args) {

        
        new Java_Graphics1();
    }
    
}