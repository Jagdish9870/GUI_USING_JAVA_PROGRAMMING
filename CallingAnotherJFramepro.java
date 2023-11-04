import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Frame25 extends JFrame implements ActionListener{

        JButton jb,jb2;
        JLabel jl;
        JTextField tf;
        Frame25(){
        setBounds(10, 50, 600, 400);  
        setLayout(new FlowLayout());
        
        jb= new JButton("click");
        jl=new JLabel(" hii ");
       

        JPanel jp= new JPanel();
        jp.add(jb);
        jp.add(jl);
        add(jp);


        jb.addActionListener(this);
        // jb.addActionListener((ActionEvent e)->{
           
        //     jb.addActionListener((ActionEvent e2)->{
        //         String str=tf.getText().toString();
        //         jl.setText(str);
                
                
                
        //     });
        // });
        
        
        
        
        
        setVisible(true);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getActionCommand().equals("click")){
             JFrame jf2= new JFrame();
            jf2.setBounds(200, 200, 600, 400);  
            jf2.setVisible(true);
            jf2.setLayout(new FlowLayout());
            jf2.setDefaultCloseOperation(Frame25.DISPOSE_ON_CLOSE);  // despose operation will not affect another Jframe...

            tf = new JTextField("write here");
            tf.setColumns(30);
            jf2.add(tf);

            jb2= new JButton("submit");
            jf2.add(jb2);
            jb2.addActionListener(this);

           }
           else if(e.getActionCommand().equals("submit")){
            String str=tf.getText().toString();
                jl.setText(str);
           }
        }
}
public class CallingAnotherJFramepro {
    
    
    public static void main(String[] args) {
        Frame25 jf=new Frame25();
        jf.setDefaultCloseOperation(Frame25.EXIT_ON_CLOSE);
        
        
    }
    
}

