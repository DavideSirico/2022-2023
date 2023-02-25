/*17>230225_Stack01.java
Creare una classe Stack01.
Importare solo le classi java.util.Random e java.util.Stack.
Usare solo i metodi  primitivi di push(), pop(), empty().
Caricare una pila P1 con 10 numeri interi random.
Visualizzare P1.
Svuotare P1 in una pila P2 (che sarà un reverse di P1).
Visualizzare P2.
Solo adesso, aggiungere un nuovo elemento che sarà la somma del primo(bottom) e
dell'ultimo elemento(top) presenti nella pila. Visualizzare P2.

Es:
P1 [1,2,3,4,5]
P2 [5,4,3,2,1]
P2 [5,4,3,2,1,15]
* */

import java.util.Stack;
import java.util.Random;
public class Stack01 {
    public static void main(String[] args) {
        Random random = new Random();

        Stack<Integer> P1 = new Stack<>();

        // Caricamento della pila P1
        for(int i = 0; i < 10; i++)
        {
            P1.push(random.nextInt(10));
        }
        System.out.println(P1);
        Stack<Integer> P2 = new Stack<>();

        // Carico la pila P2 svuotando la pila P1
        while(!P1.empty())
        {
            P2.push(P1.pop());
        }
        System.out.println(P2);

        // Creo un nuovo stack temporaneo
        Stack<Integer> stackTemp = new Stack<>();

        // Salvo il primo elemento della pila P2
        int topElement = P2.pop();
        stackTemp.push(topElement);
        while(!P2.empty())
        {
            stackTemp.push(P2.pop());
        }
        // Salvo l'ultimo elemento della pila P2
        int bottomElement = stackTemp.pop();
        stackTemp.push(bottomElement);

        System.out.println(stackTemp);
        // Riporto allo stato originale la pila P2
        while(!stackTemp.empty())
        {
            P2.push(stackTemp.pop());
        }
        P2.push(topElement+ bottomElement);
        System.out.println(P2);
    }
}