import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonListener implements ActionListener
{
    private JButton button;

    public ButtonListener()
    {

    }

    public ButtonListener(JButton button)
    {
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String currentButton = button.getText();
        System.out.println(currentButton);
    }
}
