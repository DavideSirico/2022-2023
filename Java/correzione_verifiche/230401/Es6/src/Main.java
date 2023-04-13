import java.util.Queue;
import java.util.LinkedList;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try {
			FileReader fileReader = new FileReader("src/numeri.txt");
			BufferedReader input = new BufferedReader(fileReader);
			
			String currentNumber;
			if((currentNumber=input.readLine())==null)
			{
				System.out.println("File vuoto");
				return;
			}
			
			Queue<Integer> C1 = new LinkedList<>();
			int number = Integer.parseInt(currentNumber);
			C1.add(number);
			while((currentNumber=input.readLine())!=null)
			{
				number = Integer.parseInt(currentNumber);
				C1.add(number);
			}
			stampa(C1);
			elimina(C1);
			stampa(C1);
			
		} catch(IOException e)
		{
			System.out.println("Impossibile leggere il file");
		} catch(NumberFormatException e)
		{
			System.out.println("Inserire solo numeri nel file");
		}
	}
	public static void stampa(Queue<Integer> C)
	{
		System.out.println("C1" + C);
	}
	

	public static void elimina(Queue<Integer> C)
	{
		Queue<Integer> temp = new LinkedList<>();
		while(!C.isEmpty())
		{
			int current = C.remove();
			temp.add(current);
		}
		while(!temp.isEmpty())
		{
			int current = temp.remove();
			if(!isDuplicate(C, current))
			{
				C.add(current);
			}
		}
	}
	public static boolean isDuplicate(Queue<Integer> C, int n)
	{
		Queue<Integer> temp = new LinkedList<>();
		boolean duplicate = false;
		while(!C.isEmpty())
		{
			int current = C.remove();
			if(current==n)
			{
				duplicate = true;
			}
			temp.add(current);
		}
		while(!temp.isEmpty())
		{
			C.add(temp.remove());
		}
		return duplicate;
	}
}
