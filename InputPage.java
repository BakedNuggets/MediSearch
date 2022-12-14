
import java.awt.event.*;
import java.io.*;

//import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class InputPage extends JFrame implements ActionListener
{
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton buttonM;
    JLabel menuLabel;
    JMenuBar menuBar;
    JMenu optionsMenu;
    JLabel buttonLabel1;
    FileOutputStream out;
    PrintStream p;

    public InputPage()
    {
        super("Medi Search");
       frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBackground(new Color(128, 122, 255)); 
       frame.setBounds(0, 0, 500, 400);
       frame.setLocationRelativeTo(null);
       Container container = frame.getContentPane();
       container.setLayout(null);

       button1 = new JButton("Head to the arm-pit");
       button1.setBounds(150, 10, 200, 40);
       button1.setFocusable(false);
       container.add(button1);
       button1.addActionListener(this);

       button2 = new JButton("Arm-pit to the waist");
       button2.setBounds(150, 70, 200, 40);
       button2.setFocusable(false);
       container.add(button2);
       button2.addActionListener(this);

       button3 = new JButton(" Waist to the knees");
       button3.setBounds(150, 130, 200, 40);
       button3.setFocusable(false);
       container.add(button3);
       button3.addActionListener(this);

       button4 = new JButton(" Knees to the soles of the feet");
       button4.setBounds(150, 190, 200, 40);
       button4.setFocusable(false);
       container.add(button4);
       button4.addActionListener(this);

       menuLabel = new JLabel();
 
       // Create the menu bar.
       menuBar = new JMenuBar();


        buttonLabel1 = new JLabel();
		//buttonLabel1.setIcon(icon2);
		buttonLabel1.setBounds(150, 250, 150, 150);
		buttonLabel1.setVisible(false); //set as false if you dont want it to appear right away



        buttonM = new JButton("Back");
        buttonM.setFocusable(false);
        buttonM.addActionListener(this);

       // Finally, add the entire options menu
       menuBar.add(buttonM);

       frame.add(button1);
       frame.add(button2);
       frame.add(button3);
       frame.add(buttonLabel1);
       frame.add(menuLabel);// Add the label to the content pane.
       frame.setJMenuBar(menuBar);// Add the menu bar to the frame.
       frame.setVisible(true);// Display the frame.optionsMenu = new JMenu("Option");



    }


  //  public static void main(String args[])
   // {

   //     InputPage inputs = new InputPage();

  //  }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // TODO Auto-generated method stub
        if(e.getSource() == button1)
        {
            frame.dispose();
            Side side = new Side();
            
        }
        
        else if(e.getSource() == button2)
        {
            frame.dispose();
            Side2 side2 = new Side2();
        }
        
        else if(e.getSource() == button3)
        {
            frame.dispose();
            Side3 side3 = new Side3();
        }

        else if(e.getSource() == button4)
        {
            frame.dispose();
            Side4 side3 = new Side4();
        }
        
        else if(e.getSource() == buttonM)
        {
            frame.dispose();
            Menupage2 menuPage2 = new Menupage2();
        }
    }


}
