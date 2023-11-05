import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.*;

// for the addition of new row.......

public class JTable2Prog {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Table");
        jf.setBounds(200, 200, 600, 400);  
       
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        String[] colm={ "roll","Name","Course"};
        Object[][] data= {
            {"001","ram","CSE"},
            {"002","shyam","EcE"}
        };
        
       
        JTable t= new JTable(model);
        
        jf.setLayout(new GridLayout(3,1));
        jf.add(new JScrollPane(t));
        jf.add(new JPanel());
        JPanel jp= new JPanel();
        jf.add(jp);

        JButton jb= new JButton("ADD");
        JButton jb2= new JButton("UPDATE");
        JButton jb3= new JButton("DELETE");

        JTextArea ta = new JTextArea();
        JTextArea ta2 = new JTextArea();
        JTextArea ta3 = new JTextArea();

        jp.setLayout(new GridLayout(3,3));

        jp.add(new JLabel("Roll"));
        jp.add(ta);
        jp.add(jb);
        
        // adding text areas........
        jp.add(new JLabel("Name"));
        jp.add(ta2);
        jp.add(jb2);
        
        //adding buttons...........
        jp.add(new JLabel("Course"));
        jp.add(ta3);
        jp.add(jb3);
        
        
        
        jf.setVisible(true);
        jb.addActionListener((ActionEvent e)->{

            int Roll= Integer.parseInt(ta.getText().toString());
            String Name=ta2.getText().toString();
            String Course=ta3.getText().toString();

             Object[] newRow={Roll,Name,Course};
            // t.addRow(newRow);
             ta.setText(null);
              ta2.setText(null);
               ta3.setText(null);

        });
        






        
        
    }
    
}
