import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Locale;

public class MyPanel extends JPanel {
    private ArrayList<Color> colors = new ArrayList<Color>();
    private Color currentColor;
    private String forma;
    public MyPanel() {
        super();
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        colors.add(Color.YELLOW);
        colors.add(Color.ORANGE);
    }

    public void setForma(String forma)
    {
        this.forma = forma;
    }
    public void selectColor(int index)
    {
        currentColor = colors.get(index);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(currentColor);
        try {
            forma = forma.toLowerCase();
        } catch (Exception e) {
            forma = "cerchio";
        }
        switch(forma)
        {
            case "cerchio":
                g.fillOval(100, 100, 100, 100);
                break;
            case "quadrato":
                g.fillRect(100, 100, 100, 100);
                break;
            case "triangolo":
                int[] x = {100, 200, 150};
                int[] y = {200, 200, 100};
                g.fillPolygon(x, y, 3);
                break;
            case "linea":
                g.drawLine(100, 100, 200, 200);
                break;
            default:
                g.fillOval(100, 100, 100, 100);
                break;


        }
    }

}
