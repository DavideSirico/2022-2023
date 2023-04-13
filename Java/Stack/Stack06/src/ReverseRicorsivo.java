import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class ReverseRicorsivo {
    public static void main(String[] args)
    {
        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();
        P1.push(1);
        P1.push(2);
        P1.push(3);
        stampa(P1);
        // P1 = reverse(P1);
        // P2 = P1;
        reverse(P1,P2);
        // reverse(P2,P1);

        stampa(P1);
    }
    public static void reverse(Stack<Integer> P1,Stack<Integer> P2)
    {
        if(P1.isEmpty())
            return;

        P2.push(P1.pop());
        reverse(P1,P2);
    }
    public static void stampa(Stack<Integer> P)
    {
        System.out.println("Pila: " + P);
    }
    /*
    public static Stack<Integer> reverse(Stack<Integer> P)
    {
        Stack<Integer> pilaTemp = new Stack<>();
        while(!P.isEmpty())
        {
            pilaTemp.push(P.pop());
        }
        return pilaTemp;
    }
    */


}
