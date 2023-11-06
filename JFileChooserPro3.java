import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFileChooserPro3 extends JFrame implements ActionListener {
    JFileChooser fc;

    JFileChooserPro3(){

        // how to open or save directories only.................

        setBounds(200, 200, 600, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(null);

        JPanel jp = new JPanel();
        add(jp);
        JButton jb1= new JButton("Open");
        JButton jb2= new JButton("save");
        jp.add(jb1);
        jp.add(jb2);

        // by passing the path we can set the initial path of jfile chooser..............
        fc= new JFileChooser("C:\\Users\\jagdish gupta\\Desktop");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);   // this is used when we have to select directories only.......

        fc.setMultiSelectionEnabled(true);  // to enable multiple file selection....

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb1.addActionListener((ActionEvent e)->{
            

        });





        setVisible(true);




    }

    public static void main(String[] args) {

        // it shows a dialogue to choose file from system or directory .....
        new JFileChooserPro3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equalsIgnoreCase("Open")){
        
          int selFile=fc.showOpenDialog(null);
         if (selFile==JFileChooser.APPROVE_OPTION){
                System.out.println(" choosed File: "+fc.getSelectedFile().getName());
                System.out.println("Path is :"+fc.getSelectedFile().getAbsoluteFile());

            }
            else{
                System.out.println("no selection");
                }
           

            }
        else if(e.getActionCommand().equalsIgnoreCase("save")){
                int selFile=fc.showSaveDialog(null);
                 if (selFile==JFileChooser.APPROVE_OPTION){
                System.out.println(" choosed File: "+fc.getSelectedFile().getName());
                System.out.println("Path is :"+fc.getSelectedFile().getAbsoluteFile());

            }
            else{
                System.out.println("no selection");
            }

      }
    }
    
}
