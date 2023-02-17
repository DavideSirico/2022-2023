package es05_buttons;
import java.awt.Color;
import javax.swing.*;

public class Es05_Buttons {
    public static void main(String[] args) {
        JFrame window = new JFrame("Frame con Pannello");
        JPanel panel = new JPanel();
        
        JButton jButton1 = new JButton("Bottone 1");
        JButton jButton2 = new JButton("Bottone 2");
        
        Popup listener1 = new Popup();
        ChangeColor listener2 = new ChangeColor(panel);
        
        jButton1.addActionListener(listener1);
        jButton2.addActionListener(listener2);
        
        
        panel.setBackground(Color.YELLOW);
        panel.add(jButton1);
        panel.add(jButton2);
        
        window.add(panel);
        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }    
}
