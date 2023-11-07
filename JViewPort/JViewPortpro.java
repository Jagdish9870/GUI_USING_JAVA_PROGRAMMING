package JViewPort;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;


// viewPort is part of window that is watchable by user .....

import javax.swing.*;


public class JViewPortpro   {

    JViewPortpro(){

         JFrame jf= new  JFrame("viewport");
         
        jf.setBounds(200, 200, 500, 500);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon ic= new ImageIcon("C:\\Users\\jagdish gupta\\Desktop\\c.png");
        JLabel jl= new JLabel(ic);
        JScrollPane js =new JScrollPane(jl);
        js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jf.add(js);

        js.setViewportBorder(BorderFactory.createLineBorder(Color.GREEN));
        final JViewport vp=js.getViewport();
        JButton mUp= new JButton("move up");
        JButton mDown= new JButton("move down");
        JButton mLeft= new JButton("move left");
        JButton mRight= new JButton("move right");

        JPanel jp= new JPanel();
        jp.add(mUp);
        jp.add(mDown);
        jp.add(mLeft);
        jp.add(mRight);
        jf.add(jp,BorderLayout.SOUTH);

        // mUp.addActionListener(this);
        // mDown.addActionListener(this);
        // mLeft.addActionListener(this);
        // mRight.addActionListener(this);

        mUp.addActionListener((ActionEvent e)->{
            Point Xorigin=vp.getViewPosition();
            Point x1=new Point(Xorigin.x,Xorigin.y-100);
            vp.setViewPosition(x1);
            
        });
        mDown.addActionListener((ActionEvent e2)->{
            Point Xorigin=vp.getViewPosition();
            Point x1=new Point(Xorigin.x,Xorigin.y+100);
            vp.setViewPosition(x1);
        });
        mLeft.addActionListener((ActionEvent e3)->{
            Point Xorigin=vp.getViewPosition();
            Point x1=new Point(Xorigin.x-100,Xorigin.y);
            vp.setViewPosition(x1);
            });
        mRight.addActionListener((ActionEvent e4)->{
                Point Xorigin=vp.getViewPosition();
                Point x1=new Point(Xorigin.x+100,Xorigin.y);
                vp.setViewPosition(x1);
                });
        
        
        

        
        
        
        
        
        
        
        
        
        jf.setVisible(true);
    }

    public static void main(String[] args) {

        
        new JViewPortpro();
    }

   
    
}
