import javax.swing.*;
import java.awt.*;

public class Bersaglio extends JPanel {
    private int x;
    private int y;
    private int distanza;
    public Bersaglio() {
        super();
        this.setLayout(null);
        this.setPreferredSize(new Dimension(601, 601));
        this.x = -1000;
        this.y = -1000;
        this.distanza = 0;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.gray);
        g.drawRect(0,0,600,600);
        g.setColor(Color.BLUE);
        g.fillOval(0,0,600,600);
        g.setColor(Color.RED);
        g.fillOval(100,100,400,400);
        g.setColor(Color.YELLOW);
        g.fillOval(200,200,200,200);

        // freccietta
        g.setColor(Color.BLACK);
        g.fillOval(x-5, y-5, 10, 10);
    }

    public void tira()
    {
        this.x = (int) (Math.random() * 600);
        this.y = (int) (Math.random() * 600);
        this.distanza = (int) Math.sqrt(Math.pow(x - 300, 2) + Math.pow(y - 300, 2));
        this.repaint();
    }

    public int getDistanza()
    {
        return distanza;
    }
    public int getPosX()
    {
        return x;
    }
    public int getPosY()
    {
        return y;
    }
}
