import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> Q1 = new LinkedList<>();
        // Q1.poll(); // .remove() generate an exception if the queue is empty
        Q1.offer(10);
        Q1.offer(10);
        System.out.println(Q1);
        // if(myIsEmpty(Q1))
        String c;
        // if(Q1.poll()==null)
        // if(Q1.peek()==null)
        if((c=Q1.poll().toString())==null)
        {
            System.out.println("The queue is empty");
        }
        else
        {
            System.out.println("The queue is not empty");
        }
        System.out.println(Q1);
        System.out.println(c);
    }
    public static boolean myIsEmpty(Queue<Integer> Q)
    {
        return Q.peek()==null;
    }
}