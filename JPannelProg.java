import javax.swing.*;

public class JPannelProg {
    public static void main(String[] args) {
          JFrame jf = new JFrame();
        jf.setBounds(20, 20, 200, 400);   

        JLabel jl = new JLabel("hii this is jlabel ");

        JPanel jp = new JPanel();
        jp.add(jl);


        jf.setLayout(null);
        jf.setSize(200,300); 
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
