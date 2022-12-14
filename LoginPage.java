import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class LoginPage implements ActionListener
{
    
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JButton signup = new JButton("SignUp");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("Username");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel();

    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> loginInfoOriginal)
    {
        logininfo = loginInfoOriginal;


        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(123,100,200,25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        loginButton.setBorder(BorderFactory.createEtchedBorder());

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        resetButton.setBorder(BorderFactory.createEtchedBorder());

        signup.setBounds(180, 230, 100, 25);
        signup.setFocusable(false);
        signup.addActionListener(this);
        signup.setBorder(BorderFactory.createEtchedBorder());

        
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(signup);

        frame.setTitle("Medi Search");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(128, 122, 255));
        frame.setBounds(0, 0, 500, 400);
        frame.setLocationRelativeTo(null);
		//frame.setSize(420,420);
		frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==resetButton)
        {
            userIDField.setText("");
            userPasswordField.setText("");

        }

        if(e.getSource()==signup)
        {
            frame.dispose();
            Register register = new Register();
            register.initialize();

        }

        if(e.getSource()==loginButton)
        {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(userID))
            {
                if(logininfo.get(userID).equals(password))
                {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successfull");
                    frame.dispose();
                    Menupage2 menuPage2 = new Menupage2();
                    //WelcomePage welcomePage = new WelcomePage(userID);
                }

                else 
                {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            }

            else 
            {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("username not found");
            }

        }
    }
    
}
