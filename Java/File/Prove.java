import java.util.*;
import java.io.*;
public class Prove
{
    public static void main(String[] args) throws IOException
    {
        Scanner file1 = new Scanner(new File("input.txt"));

        int dummy;
        dummy = file1.nextInt();
        while(file1.hasNext())
        {
            System.out.print(dummy + " ");
            dummy = file1.nextInt();
        }
        System.out.print(dummy + " ");
        file1.close();
    }

}
