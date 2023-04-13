// Dati 2 numeri A e B inseriti esternamente, se esiste nella pila A, sostituire ogni numero A con B. Stessa cosa per la coda.
import java.io.File;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class QueueSostituzione {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Scanner fileIn;
        try {
            fileIn = new Scanner(new File("src/input.txt"));
        } catch(Exception e)
        {
            System.out.println("File non trovato");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();

        while(fileIn.hasNextInt())
        {
            queue.add(fileIn.nextInt());
        }

        int a,b;

        System.out.println(queue);

        System.out.println("Inserire 2 numeri: ");
        try{
            a = in.nextInt();
            b = in.nextInt();
        } catch(Exception e) {
            System.out.println("Solo numeri!");
            return;
        } finally {
            in.close();
        }

        Queue<Integer> queueTemp = new LinkedList<>();

        while(!queue.isEmpty())
        {
            int dummy;
            dummy = queue.remove();
            if(dummy == a)
            {
                dummy = b;
            }
            queueTemp.add(dummy);
        }

        while(!queueTemp.isEmpty())
        {
            queue.add(queueTemp.remove());
        }

        System.out.println(queue);
    }
}


