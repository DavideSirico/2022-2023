import java.util.Random;
import java.util.ArrayList;
public class Somma {
    public static void main(String[] args)
    {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            list.add(r.nextInt(5));
        }
        int somma = 0;
        for(int number : list)
        {
            somma += number;
        }
        System.out.println(list);
        System.out.println("Somma: " + somma);
    }
}
