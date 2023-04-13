import javax.swing.*;
import java.awt.*;

public class Calcolatrice {
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Calcolatrice");
        JPanel container = new JPanel(new GridLayout(3,3));
        for(int i = 0; i < 9; i++)
        {
            JButton bottoneTemp = new JButton(Integer.toString(i));
            bottoneTemp.addActionListener(new ButtonListener(bottoneTemp));

            container.add(bottoneTemp);
        }


        window.setSize(500, 500);
        window.add(container);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}