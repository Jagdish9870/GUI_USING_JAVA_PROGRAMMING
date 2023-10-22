import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarProg {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(200, 200, 600, 400); 
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuBar mb= new JMenuBar();       //menu bar
        JMenu f= new JMenu("FILE");        // menu
        JMenuItem i1= new JMenuItem("new");    //menu items
        JMenuItem i2= new JMenuItem("open"); // menu items
        JMenu i3= new JMenu("save");             //menu itmes but as a sub menu

            JMenuItem i4= new JMenuItem("save");    // menu items of sub menu
            JMenuItem i5= new JMenuItem("save as");     // menu items of sub menu
            i3.add(i4);
            i3.add(i5);


        f.add(i1);      // adding menu items into menus
        f.add(i2);      // adding menu items into menus
        f.add(i3);      // adding submenu items into menus


        mb.add(f);  // adding menuitems into menubar


        JMenu e= new JMenu("Edit");    // second menu
        mb.add(e);

        JMenu m= new JMenu("More");   //third menu
        mb.add(m);

        jf.setJMenuBar(mb);        // adding menubar into jframe............
        


    }
    
}
