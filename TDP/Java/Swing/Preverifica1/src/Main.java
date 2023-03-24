import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Java");
        JPanel panel = new JPanel();
        JButton button = new JButton("Tira: ");
        JLabel labelX = new JLabel("X: ");
        JLabel labelY = new JLabel("Y: ");
        JLabel labelDistanza = new JLabel("Distanza: ");
        JTextField x = new JTextField(3);
        JTextField y = new JTextField(3);
        JTextField distanza = new JTextField(10);

        Bersaglio bersaglio = new Bersaglio();

        ButtonListener listener = new ButtonListener(bersaglio, x, y, distanza);
        button.addActionListener(listener);

        x.setEnabled(false);
        y.setEnabled(false);
        distanza.setEnabled(false);


        panel.add(button);
        panel.add(labelX);
        panel.add(x);
        panel.add(labelY);
        panel.add(y);
        panel.add(labelDistanza);
        panel.add(distanza);
        panel.add(bersaglio);
        window.add(panel);

        window.setSize(650, 650);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}