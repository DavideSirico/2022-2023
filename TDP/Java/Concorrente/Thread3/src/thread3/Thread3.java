package thread3;

public class Thread3 {
    public static void main(String[] args) {
        RunnableClass r1 = new RunnableClass(0,100);
        RunnableClass r2 = new RunnableClass(0,-100);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
        
        try {
            t1.join(500);
        } catch (InterruptedException ex) {
            System.out.println("Errore 1");
        }
        
        try {
            t2.join(500);
        } catch (InterruptedException ex) {
            System.out.println("Errore 2");
        }
        System.out.println("------------------------------");
        
        Thread t3 = Thread.currentThread();
    }    
}
