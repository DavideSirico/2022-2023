package thread1;
public class Thread1 {
    public static void main(String[] args)
    {
        Counter[] m = new Counter[10];
        for(int i = 0; i < 10; i++)
        {
            m[i] = new Counter();
            m[i].setName(Integer.toString(i));
            m[i].start();
        }
        System.out.println("Fine");

    }
}

