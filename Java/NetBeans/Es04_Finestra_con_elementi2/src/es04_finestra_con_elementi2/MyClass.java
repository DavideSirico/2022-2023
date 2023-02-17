package es04_finestra_con_elementi2;
import javax.swing.*;
import java.awt.event.*;
public class MyClass implements ActionListener {
    public MyClass()
    {
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null);
    }
}
