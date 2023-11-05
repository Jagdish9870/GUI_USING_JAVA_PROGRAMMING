
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;


 
public class JListpro2 extends JFrame  {
    // dynamic list.......................

    JPanel jp ,jp2;
    JTextArea jt;
    int updateIndex;
    


    JListpro2(){
        setBounds(200, 200, 400, 400);  
        setLayout(new GridLayout(1,3));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // to create dynamic list
        DefaultListModel<String> model= new DefaultListModel<>();
        model.addElement("10th");
        model.addElement("12th");
        model.addElement("diploma");

        // list.setModel(model);  we will use this if we declare default list below the list..
        // or we can simply pass the model if we declare it above the list ...
        JList<String> list = new JList<>(model);
        list.setVisibleRowCount(5);
        jp=new JPanel();
        add(jp);
        jp.add(new JScrollPane(list));

        // here you will see the selected items

        // jt= new JTextArea();
        // jt.setText("doble click to slect ");
        // jp.add(jt);

        // to add the element dynamically...............

        jp2= new JPanel();
        JTextField tf= new JTextField(" here put the component to add ");
        
        JButton jb1= new JButton("add");
        JButton jb2= new JButton("update");
        JButton jb3= new JButton("delete");
        jp2.add(tf);
         jp2.add(jb1);
          jp2.add(jb2);
           jp2.add(jb3);
           add(jp2);



        jb1.addActionListener((ActionEvent e)->{
                if(!tf.getText().toString().isEmpty())
                {
                    
                    String str= tf.getText().toString();
                    model.addElement(str);
                    tf.setText(null);

                }
            
        });

        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    updateIndex=list.getSelectedIndex();  // used to get the index of selected value...

                  
                   tf.setText((String)model.get(updateIndex));  

                }
            }
        });

        jb2.addActionListener((ActionEvent e)->{
            if(!tf.getText().toString().isEmpty()){
                    
                    String str= tf.getText().toString();
                    model.set(updateIndex,str);     // this method will update the value
                    tf.setText(null);

                }


        });
         jb3.addActionListener((ActionEvent e)->{
           model.remove(list.getSelectedIndex());   // used to remove the value...


        });
        
        
        revalidate();
    }

    public static void main(String[] args) {
        new JListpro2();
    }
    
}
