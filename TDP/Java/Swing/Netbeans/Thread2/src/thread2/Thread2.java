package thread2;
public class Thread2 extends Thread {
    public static void main(String[] args)
    {
        Thread2[] t = new Thread2[10];
        for(int i = 0; i < 10; i++)
        {
            t[i] = new Thread2();
            t[i].setName(Integer.toString(i));
            t[i].start();
        }
        System.out.println("Fine");
    }
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


