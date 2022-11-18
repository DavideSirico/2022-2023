// Creare una calcolatrice 
public class Main
{
    public static void main(String[] args)
    {
        String dummy = "5+5";
        int[] numbers = new int[10];
        int n = dummy.indexOf("+");
        String dummy2 = dummy.substring(0,n);
        System.out.println(dummy2);
    }
}
