import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerPro extends JFrame implements ChangeListener{
/* 
    JSpinner is single line input field that allows the user to select a number or items in  sequence  
    use upward or downward arrow to show the previous or next element...*/

    JSpinner s1,s2,s3;
    JLabel jl;
    
    

    JSpinnerPro(){
        setBounds(200, 200, 600, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        s1= new JSpinner();
        s1.setModel(new SpinnerNumberModel(1, 1, 31, 1)); //
        s1.setBounds(80, 70, 90, 30);
        add(s1);
        s2 = new JSpinner();
        s2.setModel(new SpinnerListModel(new String[]{"JAN","FEB","MAR","APR","MAY","JUNE","JULY","AUG","SEPT","OCT","NOV","DEC"}));
        s2.setBounds(80, 120, 90, 30);
        add(s2);

        String str= String.valueOf(java.time.Year.now());
        int curr= Integer.parseInt(str);
        s3 = new JSpinner( new SpinnerNumberModel(curr,curr-100,curr,1));
        s3.setBounds(80, 170, 90, 30);
        add(s3);

        jl= new JLabel();
        jl.setBounds(80, 280, 200, 200);
        add(jl);
        setDOB();
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);
        
        
        setVisible(true);
        revalidate();

    }

    private void setDOB() {

        int date=(Integer)s1.getValue();
        String month=(String)s2.getValue();
        int year=(Integer)s3.getValue();
        jl.setText("DOB is : "+date+" / "+month+" / "+year);
    }



    public static void main(String[] args) {
        new JSpinnerPro();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
       setDOB();
    }
    
}
