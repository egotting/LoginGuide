package src.gui;


import src.constants.CommandConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginGUI extends JFrame{
    // Criando O layout do programa loginGui
    public LoginGUI(){
        super(CommandConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(CommandConstants.FRAME_SIZE[0], CommandConstants.FRAME_SIZE[1]);
    
    
        addGuiComponents(); // Declarando todos os components para dentro do Layout do LoginGui
    }

    // Criando os componentes do loginGui
    public void addGuiComponents(){
        SpringLayout springLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(springLayout);


        //username
        // criando a label Username
        JLabel usernameLabel = new JLabel(" Username: ");
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        // Criando o input Username
        JTextField usernameField = new JTextField(CommandConstants.TEXTFIELD_SIZE);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 18)); 

        // estilizando Layout Username
        springLayout.putConstraint(SpringLayout.WEST, usernameLabel, 35,  SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameLabel, 85, SpringLayout.NORTH, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, usernameField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameField, 85, SpringLayout.NORTH, loginPanel);

        // Declarando o input e a label
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        this.getContentPane().add(loginPanel);

        //password

        // Criando a label Password
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        // Criando o input Password
        JPasswordField passwordField = new JPasswordField(CommandConstants.TEXTFIELD_SIZE);
        passwordField.setFont(new Font("Password", Font.PLAIN, 18));

        // estilizando Layout Password
        springLayout.putConstraint(SpringLayout.WEST, passwordLabel, 35, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordLabel, 135, SpringLayout.NORTH, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, passwordField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordField, 135, SpringLayout.NORTH, loginPanel);

        // Declarando o label e o input
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        // login button

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Dialog", Font.BOLD, 18));
        springLayout.putConstraint(SpringLayout.WEST, loginButton, 150, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, loginButton, 250, SpringLayout.NORTH, loginPanel);
        loginButton.addActionListener(new ActionListener() {    // Coloando uma ação no button de login
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();  // declarando a classe Username e password
                String password = passwordField.getText();

                if(username.equals("username") && password.equals("password")){
                    System.out.println("LOGIN SUCCESSFUL");
                }else{
                    System.out.println("LOGIN FAILED...");
                }
            }
        });

        loginPanel.add(loginButton);
        this.getContentPane().add(loginPanel);
    }
}
