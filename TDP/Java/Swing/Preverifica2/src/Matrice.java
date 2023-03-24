import javax.swing.*;
import java.awt.*;
public class Matrice extends JPanel
{
    private int[][] matrice = new int[10][10];
    public Matrice()
    {
        this.setLayout(new GridLayout(10, 10));
    }

    public void carica()
    {
        this.removeAll();
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(matrice[i][j]!=-1)
                {
                    this.add(new JLabel(String.valueOf(matrice[i][j])));
                } else {
                    this.remove(new JLabel());
                    this.add(new JLabel(""));
                }
            }
        }
        this.revalidate();
        this.repaint();
    }

    // Only for Debug
    public void visualizza()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void initMatrice()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                this.matrice[i][j] = i*10 + j;
            }
        }
    }
    public int[][] getMatrice()
    {
        return this.matrice;
    }

    public void setMatrice(int[][] matrice)
    {
        for(int i = 0; i < 10; i++)
            System.arraycopy(matrice[i], 0, this.matrice[i], 0, 10);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                g.drawRect(i*40, j*40, 40, 40);
            }
        }
    }
}
