/*
* ES:
in:  1 2 3 4 5
2 1 4 3 5

out: 2 1 4 3 5



// data una coda C1 invertire gli elementi 2 a due
ES:
in:  1 2 3 4 5


out: 2 1 4 3 5
*/
import java.util.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args)
    {
        Queue<Integer> C1 = new LinkedList<>();

        C1.add(1);
        C1.add(2);
        C1.add(3);
        C1.add(4);
        C1.add(5);

        System.out.print("Coda: " + C1);

        inversione(C1);

        System.out.print("Coda scambiata: " + C1);

        Stack<Integer> P1 = new Stack<>();

        P1.push(1);
        P1.push(2);
        P1.push(3);
        P1.push(4);
        P1.push(5);

        System.out.print("Pila: " + P1);

        inversione(P1);

        System.out.print("Pila scambiata: " + P1);

    }

    public static void inversione(Stack<Integer> P)
    {
        Stack<Integer> stackTemp = new Stack<>();
        while (!P.empty()) {
            stackTemp.push(P.pop());
        }
        while (!stackTemp.empty())
        {
            int dummy1 = stackTemp.pop();
            if(stackTemp.empty())
            {
                P.push(dummy1);
            } else
            {
                int dummy2 = stackTemp.pop();
                P.push(dummy2);
                P.push(dummy1);
            }
        }
    }
    public static void inversione(Queue<Integer> C)
    {
        Queue<Integer> cTemp = new LinkedList<>();
        while(!C.isEmpty())
        {
            int dummy1 = C.remove();
            if(C.isEmpty())
            {
                cTemp.add(dummy1);
            } else
            {
                int dummy2 = C.remove();
                cTemp.add(dummy2);
                cTemp.add(dummy1);
            }
        }
        while(!cTemp.isEmpty())
        {
            C.add(cTemp.remove());
        }
    }

}
/*
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Queue<Integer> C1 = new LinkedList<>();
        C1.add(1);
        C1.add(2);
        C1.add(3);
        C1.add(4);
        C1.add(5);
        System.out.println("Coda: " + C1);
        C1.remove();
        System.out.println("Coda: " + C1);
        C1.add(1);
        System.out.println("Coda: " + C1);

        Stack<Integer> P1 = new Stack<>();
        P1.push(1);
        P1.push(2);
        P1.push(3);
        P1.push(4);
        P1.push(5);
        System.out.println("Pila: " + P1);
        P1.pop();
        System.out.println("Pila: " + P1);
        P1.push(1);
        System.out.println("Pila: " + P1);

    }
}*/