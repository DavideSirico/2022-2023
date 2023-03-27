// Dati 2 numeri A e B inseriti esternamente, se esiste nella pila A, sostituire ogni numero A con B. Stessa cosa per la coda.
import java.io.File;
import java.util.Scanner;
import java.util.Stack;
public class StackSostituzione {
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

        Stack<Integer> stack = new Stack<>();

        while(fileIn.hasNextInt())
        {
            stack.push(fileIn.nextInt());
        }

        int a,b;

        System.out.println(stack);

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

        Stack<Integer> stackTemp = new Stack<>();
        while(!stack.isEmpty())
        {
            int dummy;
            dummy = stack.pop();
            if(dummy == a)
            {
                dummy = b;
            }
            stackTemp.push(dummy);
        }

        while(!stackTemp.isEmpty())
        {
            stack.push(stackTemp.pop());
        }

        System.out.println(stack);
    }
}


