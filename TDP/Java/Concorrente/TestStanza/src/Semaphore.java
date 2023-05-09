public class Semaphore {
    // quante sono le risorse disponibili nella sezione critica
    private int counter;

    public Semaphore() {
        this.counter = 1;
    }
    public Semaphore(int counter) {
        this.counter = counter;
    }
    // solo una alla volta
    public synchronized void acquire() throws InterruptedException {
        if (this.counter == 0) {
            this.wait();
        }
        this.counter--;
    }

    public  synchronized void release() {
        this.counter++;
        if(this.counter > 0) {
            this.notify();
        }
    }
}
