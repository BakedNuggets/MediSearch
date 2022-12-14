import java.net.URI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuickSearch extends JFrame implements ActionListener
{
    private JTextField textField;
    private Desktop dt = Desktop.getDesktop();
    JButton button1;
    JButton buttonM;
    JLabel menuLabel;
    JMenuBar menuBar;
 


    public QuickSearch()
    {
        super("Medi Search");
        setLayout(new FlowLayout());
        textField = new JTextField(" ",20);
        textField.addActionListener(this);
        add(textField);
        //setSize(400,100);
        setBackground(new Color(128, 122, 255));
        setBounds(0, 0, 500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        button1 = new JButton("Enter");
        button1.setBounds(150, 10, 200, 40);
        button1.addActionListener(this);

        buttonM = new JButton("Back");
        buttonM.setFocusable(false);
        buttonM.addActionListener(this);

        menuLabel = new JLabel();
 
        //Create the menu bar.
        menuBar = new JMenuBar();

        // Finally, add the entire options menu
        menuBar.add(buttonM);

        add(menuLabel);// Add the label to the content pane.
        setJMenuBar(menuBar);    
        add(button1);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == button1)
        {
            try
            {
                dispose();
                String text =textField.getText().replaceAll("\\s+", "+");
                dt.browse(new URI("https://www.google.com/search?q="+ text ));
            }
            catch(Exception e){}
        }

        else if(ae.getSource() == buttonM)
        {
            dispose();
            Menupage2 menuPage2 = new Menupage2();
        }
    }

  //public static void main(String args[]){
   //  new GoogleSearchers();
  //}
}