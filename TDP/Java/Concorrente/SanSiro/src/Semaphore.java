public class Semaphore {
    private int counter;

    public Semaphore(int counter) {
        this.counter = counter;
    }
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
