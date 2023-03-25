// Pila1Pila2
/* dato un file numeri.txt caricare 2 pile alternativamente*/
/* visualizzare le due pile con stampa(p1) e stampa(p2)*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Main {

    public static void main (String[] args) {
        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();
        try {
            FileReader fileLeggi = new FileReader("src/numeri.txt");
            BufferedReader in = new BufferedReader(fileLeggi);
            String linea = in.readLine();
            if(linea == null)
            {
                System.out.println("il file e' vuoto");
                in.close();
                fileLeggi.close();
                return;
            }
            int counter = 0;
            while(linea != null)
            {
                int numero = Integer.parseInt(linea);
                System.out.println(numero);
                if(counter%2==0)
                {
                    P1.push(numero);
                } else
                {
                    P2.push(numero);
                }
                counter++;
                linea = in.readLine();
            }
            stampa(P1);
            stampa(P2);

            in.close();
        } catch(IOException e)
        {
            System.out.println("Errore nella lettura del file");
        } catch(Exception e)
        {
            System.out.println("Solo numeri");
        }

    }
    public static void stampa(Stack<Integer> S)
    {
        System.out.println("Pila: " + S);
    }
}



