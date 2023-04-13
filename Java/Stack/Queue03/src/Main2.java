import java.util.*;
public class Main2 {
    public static void main(String[] args)
    {
        Stack<Integer> S1 = new Stack<>();
        Stack<Integer> S2 = new Stack<>();
        Queue<Integer> Q = new LinkedList<>();

        S1.push(2);S1.push(1);S1.push(5);S1.push(2);S1.push(1);
        S2.push(4);S2.push(4);S2.push(2);S2.push(4);S2.push(1);
        Q.add(1);Q.add(2);Q.add(3);Q.add(4);Q.add(5);


        System.out.println("Stack 1: " + S1);
        System.out.println("Stack 2: " + S2);
        System.out.println("Stack: " + merge(S1,S2));


        /*
        System.out.println("Stack: " + S);
        System.out.println("Queue: " + Q);
        S = recursiveReverse(S);
        Q = recursiveReverse(Q);
        System.out.println("Reverse: ");
        System.out.println("Stack: " + S);
        System.out.println("Queue: " + Q);
        System.out.println("Peek: ");
        System.out.println("Stack: " + peek(S));
        System.out.println("Queue: " + peek(Q));
        System.out.println("Stack: " + S);
        System.out.println("Queue: " + Q);

        Stack<Integer> secondStack = new Stack<>();
        Queue<Integer> secondQueue = new LinkedList<>(Q);
        secondStack = (Stack<Integer>) S.clone();

        System.out.println("Stack to Queue:");
        Q = stackToQueue(secondStack);
        System.out.println("Queue: " + Q);
        System.out.println("Stack: " + secondStack);
        System.out.println("Queue to Stack:");
        S = queueToStack(secondQueue);
        System.out.println("Queue: " + secondQueue);
        System.out.println("Stack: " + S);

    */

    }
    public static Stack<Integer> reverse(Stack<Integer> S)
    {
        Stack<Integer> stackTemp = new Stack<>();
        while (!S.empty()) {
            stackTemp.push(S.pop());
        }
        return stackTemp;

    }
    public static Queue<Integer> reverse(Queue<Integer> Q)
    {
        if(Q.isEmpty())
        {
            return Q;
        }
        int dummy = Q.remove();
        Q = reverse(Q);
        Q.add(dummy);
        return Q;
    }
    public static int peek(Stack<Integer> S)
    {
        int dummy = S.pop();
        S.push(dummy);
        return dummy;
    }

    public static int peek(Queue<Integer> Q)
    {
        Queue<Integer> queueTemp = new LinkedList<>();
        int dummy = Q.poll();
        queueTemp.offer(dummy);
        while(!Q.isEmpty())
        {
            queueTemp.offer(Q.remove());
        }
        while(!queueTemp.isEmpty())
        {
            Q.offer(queueTemp.poll());
        }
        return dummy;
    }
    public static Stack<Integer> queueToStack(Queue<Integer> Q)
    {
        Stack<Integer> S = new Stack<>();

        while(!Q.isEmpty()) {
            S.push(Q.poll());
        }
        return S;
    }
    public static Queue<Integer> stackToQueue(Stack<Integer> S)
    {
        Queue<Integer> Q = new LinkedList<>();
        S = reverse(S);
        while(!S.isEmpty()) {
            Q.add(S.pop());
        }
        return Q;
    }
    public static void stampaRicorsiva(Stack<Integer> S)
    {
        if(S.isEmpty())
        {
            System.out.println();
            return;
        }
        int dummy = S.pop();
        stampaRicorsiva(S);
        System.out.print(dummy);
    }

    public static void stampaRicorsiva(Queue<Integer> Q)
    {
        if(Q.isEmpty())
        {
            System.out.println();
            return;
        }
        System.out.print(Q.remove());
        stampaRicorsiva(Q);
    }

    public static Stack<Integer> merge(Stack<Integer> S1,Stack<Integer> S2)
    {
        Stack<Integer> merged = new Stack<>();
        S1 = sort(S1);
        S2 = sort(S2);

        while(!S1.isEmpty() && !S2.isEmpty())
        {
            if(S1.peek()<S2.peek())
            {
                merged.push(S1.pop());
            } else {
                merged.push(S2.pop());
            }
        }
        while(!S1.isEmpty())
        {
            merged.push(S1.pop());
        }
        while(!S2.isEmpty())
        {
            merged.push(S2.pop());
        }
        return merged;
    }
    public static Stack<Integer> sort(Stack<Integer> S)
    {
        Stack<Integer> stackTemp = new Stack<>();

        while(!S.isEmpty())
        {
            int top = S.pop();
            while(!stackTemp.isEmpty() && top > stackTemp.peek())
            {
                S.push(stackTemp.pop());
            }
            stackTemp.push(top);
        }
        return stackTemp;
    }
}
