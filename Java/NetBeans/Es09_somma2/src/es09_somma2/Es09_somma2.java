package es09_somma2;
import javax.swing.*;
public class Es09_somma2 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Somma 2 numeri");
        JPanel panel = new JPanel();
        JTextField inputNumero1 = new JTextField(10);
        JTextField inputNumero2 = new JTextField(10);

        JLabel labelNumero1 = new JLabel("Primo numero");
        JLabel labelNumero2 = new JLabel("Secondo numero");
        JLabel label3 = new JLabel("Somma");
        JButton buttonRisultato = new JButton("Somma");
        JLabel labelRisultato = new JLabel("0");

        MyListener listener1 = new MyListener(inputNumero1,inputNumero2,labelRisultato);
        buttonRisultato.addActionListener(listener1);

        panel.add(labelNumero1);
        panel.add(inputNumero1);
        panel.add(labelNumero2);
        panel.add(inputNumero2);
        panel.add(buttonRisultato);
        panel.add(label3);
        panel.add(labelRisultato);
        window.add(panel);

        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}