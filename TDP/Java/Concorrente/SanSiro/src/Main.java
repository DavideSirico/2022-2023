// la macchina esce in qualsiasi momento 0.1 2 secondi
// costa 0.5 euro
// ordine di ingresso e fatturato
public class Main {
    public static void main(String[] args) {
        int maxPosti = 100;
        int macchineTotali = 1000;
        double somma = 0;
        Semaphore semaphore = new Semaphore(maxPosti);

        Auto[] a = new Auto[macchineTotali];
        for(int i = 0; i < macchineTotali; i++) {
            a[i] = new Auto(semaphore);
            a[i].setName("Auto " + Integer.toString(i+1));
            a[i].start();
        }
        try {
            for(int i = 0; i < macchineTotali; i++) {
                a[i].join();
                somma += a[i].getCosto();
            }
        } catch (InterruptedException e) {
            System.out.println("Errore nel join");
        }

        for(int i = 0; i < macchineTotali; i++) {
            somma += a[i].getCosto();
        }
        System.out.println("somma: " + somma);

    }
}