import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main implements ActionListener{

  private static JFrame frame;
  private static JPanel panel;
  private static JLabel userLabel;
  private static JTextField userText;
  private static JLabel passwordLabel;
  private static JPasswordField passwordText;
  private static JButton button;
  private static JLabel successLabel;
  
  public static void main(String[] args) {

    frame = new JFrame();
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel = new JPanel();
    panel.setLayout(null);

    userLabel = new JLabel("User");
    userLabel.setBounds(10, 20, 80, 25);

    userText = new JTextField();
    userText.setBounds(100, 20, 165, 25);

    passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(10, 60, 80, 25);

    passwordText = new JPasswordField();
    passwordText.setBounds(100, 60, 165, 25);
    
    button = new JButton("Login");
    button.addActionListener(new Main());
    button.setBounds(10, 100, 80, 25);

    successLabel = new JLabel();
    successLabel.setBounds(10, 130, 80, 25);
    successLabel.setForeground(Color.green);
    //successLabel.setText("Success!");
    

    frame.add(successLabel);
    frame.add(button);
    frame.add(passwordText);
    frame.add(passwordLabel);
    frame.add(userText);
    frame.add(userLabel);
    frame.add(panel);
    frame.setVisible(true);

    
  
  }

  public void actionPerformed(ActionEvent e){
    String user = userText.getText();
    String password = passwordText.getText();

    if(user.equals("ryan") && password.equals("123")){
      successLabel.setText("Sucess!");
    }
    
  }







  
  
  // public void actionPerformed(ActionEvent e){
  //   String user = userText.getText();
  //   String password = passwordText.getText();
  //   // if(userText.getText() == "ryan" && passwordLabel.getText() == "123"){
  //   //   //successLabel.setText("Success!");
  //   //   System.out.println("Success");
  //   // }
  //   if(user.equals("ryan") && password.equals("123")){
  //     successLabel.setText("Login Successful!");
  //   }
}
