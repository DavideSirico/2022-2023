import java.util.Scanner;
public class MainContoCorrente
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ContoCorrente cc = new ContoCorrente();
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("v-versamento\tp-prelievo\tl-lista movimenti\ts-saldo\tx-exit");
			char scelta;
			try{
				String dummy = input.nextLine();
				scelta = dummy.charAt(0);
			} catch(Exception e)
			{
				System.out.print("Inserire un carattere");
				return;
			}
			int somma;
			switch(scelta)
			{
				case 'v':
					System.out.print("Somma da versare: ");
					try{
						somma = input.nextInt();
					} catch(Exception e)
					{
						System.out.print("Inserire un numero");
						return;
					}
					input.nextLine();
					cc.versamento(somma);
					break;
				case 'p':
					System.out.print("Somma da prelevare: ");
					try{
						somma = input.nextInt();
					} catch(Exception e)
					{
						System.out.print("Inserire un numero");
						return;
					}
					input.nextLine();
					cc.prelievo(somma);
					break;
				case 'l':
					cc.listaMovimenti();
					break;
				case 's':
					System.out.println(cc.getSoldi());
					break;
				case 'x':
					flag = false;
					break;
				default:
					System.out.println("Scenlta non valida");
			}
		}
	}
}
