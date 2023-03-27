package calcolatrice;

import javax.swing.*;

public class Calcolatrice {

    public static void main(String[] args) {
        JFrame window = new JFrame("Calcolatrice");
        JPanel container = new JPanel();
        
        JButton buttonRisultato = new JButton("risultato: ");
        
        JLabel label = new JLabel("Espressione: ");
        JTextField numero1 = new JTextField(10);
        JTextField numero2 = new JTextField(10);
        JTextField operatore = new JTextField(1);
        JTextField risultato = new JTextField(10);
        risultato.setEditable(false);
        
        buttonRisultato.addActionListener(new buttonListener(numero1,numero2,operatore,risultato));
        
        container.add(label);
        container.add(numero1);
        container.add(operatore);
        container.add(numero2);
        container.add(buttonRisultato);
        container.add(risultato);
        
        window.add(container);
        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
