/*
1) Rifare l'esercizio della ricerca parallela facendo l'esecuzione con N thread.
Con N inserito dall'utente e maggiore di due (fare il data entry tra 2 e 10)

Dato un array di DIM (inserito dall'utente) elementi generati casualmente
compresi tra 0 e 100, scrivi un programma parallelo che ricerchi un valore K
all'interno dell'array e dichiari esso è presente almeno una volta nell'array.
*/

import java.util.Random;
import java.util.Scanner;
public class Main {

    final static private int DIM = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[DIM];
        Random random = new Random();

        for (int i = 0; i < DIM; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        int numberThread = -1;
        System.out.print("Numero di thread: ");
        do {
            try {
                numberThread = scanner.nextInt();
            } catch (Exception e)
            {
                System.out.println("Inserire un numero intero");
                scanner.nextLine();
            }
        } while(numberThread<2 || numberThread>10 || numberThread<(DIM/2));


        int k = -1;;
        RunnableClass[] r = new RunnableClass[numberThread];

        int start = 0;
        int numbersForThread = DIM / numberThread;
        int mod = DIM % numberThread;
        for(int i = 0; i < numberThread-1; i++) {
            r[i] = new RunnableClass(array, k, start, start + numbersForThread);
            start += numbersForThread;
        }
        r[numberThread-1] = new RunnableClass(array, k, start, start + numbersForThread + mod);

        Thread[] t = new Thread[numberThread];
        for(int i = 0; i < numberThread; i++)
        {
            t[i] = new Thread(r[i]);
            t[i].start();
        }

        try {
            for(int i = 0; i < numberThread; i++)
            {
                t[i].join(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Errore");
        }

        System.out.println("------------------------------");
        boolean isPresent = false;

        for(int i = 0; i < numberThread; i++)
        {
            if(r[i].getIsPresent())
            {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("C'é");
        } else {
            System.out.println("non C'è");
        }
    }
}

