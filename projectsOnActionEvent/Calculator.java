package projectsOnActionEvent;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("calculator ");
        jf.setSize(400,200);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel l1= new JLabel("First Number");
        l1.setBounds(20, 50, 200, 50);
        l1.setFont(new Font("arial",Font.BOLD,20));
        jf.add(l1);

        JTextField tf= new JTextField();
        tf.setBounds(200, 50, 300, 40);
        jf.add(tf);

        JLabel l2= new JLabel("Second Number");
        l2.setBounds(20, 150, 200, 50);
        l2.setFont(new Font("arial",Font.BOLD,20));
        jf.add(l2);
        JTextField tf2= new JTextField();
        tf2.setBounds(200, 150, 300, 40);
        jf.add(tf2);

       
        JButton jb = new JButton("+");
        jb.setBounds(100,250,50,50);
        jb.setFont(new Font("arial",Font.BOLD,20));
        jf.add(jb);
        JButton jb2 = new JButton("-");
        jb2.setBounds(150,250,50,50);
        jb2.setFont(new Font("arial",Font.BOLD,20));
        jf.add(jb2);
        JButton jb3 = new JButton("*");
        jb3.setBounds(200,250,50,50);
        jb3.setFont(new Font("arial",Font.BOLD,20));
        jf.add(jb3);
        JButton jb4 = new JButton("/");
        jb4.setBounds(250,250,50,50);
        jb4.setFont(new Font("arial",Font.BOLD,20));
        jf.add(jb4);
        JButton jb5 = new JButton("%");
        jb5.setBounds(300,250,50,50);
        jb5.setFont(new Font("arial",Font.BOLD,20));
        jf.add(jb5);

        JLabel l3= new JLabel("Result");
        l3.setBounds(20, 350, 200, 50);
        l3.setFont(new Font("arial",Font.BOLD,20));
        jf.add(l3);
        JTextField tf3= new JTextField();
        tf3.setBounds(200, 350, 100, 40);
        tf3.setEditable(false);
        jf.add(tf3);

        //event handling.................................................................................................................................

        jb.addActionListener((ActionEvent a)->
        {
            int num1=Integer.parseInt (tf.getText());
            int num2= Integer.parseInt(tf2.getText());
            int num3= num1+num2;
            tf3.setText(" "+num3);
        }
        );
        jb2.addActionListener((ActionEvent a)->{
            int num1=Integer.parseInt(tf.getText());
            int num2= Integer.parseInt(tf2.getText());
            int num3=num1-num2;
            tf3.setText(" "+num3);

        });
        jb3.addActionListener((ActionEvent a)->{
            int num1=Integer.parseInt(tf.getText());
            int num2= Integer.parseInt(tf2.getText());
            int num3=num1*num2;
            tf3.setText(" "+num3);

        });
        jb4.addActionListener((ActionEvent a)->{
            int num1=Integer.parseInt(tf.getText());
            int num2= Integer.parseInt(tf2.getText());
            try{
            int num3=num1/num2;
            tf3.setText(" "+num3);
            }
            catch(Exception e){
                tf3.setText("invalid input");
            }
            

        });
        jb5.addActionListener((ActionEvent a)->{
            int num1=Integer.parseInt(tf.getText());
            int num2= Integer.parseInt(tf2.getText());

            
             try{
            int num3=num1%num2;
            tf3.setText(" "+num3);
            }
            catch(Exception e){
                tf3.setText("invalid input");
            }
            

        });





        
    }
    
}
