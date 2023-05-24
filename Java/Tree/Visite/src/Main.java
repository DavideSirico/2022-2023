import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) {
            BinaryTree bt = new BinaryTree();
            bt.insertFile("src/input.txt");
            bt.print();
            bt.delete(5);
            bt.print();
    }
}

/* caricare un albero da un file txt
    Stabilire se è maggiore la somma delle foglie di sinistra o quella di destra o se sono uguali
* */