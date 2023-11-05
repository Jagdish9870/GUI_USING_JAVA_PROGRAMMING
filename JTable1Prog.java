import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable1Prog {
    public static void main(String[] args) {

        // simple table creation...............
          JFrame jf = new JFrame("jframe");
        jf.setBounds(200, 200, 600, 400);  
        // jf.setLayout(null);      // layout dont work for table
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         String[][] data= {
            {"001","ram","CSE"},
            {"002","shyam","EcE"}
        };
        
        String[] col={ "roll","Name","Course"};
      
        JTable t= new JTable(data,col);
        
        
        
        jf.add(new JScrollPane(t));
        jf.setVisible(true);
        
    }
    
}
