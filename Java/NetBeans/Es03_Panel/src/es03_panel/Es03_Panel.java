package es03_panel;
import javax.swing.*;
public class Es03_Panel {
    public static void main(String[] args) {
        JFrame window = new JFrame("Frame con Pannello");
        JPanel panel = new JPanel();
        
        panel.add(new JLabel("Ciao"));
        panel.add(new JLabel("adw,nhkdfhsadasfjadshbkjdsahhsjhbfsadbkfhdbjhf"));
        window.add(panel);
        
        window.setSize(100,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
}
