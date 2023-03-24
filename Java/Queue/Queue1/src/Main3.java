
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main3 {
    public static void main(String[] args)
    {
        Queue<Integer> Q1 = new LinkedList<>();
        Stack<Integer> S1 = new Stack<>();
        Q1.add(10);
        Q1.add(20);
        Q1.add(30);

        System.out.println("Queue: " + Q1);
        System.out.println("Stack: " + S1);

        // queueToStack(Q1,S1);
        S1 = stackToQueue(Q1);

        System.out.println("Queue: " + Q1);
        System.out.println("Stack: " + S1);

    }
    public static void queueToStack(Queue<Integer> Q, Stack<Integer> S)
    {
        while(!Q.isEmpty())
        {
            S.push(Q.remove());
        }
    }
    public static Stack<Integer> stackToQueue(Queue<Integer> Q)
    {
        Stack<Integer> S = new Stack<>();
        while(!Q.isEmpty())
        {
            S.push(Q.remove());
        }
        return S;
    }
}