import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;
public class MyActionListener implements ActionListener {
    private JComboBox<String> cb;
    private MyPanel panel;
    private JTextField textField;
    public MyActionListener(JComboBox<String> cb,MyPanel panel,JTextField textField) {
        this.cb = cb;
        this.panel = panel;
        this.textField = textField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = (String) cb.getSelectedItem();
        // draw a circle
        switch(choice)
        {
            case "item 1":
                choice = "0";
                break;
            case "item 2":
                choice = "1";
                break;
            case "item 3":
                choice = "2";
                break;
            case "item 4":
                choice = "3";
                break;
            case "item 5":
                choice = "4";
                break;
            default:
                choice = "0";
                break;
        }
        panel.selectColor(Integer.parseInt(choice));
        panel.setForma(textField.getText());
        panel.repaint();
    }
}
