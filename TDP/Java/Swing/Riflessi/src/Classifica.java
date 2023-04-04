import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Classifica implements ActionListener
{
    private Vector<String> names;
    private Vector<Long> times;
    public Classifica()
    {
        names = new Vector<>();
        times = new Vector<>();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(names.size(),2));

        for(int i = 0; i < names.size(); i++)
        {
            container.add(new JLabel(names.get(i)));
            container.add(new JLabel(Long.toString(times.get(i))));
        }

        JOptionPane.showMessageDialog(null,container,"Information",JOptionPane.INFORMATION_MESSAGE);
    }
    public void add(Long time)
    {
        String dummy = System.getProperty("user.name");
        names.add(dummy);
        this.times.add(time);
    }
}
