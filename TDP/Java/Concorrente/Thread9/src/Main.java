import java.util.HashSet;
import java.util.Set;

/*
3) Scrivi un programma che generi tre thread.
Ogni thread genera 100 elementi compresi tra zero e 10000.
Il programma deve fondere in un unico array i tre array senza ripetizione.
 */
public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        RunnableClass[] runnableClasses = new RunnableClass[3];

        for(int i = 0; i < 3; i++)
        {
            runnableClasses[i] = new RunnableClass();
            threads[i] = new Thread(runnableClasses[i]);
            threads[i].start();
        }

        try {
            for(int i = 0; i < 3; i++)
            {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Set<Integer> mergedArray = new HashSet<>();

        for(int i = 0; i < 3; i++)
        {
            int[] array = runnableClasses[i].getArray();
            for(int j = 0; j < 100; j++)
            {
                mergedArray.add(array[j]);
            }
        }

        System.out.println(mergedArray);
    }
}