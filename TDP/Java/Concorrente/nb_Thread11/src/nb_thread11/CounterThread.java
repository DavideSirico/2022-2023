package nb_thread11;
class CounterThread implements Runnable {
    private int secondiPassati;

    public void run() {
        secondiPassati = 0;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
                secondiPassati++;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public int getSecondiPassati() {
        return secondiPassati;
    }
}
