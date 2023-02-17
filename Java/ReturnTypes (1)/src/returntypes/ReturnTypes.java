package returntypes;
import java.util.Scanner;
public class ReturnTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int i;
        // caricamento array
        try{
            for(i = 0; i < 10; i++)
            {
                array[i] = input.nextInt();
            }
        } catch(Exception e)
        {
            System.out.print("Inserire solo numeri naturali");
            return;
        }
        // richiamo il metodo
        float[] array2 = maxMinMedia(array);

        // visualizzo il return del metodo
        for(i = 0; i < array2.length; i++)
        {
            System.out.print(array2[i] + " ");
        }
    }
    public static float[] maxMinMedia(int[] array)
    {
        float media = array[0];
        int max = array[0];
        int min = array[0];
        float[] returnArray = new float[3];
        for(int i = 1; i < array.length; i++)
        {
            media += array[i];
            if(max<array[i])
            {
                max = array[i];
            }
            if(min>array[i])
            {
                min = array[i];
            }
        }
        media = media / array.length;
        returnArray[0] = min;
        returnArray[1] = max;
        returnArray[2] = media;
        return returnArray;
    }
}
