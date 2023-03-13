import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyListener implements ActionListener {
    private JTextField inputNumero1;
    private JTextField inputNumero2;
    private JLabel labelRisultato;

    public MyListener()
    {
    }
    public MyListener(JTextField inputNumero1, JTextField inputNumero2, JLabel labelRisultato)
    {
        this.inputNumero1 = inputNumero1;
        this.inputNumero2 = inputNumero2;
        this.labelRisultato = labelRisultato;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int numero1 = Integer.parseInt(inputNumero1.getText());
        int numero2 = Integer.parseInt(inputNumero2.getText());
        int risultato = numero1 + numero2;
        labelRisultato.setText(Integer.toString(risultato));
    }
}

