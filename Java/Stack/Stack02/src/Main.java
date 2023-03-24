/*import java.util.Stack;
public class Main {
    public static void main(String[] args)
    {
        Stack<Integer> S1 = new Stack<>();

        S1.push(1);
        S1.push(2);
        S1.push(3);
        System.out.println(S1);

        System.out.println(myPeak(S1));

        System.out.println(S1);
    }
    public static int myPeak(Stack<Integer> S1)
    {
        int dummy = S1.pop();
        S1.push(dummy);
        return dummy;
    }
}
*/
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args)
    {
        Stack<Integer> S1 = new Stack<>();
        Queue<Integer> Q1 = new LinkedList<>();

        Q1.offer(1);
        Q1.offer(2);
        Q1.offer(3);

        System.out.println(Q1);
        System.out.println(myPeak(Q1));
        System.out.println(Q1);

        S1.push(1);
        S1.push(2);
        S1.push(3);

        System.out.println(S1);
        System.out.println(myPeak(S1));
        System.out.println(S1);
    }
    public static int myPeak(Queue<Integer> Q)
    {
        Queue<Integer> temp = new LinkedList<>();

        while(!Q.isEmpty())
        {
            temp.offer(Q.poll());
        }

        int dummy = temp.poll();
        Q.offer(dummy);

        while(!temp.isEmpty())
        {
            Q.offer(temp.poll());
        }
        return dummy;
    }
    public static int myPeak(Stack<Integer> S1)
    {
        int dummy = S1.pop();
        S1.push(dummy);
        return dummy;
    }
}
