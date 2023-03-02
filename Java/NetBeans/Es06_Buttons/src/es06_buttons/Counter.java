package es06_buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Counter implements ActionListener {
    private JLabel label;
    public Counter()
    {
    }
    public Counter(JLabel label)
    {
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {   
        String dummy = label.getText();
        int counter = Integer.parseInt(dummy);
        counter++;
        dummy = Integer.toString(counter);
        label.setText(dummy);
    }
    
}

