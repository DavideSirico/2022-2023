import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
public class Cerchio extends JPanel
{
    // arraylist di coordinate
    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();

    public Cerchio()
    {
        setPreferredSize(new Dimension(100, 100));
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        for(int i = 0; i < x.size(); i++)
        {
            g.setColor(Color.RED);
            g.fillOval(x.get(i), y.get(i), 50, 50);
        }
    }
    public void drawCircle()
    {
        Random r = new Random();
        int x = r.nextInt(500);
        int y = r.nextInt(500);
        this.x.add(x);
        this.y.add(y);
    }
    public void removeCircle()
    {
        if(x.size() > 0)
        {
            x.remove(0);
            y.remove(0);
        }
    }
}