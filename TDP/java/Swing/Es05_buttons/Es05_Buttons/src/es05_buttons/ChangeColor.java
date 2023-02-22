package es05_buttons;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class ChangeColor implements ActionListener {
    private JPanel panel;
    private final Color[] colors = {Color.YELLOW, Color.BLUE, Color.CYAN};
    
    public ChangeColor()
    {
        
    }
    public ChangeColor(JPanel panel)
    {
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        /*
        if(panel.getBackground() == Color.YELLOW)
        {
            panel.setBackground(Color.RED);
        } else {
            panel.setBackground(Color.YELLOW);
        }*/
        
        Color currentColor = panel.getBackground();
        Color nextColor = Color.BLACK;
        for (int i = 0; i < colors.length; i++)
        {
            if(currentColor == colors[i])
            {
                nextColor = colors[(i+1)%colors.length];
            }
        }
        
        panel.setBackground(nextColor);
    }

}
