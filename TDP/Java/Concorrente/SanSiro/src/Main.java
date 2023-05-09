// la macchina esce in qualsiasi momento 0.1 2 secondi
// costa 0.5 euro
// ordine di ingresso e fatturato
public class Main {
    public static void main(String[] args) {
        int maxPosti = 100;
        int macchineTotali = 1000;
        double somma = 0;
        Semaphore semaphore = new Semaphore(maxPosti);

        Auto a;
        for(int i = 0; i < macchineTotali; i++) {
            a = new Auto(semaphore);
            a.setName("Auto " + Integer.toString(i+1));
            a.start();
        }
        System.out.println("somma: " + somma);

    }
}