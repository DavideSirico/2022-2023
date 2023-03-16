import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stackTemp = new Stack<Integer>();

        File file = new File("src/input2.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String text;
            int top;
            while ((text = reader.readLine()) != null) {
                String[] numbers = text.split(" ");
                stack.push(Integer.parseInt(numbers[0]));
                for(int i = 1; i < numbers.length; i++) {
                    int currentNumber = Integer.parseInt(numbers[i]);

                    top = stack.pop();
                    stack.push(top);
                    while (!stack.empty() && top > currentNumber) {
                        stackTemp.push(stack.pop());
                        if (!stack.empty()) {
                            top = stack.pop();
                            stack.push(top);
                        }
                    }

                    stack.push(currentNumber);

                    while (!stackTemp.empty()) {
                        stack.push(stackTemp.pop());
                    }
                }
            }
            System.out.println(stack);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}