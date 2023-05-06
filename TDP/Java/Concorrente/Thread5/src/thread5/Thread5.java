package thread5;

import java.util.Random;

/*
Dato un array di DIM (inserito dall'utente) elementi generati casualmente
compresi tra 0 e 100, scrivi un programma parallelo che ricerchi un valore K
all'interno dell'array e dichiari esso è presente almeno una volta nell'array.
*/
public class Thread5 {

    final static private int DIM = 50000;

    public static void main(String[] args) {
        int[] array = new int[DIM];
        Random random = new Random();

        for (int i = 0; i < DIM; i++) {
            array[i] = random.nextInt(100);
        }

        int k = -1;
        RunnableClass r1 = new RunnableClass(array, k, 0, DIM / 2 - 1);
        RunnableClass r2 = new RunnableClass(array, k, DIM / 2, DIM);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join(500);
        } catch (InterruptedException ex) {
            System.out.println("Errore 1");
        }

        try {
            t2.join(500);
        } catch (InterruptedException ex) {
            System.out.println("Errore 2");
        }
        System.out.println("------------------------------");
        boolean isPresent = r1.getIsPresent() || r2.getIsPresent();

        if (isPresent) {
            System.out.println("C'é");
        } else {
            System.out.println("non C'è");
        }
    }
}
