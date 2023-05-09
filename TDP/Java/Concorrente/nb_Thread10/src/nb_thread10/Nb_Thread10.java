/*
2) Prendere l'esercizio dei numeri primi (8), confrontare il tempo tra l'esecuzione parallela
e l'esecuzione con un thread.
*/
package nb_thread10;

import java.util.Scanner;
public class Nb_Thread10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfThread, end;

        System.out.print("Numero di thread: ");
        do{
            numberOfThread = input.nextInt();
        }while(numberOfThread <= 2);

        System.out.print("Y: ");
        do{
            end = input.nextInt();
        }while(end <= 1000);

        int start = 0;
        int range = end / numberOfThread;
        int mod = end % numberOfThread;
        int endSerial = end;
        Prime[] prime = new Prime[numberOfThread];
        Thread[] threads = new Thread[numberOfThread];

        for(int i = 0; i < numberOfThread; i++) {
            if (i == numberOfThread - 1) {
                end = start + range + mod;
            } else {
                end = start + range;
            }
            prime[i] = new Prime(start, end);
            threads[i] = new Thread(prime[i]);
            threads[i].start();
            start = end;
        }

        try{
            for(int i = 0; i < numberOfThread; i++){
                threads[i].join();
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("I numeri primi sono: ");
        for(int i = 0; i < numberOfThread; i++){
            int numberOfPrimes = prime[i].getNumberOfPrimes();
            for(int j = 0; j < numberOfPrimes; j++){
                System.out.print(prime[i].getPrimes().get(j) + " ");
            }
        }
        System.out.println();

        // senza thread
        System.out.println("I numeri primi sono: ");
        for (int i = 0; i < endSerial; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for(int i = 2; i < squareRoot; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

