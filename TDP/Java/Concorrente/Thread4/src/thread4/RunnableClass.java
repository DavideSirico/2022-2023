package thread4;

public class RunnableClass implements Runnable {

    private long start;
    private long end;
    private long result;

    RunnableClass() {
        start = 0;
        end = 0;
        result = 0;
    }

    RunnableClass(int start, int end) {
        this.start = start;
        this.end = end;
        this.result = 0;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            result = result + i;
        }
    }

    public long getResult() {
        return result;
    }
}
