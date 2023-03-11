import javax.swing.*;
import java.awt.*;
class MyPanel extends JPanel
{
    public MyPanel()
    {
        super();
        setBackground(Color.yellow);
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.drawLine(0,0,100,100);
        g2.drawOval(0,0,10,20);
        g2.setColor(Color.green);
        g2.fillOval(20,20,10,20);
        g2.drawRect(200,200,50,50);
    }

}