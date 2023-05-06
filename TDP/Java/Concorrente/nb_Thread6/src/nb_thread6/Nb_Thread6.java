/*
1) Rifare l'esercizio della ricerca parallela facendo l'esecuzione con N thread.
Con N inserito dall'utente e maggiore di due (fare il data entry tra 2 e 10)

Dato un array di DIM (inserito dall'utente) elementi generati casualmente
compresi tra 0 e 100, scrivi un programma parallelo che ricerchi un valore K
all'interno dell'array e dichiari esso è presente almeno una volta nell'array.
*/
package nb_thread6;

import java.util.Random;
import java.util.Scanner;
public class Nb_Thread6 {

    final static private int DIM = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[DIM];
        Random random = new Random();

        for (int i = 0; i < DIM; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        int number_thread = -1;
        System.out.println("Numero di thread: ");
        do{
            try {
                number_thread = scanner.nextInt();
            } catch (Exception e)
            {
                System.out.println("Inserire un numero intero");
                scanner.nextLine();
            }
        }while(number_thread<2 || number_thread>10);


        int k = -1;;
        RunnableClass[] r = new RunnableClass[number_thread];

        int start = 0;
        int numbers_for_thread = DIM / number_thread;
        int mod = DIM % number_thread;
        for(int i = 0; i < number_thread-1; i++)
        {
            r[i] = new RunnableClass(array, k, start, start + numbers_for_thread);
            start += numbers_for_thread;
        }
        r[number_thread-1] = new RunnableClass(array, k, start, start + numbers_for_thread + mod);
                

        Thread[] t = new Thread[number_thread];
        for(int i = 0; i < number_thread; i++)
        {
            t[i] = new Thread(r[i]);
            t[i].start();
        }

        try {
            for(int i = 0; i < number_thread; i++)
            {
                t[i].join(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Errore");
        }

        System.out.println("------------------------------");
        boolean isPresent = false;

        for(int i = 0; i < number_thread; i++)
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

