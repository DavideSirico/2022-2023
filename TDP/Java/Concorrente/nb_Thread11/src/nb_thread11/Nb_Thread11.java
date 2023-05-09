package nb_thread11;
/*
1) Scrivi un programma che generi un thread secondario che stampa ogni secondo un contatore
del numero di secondi di esecuzione.
Il thread principale sospende l'esecuzione dopo aver letto un numero intero.
Stampare nel thread principale il numero di secondi del thread secondario.
*/
import java.util.Scanner;
public class Nb_Thread11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CounterThread counterThread = new CounterThread();
        Thread t = new Thread(counterThread);
        t.start();
        System.out.println("Inserisci un numero intero per fermare il thread: ");
        scanner.nextInt();
        scanner.close();
        t.interrupt();

        System.out.println("Il thread secondario ha eseguito per " + counterThread.getSecondiPassati() + " secondi");
    }
}