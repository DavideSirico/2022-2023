import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Listener implements ActionListener {
    private Matrice matrice1;
    private Matrice matrice2;
    public Listener(Matrice matrice1, Matrice matrice2) {
        this.matrice1 = matrice1;
        this.matrice2 = matrice2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        int [][] matrice = new int[this.matrice1.getMatrice().length][];

        for(int i = 0; i < this.matrice1.getMatrice().length; i++)
            matrice[i] = this.matrice1.getMatrice()[i].clone();

        System.out.println("ciao");

        if(button.getText().equals("X"))
        {
            for(int i = 0; i < 10; i++)
            {
                for(int j = 0; j < 10; j++)
                {
                    if(i==j || i + j == 9)
                    {
                        matrice[i][j] *= 2;
                    } else {
                        matrice[i][j] = -1;
                    }
                }
            }
        }
        else if(button.getText().equals("O"))
        {
            for(int i = 0; i < 10; i++)
            {
                for(int j = 0; j < 10; j++)
                {
                    if(i == 0 || j == 0 || i==9 || j ==9)
                    {
                        matrice[i][j] = (int) Math.pow(matrice[i][j],2);
                    } else
                    {
                        matrice[i][j] = -1;
                    }
                }
            }
        }
        else if(button.getText().equals("L"))
        {
            for(int i = 0; i < 10; i++)
            {
                for(int j = 0; j < 10; j++)
                {
                    if(j == 0 || i==9)
                    {
                        matrice[i][j] /= 2;
                    } else
                    {
                        matrice[i][j] = -1;
                    }
                }
            }
        }

        matrice2.setMatrice(matrice);
        matrice2.carica();
        // only for debug matrice2.visualizza();
    }
}