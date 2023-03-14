import java.util.ArrayList;
import java.util.Random;
public class Consecutivi {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(5));
        }
        System.out.println(list);

        int c;
        int cMax = 0;
        int iPos;
        int iPosMax = 0;
        for(int i = 0; i < list.size()-1; i++)
        {
            c = 1;
            iPos = i;
            while(i<list.size()-1 && list.get(i).equals(list.get(i+1)))
            {
                i++;
                c++;
            }
            if(c > cMax)
            {
                cMax = c;
                iPosMax = iPos;
            }
        }

        for(int i = iPosMax; i < iPosMax+cMax; i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}