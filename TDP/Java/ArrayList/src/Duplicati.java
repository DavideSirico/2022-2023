import java.util.ArrayList;
import java.util.Random;
public class Duplicati
{
    public static void main(String[] args)
    {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            list.add(r.nextInt(10));
        }

        System.out.println(list);

        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i+1; j < list.size(); j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
