import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URI;
import java.util.*;
import javax.swing.*;



public class GoogleSearchers extends JFrame implements ActionListener
{
  private JTextField textField;
  private Desktop dt = Desktop.getDesktop();
  JButton button1;
  File myObj;
  String data;
  public GoogleSearchers() throws IOException
  {
     super("Medi Search");
     setLayout(new FlowLayout());
     textField = new JTextField("",20);
     textField.addActionListener(this);
     add(textField);
     setBackground(new Color(128, 122, 255));
     setBounds(0, 0, 500, 400);
     setLocationRelativeTo(null);
     //setSize(400,100);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     
      button1 = new JButton("Enter");
      button1.setFocusable(false);
      button1.setBounds(150, 10, 200, 40);
      button1.addActionListener(this);

      add(textField);
      add(button1);
      setSize(550,250);
      setVisible(true);
  
      try {
        myObj = new File("MyFile.txt");
        Scanner myReader = new Scanner(myObj);
        data = myReader.nextLine();
        System.out.println(data);
        
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
   }
 

    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource() == button1)
    {
      try
      {
        dispose();
        String text =textField.getText().replaceAll("\\s+", "+");
        dt.browse(new URI("https://www.google.com/search?q="+ data + "+" + text));
      }
      catch(Exception e){}
    }
  }

 //public static void main(String args[]) throws IOException{
  // new GoogleSearchers();
  //}
}