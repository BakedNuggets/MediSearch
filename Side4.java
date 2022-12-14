
import java.awt.event.*;
import java.io.*;

//import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class Side4 extends JFrame implements ActionListener
{
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton buttonM;
    JLabel menuLabel;
    JMenuBar menuBar;
    JMenu optionsMenu;
    JLabel buttonLabel1;
    
    

    public Side4()
    {
        super("Medi Search");
       frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBackground(new Color(128, 122, 255)); 
       frame.setBounds(0, 0, 500, 400);
       frame.setLocationRelativeTo(null);
       Container container = frame.getContentPane();
       container.setLayout(null);

       button1 = new JButton("Front");
       button1.setBounds(150, 10, 200, 40);
       button1.setFocusable(false);
       container.add(button1);
       button1.addActionListener(this);

       button2 = new JButton("Back");
       button2.setBounds(150, 70, 200, 40);
       button2.setFocusable(false);
       container.add(button2);
       button2.addActionListener(this);



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
                FileWriter writer = new FileWriter("MyFile.txt", false);
                writer.write("front");
                writer.close();
                InputList4 inputList4 = new InputList4();
            } catch (IOException ae) 
            {
                ae.printStackTrace();
            }
                
        }

        else if(e.getSource() == button2)
        {
        
            try 
            {
                frame.dispose();
                FileWriter writer2 = new FileWriter("MyFile.txt", false);
                writer2.write("back");
                writer2.close();
                InputList4 inputList4 = new InputList4();
            } catch (IOException ae) 
            {
                ae.printStackTrace();
            }

                
        }
        
        else if(e.getSource() == buttonM)
        {
            frame.dispose();
            InputPage inputPage = new InputPage();
        }
        
    }

    
}