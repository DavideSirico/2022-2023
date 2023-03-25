import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNumbers {
	
	public static void main (String[] args) {
		try {
			FileReader fileLeggi = new FileReader("temp");
			BufferedReader in = new BufferedReader(fileLeggi);
			String linea = in.readLine();
			while(linea != null)
			{
				String[] numeri = linea.split(" ");
				
				for(String numero : numeri)
				{
					System.out.println(numeri + " ");
				}
				linea = in.readLine();
			}
			in.close();
		} catch(IOException e) {
			System.out.println("Errore nella lettura del file");
		}
	}
}

