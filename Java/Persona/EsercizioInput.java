import java.util.Scanner;

class EsercizioInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        String dummy;
        for(int i = 1; i <= 3; i++)
        {
            System.out.print("Inserire " + i + " numeri: ");
            num = input.nextInt();
        }
        
        // input.nextLine()
        // Scanner str = new Scanner(System.in);
        // input = new Scanner(System.in);


        for(int i = 1; i <= 3; i++)
        {
            System.out.print("Inserire " + i + " stringa: ");
            dummy = input.nextLine();
        }
        input.close();
    }
}
