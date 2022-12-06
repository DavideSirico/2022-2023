import java.util.Scanner;

public class MainArrayStringhe {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire una stringa: ");
        String dummy = input.nextLine();
        int len = dummy.length();

        String[] s = new String[len];

        s[0] = dummy;
        for(int i = 1; i < len; i++)
        {
            s[i] = right_push(s[i-1]);
        }
        stampa(s);
        input.close();
    }
    public static void stampa(String[] s)
    {
        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
    public static String right_push(String dummy)
    {
        int len = dummy.length();
        char[] charArray = new char[len];
        char temp = dummy.charAt(0);
        for(int i = 0; i < len-1; i++)
        {
            charArray[i] = dummy.charAt(i+1);
        }
        charArray[len-1] = temp;

        String strShifted = new String(charArray);

        return strShifted;
    }
}
