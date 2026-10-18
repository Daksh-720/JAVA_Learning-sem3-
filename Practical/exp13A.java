import java.awt.*;
import java.awt.event.*;



public class exp13A extends Frame implements ActionListener{
   TextField user, pass;
   Button login;
   Label msg;
   
    exp13A(){
        setTitle("Login Form");
        setLayout(new FlowLayout());

        add(new Label("Username: "));
        user = new TextField(15);
        add(user);

        add(new Label("Password: "));
        pass = new TextField(15);
        pass.setEchoChar('*');
        add(pass);

        login = new Button("Login");
        add(login);
        msg = new Label("");
        add(msg);
        
        login.addActionListener(this);
        setSize(300, 200);
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
        new exp13A();
    }
}
