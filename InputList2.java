
import java.awt.event.*;
import java.io.*;

//import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class InputList2 extends JFrame implements ActionListener
{
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton buttonM;
    JLabel menuLabel;
    JMenuBar menuBar;
    JMenu optionsMenu;
    JLabel buttonLabel1;
    FileOutputStream out;
    PrintStream p;
    

    public InputList2()
    {
        super("Medi Search");
       frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBackground(new Color(128, 122, 255)); 
       frame.setBounds(0, 0, 500, 400);
       frame.setLocationRelativeTo(null);
       Container container = frame.getContentPane();
       container.setLayout(null);

       button1 = new JButton("Upper Arms");
       button1.setBounds(150, 10, 200, 40);
       button1.setFocusable(false);
       container.add(button1);
       button1.addActionListener(this);

       button2 = new JButton("Forearms");
       button2.setBounds(150, 70, 200, 40);
       button2.setFocusable(false);
       container.add(button2);
       button2.addActionListener(this);

       button3 = new JButton("Hands");
       button3.setBounds(150, 130, 200, 40);
       button3.setFocusable(false);
       container.add(button3);
       button3.addActionListener(this);

       button4 = new JButton("Stomach");
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
       frame.add(button4);
       frame.add(buttonLabel1);
       frame.add(menuLabel);// Add the label to the content pane.
       frame.setJMenuBar(menuBar);// Add the menu bar to the frame.
       frame.setVisible(true);// Display the frame.optionsMenu = new JMenu("Option");



    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // TODO Auto-generated method stub

            if(e.getSource() == button1)
        {
            try 
            {
                frame.dispose();
               
                FileWriter writer = new FileWriter("MyFile.txt", true);
                writer.write("+");
                writer.write("Upper Arms");
                writer.close();
                GoogleSearchers google = new GoogleSearchers();
            } catch (IOException ae) 
            {
                ae.printStackTrace();
            }
        }
        
        if(e.getSource() == button2)
        {
            try
            {
                    // Create a new file output stream
                    // connected to "MyFile.txt"

                    
                frame.dispose();
                FileWriter writer = new FileWriter("MyFile.txt", true);
                writer.write("+");
                writer.write("Forearms");
                writer.close();
                GoogleSearchers google = new GoogleSearchers();
            } catch (IOException ae) 
            {
                ae.printStackTrace();
            }
        }



        if(e.getSource() == button3)
        {
            try
            {
                // Create a new file output stream
                // connected to "myfile.txt"
                frame.dispose();
                FileWriter writer = new FileWriter("MyFile.txt", true);
                writer.write("+");
                writer.write("Hands");
                writer.close();
                GoogleSearchers google = new GoogleSearchers();
            } catch (IOException ae) 
            {
                ae.printStackTrace();
            }
        }
        if(e.getSource() == button4)
        {
            try
            {
                // Create a new file output stream
                // connected to "myfile.txt"
              
                frame.dispose();
                FileWriter writer = new FileWriter("MyFile.txt", true);
                writer.write("+");
                writer.write("stomach");
                writer.close();
                GoogleSearchers google = new GoogleSearchers();
            } catch (IOException ae) 
            {
                ae.printStackTrace();
            }
        }
        if(e.getSource() == buttonM)
        {
            frame.dispose();
            InputPage inputPage = new InputPage(); 
        }
    }


}
