import java.awt.*;
import javax.swing.*;
public class MyJPanel extends JPanel
{
    public MyJPanel()
    {
        setBackground(Color.BLUE);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.setColor(Color.YELLOW);

        g2.fillRoundRect(1000/2-500/2, 1000/2-500/2, 500, 500, 50, 50);
    }
    public void setNumber(int n,Graphics2D g2)
    {
        System.out.println(n);
        g2.setStroke(new BasicStroke(10));
        g2.setColor(Color.YELLOW);
        g2.fillRoundRect(1000/2-500/2, 1000/2-500/2, 500, 500, 50, 50);
        g2.setColor(Color.BLUE);
        switch (n)
        {
            case 1:
                g2.fillOval(1000/2-50, 1000/2-50, 100, 100);
                break;
            case 2:
                g2.fillOval(1000/2-50-100, 1000/2-50, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50, 100, 100);
                break;
            case 3:
                g2.fillOval(1000/2-50-100, 1000/2-50-100, 100, 100);
                g2.fillOval(1000/2-50, 1000/2-50, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50+100, 100, 100);
                break;
            case 4:
                g2.fillOval(1000/2-50-100, 1000/2-50-100, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50-100, 100, 100);
                g2.fillOval(1000/2-50-100, 1000/2-50+100, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50+100, 100, 100);
                break;
            case 5:
                g2.fillOval(1000/2-50-100, 1000/2-50-100, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50-100, 100, 100);
                g2.fillOval(1000/2-50-100, 1000/2-50+100, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50+100, 100, 100);
                g2.fillOval(1000/2-50, 1000/2-50, 100, 100);
                break;
            case 6:
                g2.fillOval(1000/2-50-100, 1000/2-50-100, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50-100, 100, 100);
                g2.fillOval(1000/2-50-100, 1000/2-50+100, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50+100, 100, 100);
                g2.fillOval(1000/2-50-100, 1000/2-50, 100, 100);
                g2.fillOval(1000/2-50+100, 1000/2-50, 100, 100);
                break;

        }
    }
}
