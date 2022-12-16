import java.util.*;
import java.io.*;
class MainVettore
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("input.txt"));

        int counter;
        for(counter = 0; in.hasNext(); counter++, in.nextInt());
        in.close();

        Vettore v = new Vettore(counter);
        in = new Scanner(new File("input.txt"));
        /*int dummy = in.nextInt();
        for(; in.hasNext(); dummy = in.nextInt())
        {
            v.aggiungi(dummy);
        }
        v.aggiungi(dummy)
        */

        int dummy;
        dummy = in.nextInt();
        while(in.hasNext())
        {
            v.aggiungi(dummy);
            dummy = in.nextInt();
        }
        v.aggiungi(dummy);
        v. sort();

        v.stampa();

    }
}
