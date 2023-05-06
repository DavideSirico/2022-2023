package nb_thread7;
public class RunnableClass implements Runnable {

    private int[] array;
    private int k;
    private boolean isPresent;
    private int start;
    private int end;

    RunnableClass(int[] array, int k, int start, int end) {
        this.array = array;
        this.k = k;
        this.isPresent = false;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (array[i] == k) {
                isPresent = true;
                break;
            }
        }
    }

    public boolean getIsPresent() {
        return isPresent;
    }

}
