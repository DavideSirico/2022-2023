import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Dados");
        MyJPanel panel = new MyJPanel();

        JButton jButton1 = new JButton("Lancia dado");

        MyListener listener1 = new MyListener(panel,window);

        jButton1.addActionListener(listener1);

        panel.add(jButton1);
        window.add(panel);
        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}