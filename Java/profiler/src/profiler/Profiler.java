package profiler;
public class Profiler {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int ris;
        ris = somma(x,y);
        System.out.println(ris);    
    }
    
    public static int somma(int a, int b)
    {
        int somma = a + b;
        return somma;
    }
}
