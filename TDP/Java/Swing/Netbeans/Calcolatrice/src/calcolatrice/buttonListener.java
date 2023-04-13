package calcolatrice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class buttonListener implements ActionListener{
    
    private JTextField numero1;
    private JTextField numero2;
    private JTextField operatore;
    private JTextField risultato;

    public buttonListener(JTextField numero1, JTextField numero2, JTextField operatore, JTextField risultato) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operatore = operatore;
        this.risultato = risultato;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1;
        int num2;
        String op;
        
        try{
            num1 = Integer.parseInt(numero1.getText());
            num2 = Integer.parseInt(numero2.getText());
        } catch (Exception ex)
        {
            risultato.setText("Numeri non validi");
            return;
        }
        
        op = operatore.getText();
        
        switch(op){
            case "+":
                risultato.setText(Integer.toString(num1+num2));
                break;
            case "-":
                risultato.setText(Integer.toString(num1-num2));
                break;
            case "*":
                risultato.setText(Integer.toString(num1*num2));
                break;
            case "/":
                try{
                    risultato.setText(Integer.toString(num1/num2));
                } catch(Exception ex)
                {
                    risultato.setText("Impossibile dividere per zero");
                }
                break;
            default:
                risultato.setText("non è un segno matematico supportato");
                break;
        }
    }
    
    
}
