import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
 
public class JListPro extends JFrame {
    // static list.......................
    String items[]={ "item1","item2","item3","item4","item5","item6","item7","item8","item9","item10"};
    JPanel jp;
    JTextArea jt;
    


    JListPro(){
        setBounds(200, 200, 600, 400);  
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JList<String> list = new JList<>(items);
        list.setVisibleRowCount(5);
        jp=new JPanel();
        jp.add(new JScrollPane(list));
        add(jp);

        jt= new JTextArea();
        jt.setText("doble click to slect ");
        jp.add(jt);


        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    int index=list.getSelectedIndex();
                    String str= (String)list.getSelectedValue();
                    jt.setText("index : "+ index+ " \n"+"selected item : "+ str);

                }
            }
        });
        
        
        revalidate();
    }

    public static void main(String[] args) {
        new JListPro();
    }
    
}
