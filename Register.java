
import java.awt.event.*;
//import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;



public class Register extends JFrame
{
    
    JPanel mainPanel;
    JPanel formPanel;
    JLabel labelFirstName;
    JLabel labelLastName;
    JTextField textFirstName;
    JTextField textLastName;
    JLabel labelWelcome;
    JButton button;
    JButton buttonClear;
    JPanel buttonsPanel;

    public void initialize()
    {
        /******************* Form Panel ************/
        labelFirstName = new JLabel("Name");
        labelFirstName.setFont(new Font(null,Font.ITALIC,25));

        textFirstName = new JTextField();
        textFirstName.setFont(new Font(null,Font.ITALIC,25));


        labelLastName = new JLabel("Password");
        labelLastName.setFont(new Font(null,Font.ITALIC,25));

        textLastName = new JTextField();
        textLastName.setFont(new Font(null,Font.ITALIC,25));

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(labelFirstName);

        formPanel.add(textFirstName);

        formPanel.add(labelLastName);
        
        formPanel.add(textLastName);

        /****************** Welcome Label *******************/


        labelWelcome = new JLabel();
        labelWelcome.setFont(new Font(null,Font.ITALIC,25));

        /****************** Buttons Panel *******************/

        button = new JButton("Create");
        button.setFont(new Font(null,Font.ITALIC,25));
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==button)
                {
                    dispose();
                    Menupage2 menuPage2 = new Menupage2();
                    String firstName = textFirstName.getText();
                    String lastName = textLastName.getText();
                    labelWelcome.setText("Hello " + firstName + " " + lastName);
                }
            }

        });


        buttonClear = new JButton("Clear");
        buttonClear.setFont(new Font(null,Font.ITALIC,25));
        buttonClear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textFirstName.setText("");
                textLastName.setText("");
                labelWelcome.setText("");
            }

        });

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(button);
        buttonsPanel.add(buttonClear);



        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        //mainPanel.setBackground(new Color(128, 122, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(labelWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);


        add(mainPanel);
        setTitle("Medi Search");
        setBounds(0, 0, 500, 400);
        setLocationRelativeTo(null);
		//setSize(420,420);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }



}
