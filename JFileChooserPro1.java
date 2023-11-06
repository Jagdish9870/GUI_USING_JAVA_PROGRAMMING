import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFileChooserPro1 extends JFrame {

    JFileChooserPro1(){

        setBounds(200, 200, 600, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(null);

        JPanel jp = new JPanel();
        add(jp);
        JButton jb1= new JButton("Open");
        JButton jb2= new JButton("save");
        jp.add(jb1);
        jp.add(jb2);
        JFileChooser fc= new JFileChooser();


        jb1.addActionListener((ActionEvent e)->{
            int selFile=fc.showDialog(null,"open file");
            if (selFile==JFileChooser.APPROVE_OPTION){
                System.out.println(" choosed File: "+fc.getSelectedFile().getName());
                System.out.println("Path is :"+fc.getSelectedFile().getAbsoluteFile());

            }
            else{
                System.out.println("no selection");
            }

        });





        setVisible(true);




    }

    public static void main(String[] args) {

        // it shows a dialogue to choose file from system or directory .....

        // this code is used for simple file creation...................
        new JFileChooserPro1();
    }
    
}
