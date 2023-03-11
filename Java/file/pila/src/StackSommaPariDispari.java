import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
public class StackSommaPariDispari {
    public static void main(String[] args) {
        Stack<Integer> P1 = new Stack<>();
        FileReader fileInput;
        BufferedReader bufferInput;
        String linea;
        // Caricamento della pila P1
        try{
            fileInput = new FileReader("/home/david/School/Java/file/pila/src/numbers.txt");
            bufferInput = new BufferedReader(fileInput);
            while((linea = bufferInput.readLine()) != null)
            {
                int dummy;
                dummy = Integer.parseInt(linea);
                P1.push(dummy);
            }
            bufferInput.close();
        } catch (IOException e)
        {
            System.out.println("Errore nella lettura del file");
            e.printStackTrace();
            return;
        } catch (Exception e)
        {
            System.out.println("Nel file sono presenti delle stringhe");
            e.printStackTrace();
            return;
        }
        int somma = getSomma(P1);
        Stack<Integer> pilaPari = new Stack<>();
        Stack<Integer> pilaDispari = new Stack<>();
        getPariDispari(P1,pilaPari,pilaDispari);

        System.out.println(pilaPari);
        System.out.println(pilaDispari);
        System.out.println("Somma: " + somma);

    }
    static void getPariDispari(Stack<Integer> P, Stack<Integer> pari, Stack<Integer> dispari)
    {
        Stack<Integer> pilaCopia = new Stack<>();
        while(!P.empty())
        {
            int dummy;
            dummy = P.pop();
            pilaCopia.push(dummy);
            if(dummy % 2 == 0)
            {
                pari.push(dummy);
            } else
            {
                dispari.push(dummy);
            }
        }
        while(!pilaCopia.empty())
        {
            int dummy = pilaCopia.pop();
            P.push(dummy);
        }
    }

    static int getSomma(Stack<Integer> P)
    {
        Stack<Integer> pilaCopia = new Stack<>();
        // calcolo la somma di tutti i valori di P
        // inoltre creo una copia ribaltata di P
        int somma = 0;
        while(!P.empty())
        {
            int dummy = P.pop();
            pilaCopia.push(dummy);
            somma += dummy;
        }
        // Svuoto la pilaCopia (P reverse) dentro P (ritorno allo stato iniziale)
        while(!pilaCopia.empty())
        {
            int dummy = pilaCopia.pop();
            P.push(dummy);
        }
        return somma;
    }
}
