import java.util.Stack;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.search()
        s.push(1);
        s.push(2);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        try{
            System.out.println(s.pop());
        } catch (Exception EmptyStackException)
        {
            System.out.println("Pila vuota");
        }
        carica(s);
        System.out.println(s);
    }
    public static void carica(Stack<Integer> s)
    {
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            s.push(r.nextInt(100));
        }
    }
}