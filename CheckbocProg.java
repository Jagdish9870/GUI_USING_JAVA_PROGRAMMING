import javax.swing.JCheckBox;
import javax.swing.JFrame;
public class CheckbocProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Checkbox Program");
        jf.setBounds(100, 50, 200, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);


        // checkbox creation........

        JCheckBox cb = new JCheckBox("hindi");
        cb.setBounds(100,50,100,100);
        JCheckBox cb2 = new JCheckBox("ENG");
        cb2.setBounds(200,50,100,100);
        
        JCheckBox cb3 = new JCheckBox("Math");
        cb3.setBounds(300,50,100,100);
         JCheckBox cb4 = new JCheckBox("comp");
        cb4.setBounds(400,50,100,100);
        jf.add(cb);
        jf.add(cb2);
        jf.add(cb3);
        jf.add(cb4);

        cb.setSelected(true);

        cb4.setEnabled(false);
        


        
    }
    
}
