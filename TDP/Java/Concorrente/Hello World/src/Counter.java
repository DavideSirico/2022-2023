public class Counter extends Thread {
    @Override
    public void run()
    {
        System.out.println("Thread ID " + this.getName());
        for(int i = 0; i < 10; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

