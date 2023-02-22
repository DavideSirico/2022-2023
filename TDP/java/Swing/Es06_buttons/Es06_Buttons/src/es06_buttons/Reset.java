package es06_buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Reset implements ActionListener {
    private JLabel label;
    Reset()
    {
    }
    Reset(JLabel label)
    {
        this.label = label;
    }
            
    @Override
    public void actionPerformed(ActionEvent e)
    {   
        label.setText("0");
    }
    
}
