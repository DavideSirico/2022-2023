import java.awt.event.*;
import javax.swing.*;
public class ButtonListener implements ActionListener {
    private Bersaglio bersaglio;
    private JTextField x;
    private JTextField y;
    private JTextField distanza;

    public ButtonListener(Bersaglio bersaglio, JTextField x, JTextField y, JTextField distanza) {
        this.bersaglio = bersaglio;
        this.x = x;
        this.y = y;
        this.distanza = distanza;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bersaglio.tira();
        String posX = String.valueOf(bersaglio.getPosX());
        String posY = String.valueOf(bersaglio.getPosY());
        x.setText(posX);
        y.setText(posY);
        distanza.setText(String.valueOf(bersaglio.getDistanza()));
    }
}
