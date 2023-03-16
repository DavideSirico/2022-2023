import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Cerchi");
        Cerchio cerchio = new Cerchio();

        JButton aggiungiButton = new JButton("Aggiungi cerchio");
        JButton rimuoviButton = new JButton("Rimuovi cerchio");

        cerchio.add(aggiungiButton);
        cerchio.add(rimuoviButton);

        aggiungiButton.addActionListener(e -> {
            cerchio.drawCircle();
            cerchio.repaint();
        });

        rimuoviButton.addActionListener(e -> {
            cerchio.removeCircle();
            cerchio.repaint();
        });


        window.add(cerchio);
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}