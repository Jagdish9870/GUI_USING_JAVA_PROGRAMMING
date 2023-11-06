import java.awt.FlowLayout;

import javax.swing.*;

class Frame27 extends JFrame{
        Frame27(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        setLayout(new FlowLayout());


        JProgressBar pb=new JProgressBar(0,100);  // we can also pass the orientation in this block also...............
        add(pb);
        pb.setStringPainted(true);
        //pb.setOrientation(SwingConstants.VERTICAL);   // show the progress bar vertically
             
         int i=0;
         while(i<=100){

            if(i>=0 && i<=85){
                pb.setString("processing");
            }
            else if(i>=85 && i<=98){
                pb.setString("about to complete");
            }
            else{
                pb.setString("completed");
            }
            pb.setValue(i);
                // this will show the running progress bar as there is no real time progress....
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                
            }
            i=i+10;
         }

     

    }
}
public class JProgressBarPro {
    
    /*  used to show progress of any application.....
    progress Bar with some string..........
    verticle progressBar............
    horizontal Progress Bar..........
    */

    public static void main(String[] args) {
        Frame27 jf2=new Frame27();
        jf2.setDefaultCloseOperation(Frame27.EXIT_ON_CLOSE);
        
        
    }
    
}

