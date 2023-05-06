/*
1) Rifare l'esercizio della ricerca parallela facendo l'esecuzione con N thread.
Con N inserito dall'utente e maggiore di due (fare il data entry tra 2 e 10)
1b) Rifare l'esercizio della ricerca parallela come nell'esercizio 1 con un array di K elementi. K è maggiore di 10. Fare il data entry.
Dato un array di DIM (inserito dall'utente) elementi generati casualmente
compresi tra 0 e 100, scrivi un programma parallelo che ricerchi un valore K
all'interno dell'array e dichiari esso è presente almeno una volta nell'array.
*/

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberOfThread = -1;
        System.out.print("Numero di thread: ");
        do{
            try {
                numberOfThread = scanner.nextInt();
            } catch (Exception e)
            {
                System.out.println("Inserire un numero intero");
                scanner.nextLine();
            }
        }while(numberOfThread<2 || numberOfThread>10);
        /*
            si può fare il data entry con un numero divisore
        */

        System.out.print("Numero di elementi: ");
        int K = -1;
        do{
            try {
                K = scanner.nextInt();
            } catch (Exception e)
            {
                System.out.println("Inserire un numero intero");
                scanner.nextLine();
            }
        }while(K<10);

        int[] array;
        try {
            array = new int[K];
        } catch (Exception e) {
            System.out.println("RAM");
            return;
        }

        for (int i = 0; i < K; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        
        int numberToSearch = 5;
        RunnableClass[] r = new RunnableClass[numberOfThread];


        int start = 0;
        int numbersForThread = K / numberOfThread;
        int mod = K % numberOfThread;
        for(int i = 0; i < numberOfThread-1; i++)
        {
            r[i] = new RunnableClass(array, numberToSearch, start, start + numbersForThread);
            start += numbersForThread;
        }
        r[numberOfThread-1] = new RunnableClass(array, numberToSearch, start, start + numbersForThread + mod);


        Thread[] t = new Thread[numberOfThread];
        for(int i = 0; i < numberOfThread; i++)
        {
            t[i] = new Thread(r[i]);
            t[i].start();
        }

        try {
            for(int i = 0; i < numberOfThread; i++)
            {
                t[i].join(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Errore");
        }

        System.out.println("------------------------------");
        boolean isPresent = false;

        for(int i = 0; i < numberOfThread; i++)
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

