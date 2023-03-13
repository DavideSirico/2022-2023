package es08_dado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class MyListener implements ActionListener {
    private MyJPanel jPanel;
    private JFrame jFrame;
    public MyListener()
    {
    }
    public MyListener(MyJPanel jPanel, JFrame jFrame) {
        this.jPanel = jPanel;
        this.jFrame = jFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Random r = new Random();
        int n = r.nextInt(6)+1;
        Graphics2D g2 = (Graphics2D) jPanel.getGraphics();
        jPanel.setNumber(n,g2);
    }
}


