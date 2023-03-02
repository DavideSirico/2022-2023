package es07_convertitore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Convertitore implements ActionListener {
    private JTextField textFieldDec;
    private JTextField textFieldBin;
    
    public Convertitore()
    {
    }
    
    public Convertitore(JTextField textFieldDec, JTextField textFieldBin)
    {
        this.textFieldDec = textFieldDec;
        this.textFieldBin = textFieldBin;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String dummy = textFieldDec.getText();
        try{
            dummy = Integer.toBinaryString(Integer.parseInt(dummy));
            textFieldBin.setText(dummy);
        } catch (NumberFormatException ex)
        {
            textFieldBin.setText("Lol \"" + textFieldDec.getText() + "\" non è un numero");
        }
    }
}

