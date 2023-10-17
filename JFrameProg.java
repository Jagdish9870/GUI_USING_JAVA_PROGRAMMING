import javax.swing.JFrame;

public class JFrameProg{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
      //  jf.setBounds(20, 20, 200, 400);   we define size here also


        jf.setLayout(null);
        jf.setSize(200,300);  // here we define the opening size of jframe
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}