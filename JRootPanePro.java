


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

public class JRootPanePro extends JFrame {
    /*
    --> rootpane is behind the scene conatiner of Jframe, Jdialogue,Jwindow,Japplet,and JInternetPane....

    Parts :
    1. ContentPane
    2.Opitional MenuBar
    3.LayeredPane
    4.GlassPane
     */

    JRootPanePro(){
        setBounds(200, 200, 600, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());



        JRootPane rp= new JRootPane();

        JButton jb = new JButton("click");
        JMenuBar mb= new JMenuBar();
        JMenu file= new JMenu("File");
        file.add("open");
        file.add("save");
        mb.add(file);

        rp.getContentPane().add(jb);
        rp.setJMenuBar(mb);
        add(rp);







        
        setVisible(true);
    }

    public static void main(String[] args) {
        new JRootPanePro();
    }
    
}
