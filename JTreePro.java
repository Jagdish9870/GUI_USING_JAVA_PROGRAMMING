
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreePro extends JFrame {

    JTreePro(){
        setBounds(200, 200, 600, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        DefaultMutableTreeNode eng = new DefaultMutableTreeNode("ENngineering");
        DefaultMutableTreeNode medic = new DefaultMutableTreeNode("medical field");
        
        DefaultMutableTreeNode eng1 = new DefaultMutableTreeNode("CSE");
        DefaultMutableTreeNode eng2 = new DefaultMutableTreeNode("ECE");
        eng.add(eng1);
        eng.add(eng2);
        
        DefaultMutableTreeNode mdic1 = new DefaultMutableTreeNode("MBBs");
        DefaultMutableTreeNode mdic2 = new DefaultMutableTreeNode("Pharma");
        medic.add(mdic1);
        medic.add(mdic2);
        // root node
        DefaultMutableTreeNode top= new DefaultMutableTreeNode("Science");
        top.add(eng);
        top.add(medic);
        
        JTree tree= new JTree(top);
        add(tree);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JTreePro();
    }
    
}
