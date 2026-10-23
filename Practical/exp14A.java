
import javax.swing.*;
import java.awt.*;

public class exp14A {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Controls");

        f.setSize(600, 550);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu bar
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem blueItem = new JMenuItem("Blue");

        JMenu redMenu = new JMenu("Red");
        redMenu.add(new JMenuItem("Light Red"));
        redMenu.add(new JMenuItem("Dark Red"));

        menu.add(blueItem);
        menu.add(redMenu);
        mb.add(menu);
        f.setJMenuBar(mb);

        // Label
        JLabel label = new JLabel("Enter Name:");
        label.setBounds(30, 30, 100, 25);
        f.add(label);

        // Text field
        JTextField tf = new JTextField();
        tf.setBounds(140, 30, 180, 25);
        f.add(tf);

        // Button
        JButton btn = new JButton("Submit");
        btn.setBounds(340, 30, 100, 25);
        f.add(btn);

        // Text area
        JTextArea ta = new JTextArea();
        ta.setBounds(30, 75, 250, 80);
        f.add(ta);

        // Check boxes
        JCheckBox yes = new JCheckBox("Yes");
        yes.setBounds(30, 170, 70, 25);
        f.add(yes);

        JCheckBox no = new JCheckBox("No");
        no.setBounds(110, 170, 70, 25);
        f.add(no);

        // List using DefaultListModel
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Red");
        model.addElement("Blue");
        model.addElement("Black");

        JList<String> list = new JList<>(model);
        JScrollPane sp = new JScrollPane(list);
        sp.setBounds(30, 210, 120, 90);
        f.add(sp);

        // Blue panel with On and Off buttons
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        panel.setBounds(200, 210, 250, 100);

        JButton on = new JButton("On");
        on.setBounds(25, 30, 80, 30);
        panel.add(on);

        JButton off = new JButton("Off");
        off.setBounds(130, 30, 80, 30);
        panel.add(off);

        f.add(panel);

        f.setVisible(true);
    }
}
