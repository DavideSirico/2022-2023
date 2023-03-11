import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        MyPanel p = new MyPanel();
        f.add(p);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}