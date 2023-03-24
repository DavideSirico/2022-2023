import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();
        /*
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();
        Queue<Integer> Q3 = new LinkedList<>();
        */

        Queue<Integer> Q1 = new MyQueueInt();
        Queue<Integer> Q2 = new MyQueueInt();
        Queue<Integer> Q3 = new MyQueueInt();

        for(int i = 0; i < 10; i++)
        {
            Q1.offer(random.nextInt(100)+1);
        }

        System.out.println(pariDispari(Q1,Q2,Q3));
        System.out.println(Q1);
        System.out.println(Q2);
        System.out.println(Q3);
    }
    public static int getLength(Queue<Integer> Q)
    {
        Queue<Integer> temp = new LinkedList<>();
        int counter = 0;
        while(!Q.isEmpty())
        {
            temp.offer(Q.poll());
            counter++;
        }
        while(!temp.isEmpty())
        {
            Q.offer(temp.poll());
        }
        return counter;
    }
    public static int pariDispari(Queue<Integer> Q1, Queue<Integer> pari, Queue<Integer> dispari)
    {
        Queue<Integer> temp = new LinkedList<>();

        while(!Q1.isEmpty())
        {
            int dummy = Q1.poll();
            if(dummy%2 == 0)
            {
                pari.offer(dummy);
            } else {
                dispari.offer(dummy);
            }
            temp.offer(dummy);
        }
        while(!Q1.isEmpty())
        {
            temp.offer(Q1.poll());
        }
        while(!temp.isEmpty())
        {
            Q1.offer(temp.poll());
        }
        int lunghezzaPari = getLength(pari);
        int lunghezzaDispari = getLength(pari);
        if(lunghezzaDispari > lunghezzaPari)
        {
            return lunghezzaDispari;
        }
        return lunghezzaPari;
    }
}

// 1 2 3
// Stack
/*
   3 1
   2
*/
// Queue
/*
   1 3
   2
*/