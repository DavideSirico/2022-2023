package es06_buttons;
import javax.swing.*;
/*
Scrivi un programma con la libreria Swing che abbia due bottoni.
Un bottone con il testo "Clicca Qui" e un tasto con la scritta "Reset".
Il programma deve contare e riprodurre quanti click sono stati fatti con il bottone
e premendo reset deve essere visualizzata una JOptionpane con il totale dei click
il contatore deve essere resettato.

*/
public class Es06_Buttons {
    public static void main(String[] args) {
        JFrame window = new JFrame("Frame con Pannello");
        JPanel panel = new JPanel();
        
        JButton jButton1 = new JButton("Counter");
        JButton jButton2 = new JButton("Reset");
        JLabel jLContatore = new JLabel("0");
        
        Counter listener1 = new Counter(jLContatore,jButton1);
        Counter listener2 = new Counter(jLContatore,jButton2);
        
        jButton1.addActionListener(listener1);
        jButton2.addActionListener(listener2);
        
        panel.add(jButton1);
        panel.add(jButton2);
        panel.add(jLContatore);
        
        window.add(panel);
        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }    
}
