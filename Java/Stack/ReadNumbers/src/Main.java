import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Main {

    public static void main (String[] args) {
        Stack<Integer> S = new Stack<>();
        Queue<Integer> Q = new MyQueueInteger();

        try {
            FileReader fileLeggi = new FileReader("src/input.txt");
            BufferedReader in = new BufferedReader(fileLeggi);
            String linea = in.readLine();
            if(linea == null)
            {
                System.out.println("il file e' vuoto");
                in.close();
                fileLeggi.close();
                return;
            }
            while(linea != null)
            {
                int numero = Integer.parseInt(linea);
                System.out.println(numero);
                S.push(numero);
                Q.add(numero);
                linea = in.readLine();
            }
            System.out.println(S);
            System.out.println(Q);
            in.close();
        } catch(IOException e) {
            System.out.println("Errore nella lettura del file");
        } catch(Exception e)
        {
            System.out.println("Solo numeri");
        }

    }
}


