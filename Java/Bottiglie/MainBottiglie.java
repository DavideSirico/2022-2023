import java.util.Scanner;
import java.util.Random;

class MainBottiglie
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int counter = 0;
        Bottiglie[] b = new Bottiglie[5]; // dichiaro un array di oggetti Bottiglie

        for(int i = 0; i < b.length; i++)
        {
            String dummy;
            System.out.print("Inserire nome: ");
            dummy = input.nextLine();
            b[i] = new Bottiglie(counter, rand.nextFloat()*50, dummy); // istanzia l'oggetto b[i]
            counter++;
        }

        for(int i = 0; i < b.length; i++)
        {
            System.out.println("Codice: " + b[i].getCodice());
            System.out.println("Gradi: " + b[i].getGradi());
            System.out.println("Nome: " + b[i].getNome() + '\n');

        }
        input.close();
    }
}


// classe con 3 attributi int, float, string 
// int e float random
// string da scanner
