import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Combo Box");
        MyPanel panel = new MyPanel();

        JLabel label = new JLabel("Select a choice:");
        String[] choices = { "item 1", "item 2", "item 3", "item 4", "item 5"};
        JComboBox<String> cb = new JComboBox<String>(choices);
        JTextField textField = new JTextField(10);


        cb.addActionListener(new MyActionListener(cb,panel,textField));


        panel.add(textField);
        panel.add(label);
        panel.add(cb);

        window.add(panel);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocation(430, 100);
    }
}
