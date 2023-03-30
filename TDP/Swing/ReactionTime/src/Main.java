import java.util.Calendar;
import static java.lang.System.currentTimeMillis;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calendar.getInstance();
        // long time = calendar.getTimeInMillis();
        long time1 = currentTimeMillis();

        input.nextLine();

        long time2 = currentTimeMillis();

        System.out.println(time2 - time1);
    }
}

