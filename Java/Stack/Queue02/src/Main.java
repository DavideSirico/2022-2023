import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args)
    {
        Queue<Integer> Q1 = new LinkedList<>();
        Q1.add(1);
        Q1.add(2);
        Q1.add(3);
        Q1.add(4);

        // 1 2 3 4 | 2 3 4 1 | 3 4 1 2 | 4 1 2 3
        // head = 1
        stampa(Q1,Q1.peek());

    }

    public static void stampa(Queue<Integer> Q1, int head) {
        int current = Q1.remove();
        Q1.add(current);

        System.out.println(current);
        if((Q1.peek()) == head)
        {
            return;
        }
        stampa(Q1,head);
    }
}