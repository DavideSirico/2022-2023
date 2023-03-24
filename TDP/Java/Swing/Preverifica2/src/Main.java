import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Java");

        JPanel container = new JPanel();
        JPanel containerButtons = new JPanel();

        Matrice matrice1 = new Matrice();
        Matrice matrice2 = new Matrice();

        JButton buttonX = new JButton("X");
        JButton buttonO = new JButton("O");
        JButton buttonL = new JButton("L");

        buttonX.addActionListener(new Listener(matrice1,matrice2));
        buttonO.addActionListener(new Listener(matrice1,matrice2));
        buttonL.addActionListener(new Listener(matrice1,matrice2));

        matrice1.setLayout(new GridLayout(10, 10));
        matrice2.setLayout(new GridLayout(10, 10));

        matrice1.setBackground(Color.RED);
        matrice2.setBackground(Color.BLUE);

        matrice1.initMatrice();
        matrice1.carica();

        containerButtons.add(buttonX);
        containerButtons.add(buttonO);
        containerButtons.add(buttonL);

        container.setLayout(new GridLayout(1, 3));
        container.add(matrice1);
        container.add(containerButtons);
        container.add(matrice2);
        window.add(container);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1200, 400);
    }
}