package calc2;

import java.awt.*;
import javax.swing.*;

public class Calc2 extends JFrame{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Ciao");
        
        JLabel currentNumber = new JLabel("");
        
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        
        JButton buttonDiviso = new JButton("/");
        JButton buttonPer = new JButton("*");
        JButton buttonMeno = new JButton("-");
        JButton buttonPiu = new JButton("+");
        JButton buttonUguale = new JButton("=");
        
        ButtonListener buttonListener = new ButtonListener(window,currentNumber);
        
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
        button3.addActionListener(buttonListener);
        button4.addActionListener(buttonListener);
        button5.addActionListener(buttonListener);
        button6.addActionListener(buttonListener);
        button7.addActionListener(buttonListener);
        button8.addActionListener(buttonListener);
        button9.addActionListener(buttonListener);
        button0.addActionListener(buttonListener);
        buttonDiviso.addActionListener(buttonListener);
        buttonPer.addActionListener(buttonListener);
        buttonMeno.addActionListener(buttonListener);
        buttonPiu.addActionListener(buttonListener);
        buttonUguale.addActionListener(buttonListener);
        
        JPanel container = new JPanel();
        
        container.setLayout(new GridLayout(5,4));
        
        container.add(new JLabel(""));
        container.add(new JLabel(""));
        container.add(currentNumber);
        container.add(new JLabel(""));
        
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(buttonDiviso);
        
        container.add(button4);
        container.add(button5);
        container.add(button6);
        container.add(buttonPer);
        
        container.add(button7);
        container.add(button8);
        container.add(button9);
        container.add(buttonPiu);
        
        container.add(new JLabel(""));
        container.add(button0);
        container.add(buttonMeno);
        container.add(buttonUguale);
        
        window.add(container);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000,1000);
        window.setVisible(true);
    }
}
