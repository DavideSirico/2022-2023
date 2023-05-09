import java.util.Random;
public class Persona extends Thread {
    Semaphore postiLiberi;

    public Persona(Semaphore s) {
        this.postiLiberi = s;
    }
    @Override
    public void run() {
        try {
            this.postiLiberi.acquire();
        } catch (InterruptedException e) {
            System.out.println("Errore nell'acquire");
        }

        System.out.println("Il Thread " + this.getName() + " è entrato nella stanza");
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(1500));
        } catch (InterruptedException e) {
            System.out.println("Errore nello Sleep");
        }
        System.out.println("Il Thread " + this.getName() + " esce dalla stanza");
        this.postiLiberi.release();


    }

}
