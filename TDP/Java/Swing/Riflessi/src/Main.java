/*
* 1) Esercizio riflessi
Riflessi. Scrivi un programma che disegni una griglia 3x3 di quadrati dove un solo quadrato si illumina di rosso. Una volta che l’utente ha cliccato un altro quadrato della griglia si illumina. Lo scopo del gioco è testare i riflessi dell’utente il quale deve cliccare piu’ velocemente possibile i vari quadrati illuminati.
Dopo 10 click dell’utente il gioco finisce e deve essere detto all’utente quanto ha impiegato.

Devi inoltre prevedere due bottoni: uno per far partire il gioco, un altro per dire la classifica del gioco. Nella classifica del gioco viene memorizzato il nome dell’utente e il suo “record” di tempo del gioco.*/

import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(4,3));
        JButton start = new JButton("Start");
        JButton rank = new JButton("Classifica");

        JPanel buttonContainer = new JPanel();

        // buttonContainer.setLayout();
        buttonContainer.add(start);
        container.add(new JLabel(""));
        container.add(buttonContainer);
        JLabel time = new JLabel("");
        container.add(time);

        Classifica classifica = new Classifica();
        rank.addActionListener(classifica);
        buttonContainer.add(rank);
        JButton[] quadratoni = new JButton[9];
        Morte morte = new Morte(quadratoni);
        start.addActionListener(morte);

        AscoltoQuadratoni aQ = new AscoltoQuadratoni(quadratoni,time,classifica);

        for(int i = 0; i < 9; i++)
        {
            quadratoni[i] = new JButton();
            quadratoni[i].addActionListener(aQ);
            container.add(quadratoni[i]);
        }

        window.add(container);
        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
