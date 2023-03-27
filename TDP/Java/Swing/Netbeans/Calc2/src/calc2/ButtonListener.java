package calc2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonListener implements ActionListener{
    private JFrame frame;
    private JLabel number;
    private int numb;
    private String simbolo;
    public ButtonListener(JFrame frame,JLabel number)
    {
        this.frame = frame;
        this.number = number;
        numb = 0;
        simbolo = "";
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("=") || ae.getActionCommand().equals("+") || ae.getActionCommand().equals("-") || ae.getActionCommand().equals("*") || ae.getActionCommand().equals("/"))
        {
            if(ae.getActionCommand().equals("="))
            {
                int ris = 0;
                switch(simbolo)
                {
                    case "+":
                        ris = Integer.parseInt(number.getText())+numb;
                        break;
                    case "-":
                        ris = Integer.parseInt(number.getText())-numb;
                        break;
                    case "/":
                        ris = Integer.parseInt(number.getText())/numb;
                        break;
                    case "*":
                        ris = Integer.parseInt(number.getText())*numb;
                        break;
                }
                System.out.println("ris: "+ris);
                number.setText(Integer.toString(ris));
            } else {
                numb = Integer.parseInt(number.getText());
                number.setText("");
                simbolo = ae.getActionCommand();
            }
        }else{
            number.setText(number.getText()+ae.getActionCommand());
        }
    }
}
