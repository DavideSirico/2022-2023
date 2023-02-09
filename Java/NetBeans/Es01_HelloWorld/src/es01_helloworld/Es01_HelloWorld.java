package es01_helloworld;
import java.awt.Color;
import javax.swing.*;

public class Es01_HelloWorld {
    public static void main(String[] args) {
        JFrame window;
        window = new JFrame ("Hello World");
        
        // non fa nulla
        window.setSize(400,400);
        // non fa nulla
        window.setLocation(0,0);
        // non fa nulla
        window.setResizable(false);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setVisible(true);
    }
}
