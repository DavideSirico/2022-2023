import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Morte implements ActionListener {
    private JButton[] quadratoni;
    public Morte(JButton[] quadratoni)
    {
        this.quadratoni = quadratoni;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Random r = new Random();
        for(int i = 0; i < 9; i++)
        {
            quadratoni[i].setEnabled(true);
            quadratoni[i].setBackground(Color.CYAN);
        }
        int dummy = r.nextInt(9);
        quadratoni[dummy].setBackground(Color.RED);
    }
}
