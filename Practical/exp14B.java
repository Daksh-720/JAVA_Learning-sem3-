
import javax.swing.*;
import java.awt.*;

public class exp14B {
    public static void main(String[] args) {
        JFrame f = new JFrame("System components example!");
        f.setSize(400, 300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("Enter your name:");
        JTextField t = new JTextField(15);
        JButton b = new JButton("Submit");

        String options[] = {
            "Option 1", "Option 2", "Option 3", "Option 4"
        };
        JComboBox<String> cb = new JComboBox<>(options);

        JTextArea ta = new JTextArea(5, 25);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        f.add(l);
        f.add(t);
        f.add(b);
        f.add(cb);
        f.add(new JScrollPane(ta));

        b.addActionListener(e -> {
            ta.setText("Name : " + t.getText() + ", Selected: " + cb.getSelectedItem());
            t.setText("");
        });

        f.setVisible(true);
    }
}
