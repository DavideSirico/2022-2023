import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AscoltoQuadratoni implements ActionListener {
    private Classifica classifica;
    private JLabel time;
    private JButton[] quadratoni;
    private int counter;
    long timeStart;
    long timeEnd;
    public AscoltoQuadratoni(JButton[] quadratoni,JLabel time,Classifica classifica)
    {
        this.classifica = classifica;
        counter = 0;
        this.time = time;
        this.quadratoni = quadratoni;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(counter == 0)
        {
            timeStart = System.currentTimeMillis();
        }
        Random r = new Random();

        JButton button = (JButton) actionEvent.getSource();
        Color color = button.getBackground();

        if(color == Color.RED)
        {
            if(counter==9)
            {
                timeEnd = System.currentTimeMillis();
                for(int i = 0; i < 9; i++)
                {
                    quadratoni[i].setEnabled(false);
                }
                long diff = timeEnd - timeStart;
                time.setText(Long.toString(diff));
                classifica.add(diff);
                counter = 0;
                return;
            }
            int randomNumber;
            do {
                randomNumber = r.nextInt(9);
            }while(quadratoni[randomNumber].getBackground() == Color.RED);

            button.setBackground(Color.CYAN);
            quadratoni[randomNumber].setBackground(Color.RED);
            counter++;

        }

    }
}
