import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooserPro5 extends JFrame implements ActionListener {
    JFileChooser fc;

    JFileChooserPro5(){

        // how to open specific types of  files only like (.jpg,  .png, .pdf , .html  etc).................

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
        

        fc.setMultiSelectionEnabled(true);  // to enable multiple file selection....

        fc.setAcceptAllFileFilterUsed(false);  // to disable the approval of all types of files....
        FileNameExtensionFilter f1= new FileNameExtensionFilter("only text file(.txt)", "txt");
        FileNameExtensionFilter f2=new FileNameExtensionFilter("Images", "gif","jpeg","jpg","png");
        FileNameExtensionFilter f3=new FileNameExtensionFilter("PDF Files", "pdf");    // like this we can use other files selection like java , html files etc

        fc.addChoosableFileFilter(f1);
        fc.addChoosableFileFilter(f2);
        fc.addChoosableFileFilter(f3);

       





        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb1.addActionListener((ActionEvent e)->{
            

        });





        setVisible(true);




    }

    public static void main(String[] args) {

        // it shows a dialogue to choose file from system or directory .....
        new JFileChooserPro5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equalsIgnoreCase("Open")){
        
          int selFile=fc.showOpenDialog(null);
         if (selFile==JFileChooser.APPROVE_OPTION){
            File[] files=fc.getSelectedFiles();
            for(int i=0;i<files.length;i++){
                File file=files[i];
                System.out.println(" choosed File: "+file.getName());
                System.out.println("Path is :"+file.getAbsoluteFile());

            }
               

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
