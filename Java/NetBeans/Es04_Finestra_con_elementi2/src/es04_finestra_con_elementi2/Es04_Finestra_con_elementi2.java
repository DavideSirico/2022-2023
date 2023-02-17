package es04_finestra_con_elementi2;
import java.awt.Color;
import javax.swing.*;

public class Es04_Finestra_con_elementi2 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Frame con Pannello");
        JPanel panel = new JPanel();
        
        JLabel jLabelName = new JLabel("Nome: ");
        JLabel jLabelCognome = new JLabel("Cognome: ");
        JTextArea jTextAreaInput1 = new JTextArea(15,15);
        JTextField jTextFieldInput2 = new JTextField(20);
        JButton jButtonButton = new JButton("Bottone: ");
        // di default è cliccabile
        jButtonButton.setText("Questo è un bottone");
        // con il click del bottone viene creato un oggetto Event
        // per controllare l'oggetto bisogna usare un ascoltatore (listener)
        // implementare un'interfaccia che gestista più bottoni
        jButtonButton.setActionListener(new MyClass());
        
        panel.setBackground(Color.GRAY);
        panel.add(jLabelName);
        panel.add(jTextAreaInput1);
        panel.add(jLabelCognome);
        panel.add(jTextFieldInput2);
        panel.add(jButtonButton);
        
        window.add(panel);
        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        int i = 0;
        while(true)
        {
            String dummy = Integer.toString(i);
            panel.remove(jLabelName);
            jLabelName = new JLabel(dummy);
            panel.add(jLabelName);
            window.setVisible(true);
            i++;
        }
    }
}
