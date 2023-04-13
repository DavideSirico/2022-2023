import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.*;
public class Main3 {
    public static void main(String[] args)
    {
        try{
            FileReader fileReader = new FileReader("src/input.txt");
            BufferedReader input = new BufferedReader(fileReader);

            String currentNumber;
            Stack<Integer> S = new Stack<>();

            if((currentNumber=input.readLine()) == null)
            {
                System.out.println("File vuoto");
                return;
            }

            S.push(Integer.parseInt(currentNumber));
            while((currentNumber=input.readLine())!=null)
            {
                int number = Integer.parseInt(currentNumber);
                Stack<Integer> stackTemp = new Stack<>();

                while((!S.isEmpty()) && S.peek() > number)
                {
                    stackTemp.push(S.pop());

                }
                S.push(number);
                while(!stackTemp.isEmpty())
                {
                    S.push(stackTemp.pop());
                }

            }
            System.out.println(S);


        } catch (IOException e) {
            System.out.println("File non trovato");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Sono numeri");
            return;
        }
    }
}
