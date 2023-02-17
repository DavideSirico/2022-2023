package es05_buttons;
import javax.swing.*;
import java.awt.event.*;
public class Popup implements ActionListener {
    public Popup()
    {
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPanel.showMessageDialog(null);
    }