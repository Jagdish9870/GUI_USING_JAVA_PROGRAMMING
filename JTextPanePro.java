import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class JTextPanePro extends JFrame {

    JTextPane tp;

    JTextPanePro(){
        setBounds(200, 200, 600, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        tp= new JTextPane();
        tp.setText("this is ");
        add(tp);
        // getContentPane().add(tp);   // can also use this method.................

        SimpleAttributeSet sas= new SimpleAttributeSet();   // this class is used to style the specific text...#necassary
       StyleConstants.setBold(sas, true);          // to do bold the text

      // tp.setCharacterAttributes(sas, true);  // it is used to apply style on whole text..
      // but we want to apply style seprately......

      Document doc =tp.getStyledDocument();
      try {
        doc.insertString(doc.getLength(), "textpane,", sas);    // here we define which txt is to be bold

        // we have to write these line everytime to style text element
        sas= new SimpleAttributeSet();
        StyleConstants.setItalic(sas, true);   // this will do text format in italic .... 
        doc.insertString(doc.getLength(), " program ", sas);

        sas= new SimpleAttributeSet();
        StyleConstants.setUnderline(sas, true);   // this will do text format in underline .... 
        doc.insertString(doc.getLength(), "and it is ", sas);

        sas= new SimpleAttributeSet();
        StyleConstants.setBackground(sas, Color.black);     
        StyleConstants.setForeground(sas, Color.RED);  

        doc.insertString(doc.getLength(), " part of java swing", sas);




    } catch (BadLocationException e) {
       
    }
        
        revalidate();
        
        setVisible(true);
    }

    public static void main(String[] args) {
        // in textpane we can style our font unlike TextArea.........
        new JTextPanePro();
    }
    
}
