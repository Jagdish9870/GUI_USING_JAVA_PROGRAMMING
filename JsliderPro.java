import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/*  used to slide a value on a particular parameter..
 parts for slider->
track
knob
major ticks,minor ticks
labels */
class Frame21 extends JFrame implements ChangeListener{

        JSlider js;
        JLabel jl;
        Frame21(){
        setBounds(200, 200, 600, 400);  
        setLayout(new FlowLayout());
        
        js= new JSlider();
        js.setPaintTicks(true);
        js.setPaintLabels(true);

        js.setMinimum(0);
        js.setMaximum(200);

        js.setMinorTickSpacing(50);
        js.setMajorTickSpacing(20);
        js.addChangeListener(this);
        js.setOrientation(JSlider.VERTICAL);   // setting the slider to horizontal or verticle...
         
        add(js);
        jl =new JLabel();
        add(jl);
        jl.setText("the value is : "+ js.getValue());
        
        
        
        
        
        setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
            jl.setText("the value is : "+ js.getValue());
            
        }
}
public class JsliderPro {
    
    
    public static void main(String[] args) {
        Frame21 jf2=new Frame21();
        jf2.setDefaultCloseOperation(Frame21.EXIT_ON_CLOSE);
        
        
    }
    
}

