package overloading;
import java.util.Scanner;
public class Overloading {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        Persona p = new Persona();
        
        int anniInput;
        String cognomeInput;
        
        String dummy1;
        String dummy2;
        
        System.out.print("Inserire cognome o anni: ");
        dummy1 = input.nextLine();
        
        System.out.print("Inserire cognome o anni: ");
        dummy2 = input.nextLine();
        
        try{
            anniInput = Integer.parseInt(dummy1);
            cognomeInput = dummy2;
        } catch(NumberFormatException e)
        {
            anniInput = Integer.parseInt(dummy2);
            cognomeInput = dummy1;
        }
        
        p.setDati(anniInput,cognomeInput);
        
        System.out.println(p.toString());
        input.close();
    }
}
