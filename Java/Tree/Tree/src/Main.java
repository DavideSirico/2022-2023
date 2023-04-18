import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        BinaryTree bt1 = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();

        try {
            FileReader fileLeggi1 = new FileReader("src/numeri1.txt");
            FileReader fileLeggi2 = new FileReader("src/numeri2.txt");
            BufferedReader in1 = new BufferedReader(fileLeggi1);
            BufferedReader in2 = new BufferedReader(fileLeggi2);
            String linea1 = in1.readLine();
            String linea2 = in2.readLine();
            if(linea1 == null && linea2 == null)
            {
                System.out.println("il file e' vuoto");
                in1.close();
                in2.close();
                fileLeggi1.close();
                fileLeggi2.close();
                return;
            }
            while(linea1 != null && linea2 != null)
            {
                int numero1 = Integer.parseInt(linea1);
                int numero2 = Integer.parseInt(linea2);
                linea1 = in1.readLine();
                linea2 = in2.readLine();
                bt1.insert(numero1);
                bt2.insert(numero2);
            }
            bt1.inOrdine();
            bt2.inOrdine();
            in1.close();
            in2.close();
        } catch(IOException e) {
            System.out.println("Errore nella lettura del file");
        } catch(Exception e) {
            System.out.println("Solo numeri");
        }
    }
}

/*
Scrivere un algoritmo ricorsivo che permetta di inserire in un B-tree a sx il numero minore e a destra il maggiore.
Implementare l'algortmo in Java, come metodo statico all'interno del main, dove gli alberi siano implementati come
istanze della classe.
Trovare un modo per visualizzare l'albero.
*/
