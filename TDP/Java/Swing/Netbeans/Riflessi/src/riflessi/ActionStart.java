package riflessi;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionStart implements ActionListener {
    private JButton[] quadratoni;
    private AscoltoQuadratoni ascoltoQuadratoni;
    public ActionStart(JButton[] quadratoni, AscoltoQuadratoni ascoltoQuadratoni)
    {
        this.quadratoni = quadratoni;
        this.ascoltoQuadratoni = ascoltoQuadratoni;
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
        ascoltoQuadratoni.reset();
    }
}

