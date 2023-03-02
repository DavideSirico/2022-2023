package es06_buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Counter implements ActionListener {
    private JLabel label;
    private JButton jButton;
    private static int counter;
    public Counter()
    {
    }
    public Counter(JLabel label)
    {
        this.label = label;
    }

    public Counter(JLabel label, JButton jButton) {
        this.label = label;
        this.jButton = jButton;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {   
        System.out.println(jButton.getText());
        if(jButton.getText().equals("Counter"))
        {
            counter++;
            String dummy = Integer.toString(counter);
            label.setText(dummy);
        } else 
        {
            counter = 0;
            String dummy = Integer.toString(counter);
            label.setText(dummy);
        }
    }
    
}

