class CounterThread implements Runnable {
    private int secondiPassati;

    public void run() {
        secondiPassati = 0;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                // TODO
                System.out.println("");
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
