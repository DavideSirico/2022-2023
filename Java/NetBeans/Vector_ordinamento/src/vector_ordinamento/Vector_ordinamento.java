package vector_ordinamento;
import java.util.*;
/*
 * Leggere 100 numeri random compresi tra -100 e 100.
 * Li memorizzi in un vector li oridni.
 * Li stampiamo con la funzione toString()
*/
public class Vector_ordinamento {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            int dummy = random.nextInt(201)-100;
            v.add(dummy);
        }
        System.out.println(v);
        v = bubbleSort(v);
        System.out.println(v);
        System.out.println(v.toString());
    }
    public static Vector<Integer> bubbleSort(Vector <Integer>v)
    {
        for(int i = 0; i < v.size()-1; i++)
        {
            for(int j = i + 1; j < v.size(); j++)
            {
                if(v.get(i)<v.get(j))
                {
                    int dummy = v.get(i);
                    v.set(i, v.get(j));
                    v.set(j, dummy);
                }
            }
        }
        return v;
    }
}
