package nb_thread9;
import java.util.Random;
public class RunnableClass implements Runnable {
    private int[] array;
    RunnableClass() {
        array = new int[100];
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            array[i] = new Random().nextInt(10000);
        }
    }

    public int[] getArray() {
        return array;
    }
}
