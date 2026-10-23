import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class exp15A extends JFrame implements ActionListener{
    
    JTextField user, pass;
    JLabel msg;
    JButton login; 
    
    exp15A(){
        setTitle("Login Form!!");
        setLayout(new FlowLayout());

        add(new JLabel("UserName: "));
        user = new JTextField(15);
        add(user);

        add(new JLabel("Password: "));
        pass = new JTextField(15);
        add(pass);

        login = new JButton("Login");
        add(login);
        msg = new JLabel("");
        add(msg);
        login.addActionListener(this);
        setSize(400, 400);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent e){
        if(user.getText().equals("admin") && pass.getText().equals("1234")){
            msg.setText("Login Successful");
        } else {
            msg.setText("Invalid Credentials");
        }
    }
    public static void main(String[] args){
        new exp15A();
    }
    
}
