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
        Object array[];
        
        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            int dummy = random.nextInt(201)-100;
            v.add(dummy);
        }
        System.out.println(v);
        v.sort(Collections.sort(v);
        System.out.println(v);
        array = v.toArray();
        System.out.println(array[0]);
        
    }
    
}
