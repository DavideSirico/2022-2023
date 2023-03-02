package es07_convertitore;

import javax.swing.*;

public class Es07_Convertitore {
    public static void main(String[] args) {
        JFrame window = new JFrame("Frame con Pannello");
        JPanel panel = new JPanel();
        
        JButton jButtonConverti = new JButton("Converti");
        
        JTextField jTextFieldDec = new JTextField(20);
        JTextField jTextFieldBin = new JTextField(20);
        
        Convertitore listener1 = new Convertitore(jTextFieldDec,jTextFieldBin);
        
        jButtonConverti.addActionListener(listener1);
        
        jTextFieldBin.setEnabled(false);
        
        panel.add(jTextFieldDec);
        panel.add(jButtonConverti);
        panel.add(jTextFieldBin);
        
        window.add(panel);
        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
