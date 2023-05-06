package nb_thread8;
/*
2) Digitati due numeri K e Y, con K > 2 e Y > 1000
calcola tutti i numeri primi tra 0 e Y dividendo l'esecuzione tra K thread. K è maggiore di 2.
*/

import java.util.Scanner;
public class Nb_Thread8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfThread, end;

        System.out.println("Numero di thread: ");
        do{
            numberOfThread = input.nextInt();
        }while(numberOfThread <= 2);

        System.out.println("Y: ");
        do{
            end = input.nextInt();
        }while(end <= 1000);

        int start = 0;
        int range = end / numberOfThread;
        int mod = end % numberOfThread;

        Prime[] prime = new Prime[numberOfThread];
        Thread[] threads = new Thread[numberOfThread];

        for(int i = 0; i < numberOfThread; i++){
            if(i == numberOfThread - 1){
                end = start + range + mod;
            }else{
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

    }
}

