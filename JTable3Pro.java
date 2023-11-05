
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;


// for the updatation of new row

class frame14 extends JFrame {
    JTable t;

    public frame14(){
        setBounds(200, 200, 600, 400);  
        setVisible(true);
        setDefaultCloseOperation(frame14.EXIT_ON_CLOSE);
        

        Object[][] data= {
            {001,"ram","CSE"},
            {002,"shyam","EcE"}
        };
        String[] columNames={ "roll","Name","Course"};
        
       DefaultTableModel model= new DefaultTableModel(data,columNames);

       t = new JTable(model);
        
        setLayout(new GridLayout(3,1));
        add(new JScrollPane(t));
        add(new JPanel());
        JPanel jp= new JPanel();
        add(jp);

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
        
        
        
        setVisible(true);
        // jb.addActionListener((ActionEvent e)->{

        //     int Roll= Integer.parseInt(ta.getText());
        //     String Name=ta2.getText();
        //     String Course=ta3.getText();

        //      Object[] newRow={Roll,Name,Course};
        //      t.insertRow(newRow);
        //      ta.setText(null);
        //       ta2.setText(null);
        //        ta3.setText(null);

        // });
      t.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent m){
            int rowIndex=model.getSelectedRow();
            int roll= (int)model.getValueAt(rowIndex, 0);
            String name=(String)model.getValueAt(rowIndex,1);
            String course=(String)model.getValueAt(rowIndex,2);
            
            ta.setText(String.valueOf(roll));
            ta2.setText(name);
            ta3.setText(course);
          


        }
      });
    }
}

public class JTable3Pro {
    public static void main(String[] args) {
        frame14 f= new frame14();
        


    }
    
}






        
        
    
