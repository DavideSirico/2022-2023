import java.util.Random;
public class Auto extends Thread {
    private Semaphore postiLiberi;
    private double costo;

    public Auto(Semaphore s) {
        this.postiLiberi = s;
        costo = 0;
    }
    @Override
    public void run() {
        try {
            this.postiLiberi.acquire();
        } catch (InterruptedException e) {
            System.out.println("Errore nell'acquire");
        }

        System.out.println(this.getName() + " è entrato nella stanza");
        Random r = new Random();
        try {
            int tempo = 100;
            tempo += r.nextInt(1900);
            // System.out.println(tempo);
            Thread.sleep(tempo);
            costo = (tempo/1000)*0.5;
        } catch (InterruptedException e) {
            System.out.println("Errore nello Sleep");
        }
        System.out.println(this.getName() + " esce dalla stanza");
        this.postiLiberi.release();
    }

    public double getCosto() {
        return costo;
    }
}
