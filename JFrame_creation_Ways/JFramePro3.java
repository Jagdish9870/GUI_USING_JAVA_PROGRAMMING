package JFrame_creation_Ways;
// this frame have constructor and main function in same class

import javax.swing.JFrame;

public class JFramePro3 extends JFrame {

    JFramePro3(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

    }

    public static void main(String[] args) {
        new JFramePro3();
    }
    
}
