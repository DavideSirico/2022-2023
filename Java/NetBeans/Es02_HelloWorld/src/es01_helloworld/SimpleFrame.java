package es01_helloworld;
import java.awt.Color;
import javax.swing.*;

public class SimpleFrame extends JFrame{
    public SimpleFrame()
    {
        super();
        setTitle("PRIMA FINESTRA CON ESTENSIONE CLASSE");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}    
}
