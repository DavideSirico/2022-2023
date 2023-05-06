package thread4;
/*
La somma dei primi 10 000 numeri naturali
primi 5 000 il primo thread
gli altri 5 000 il secondo thread
*/
public class Thread4 {
    public static void main(String[] args) {
        RunnableClass r1 = new RunnableClass(0,5000);
        RunnableClass r2 = new RunnableClass(5001,10000);
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
        long risultato1 = r1.getResult();
        long risultato2 = r2.getResult();
        long rTot = risultato1 + risultato2;
        System.out.println("Risultato: " + rTot);
        
    }    
}