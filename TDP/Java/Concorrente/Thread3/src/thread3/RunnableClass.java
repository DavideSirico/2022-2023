package thread3;
public class RunnableClass implements Runnable {

    private int start;
    private int end;

    RunnableClass() {
        start = 0;
        end = 0;
    }

    RunnableClass(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        if (end > start) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
                /*
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    System.out.println("Il thread è stato bloccato!");
                }
                */
            }
        } else {
            for (int i = start; i >= end; i--) {
                System.out.println(i);
            }
        }
    }

}
