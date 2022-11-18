// 1b) Inserire 3 numeri in input da prompt con gestione delle eccezioni e calcolare la media
import java.util.Scanner;
public class TreNumeriTerminal{
	public static void main(String[] args){
		int a,b,c;
		float media;
		if(args.length!=3){
			System.out.println("Sintassi <num1> <num2> <num3>");
			return;
		}
		try{
			a = Integer.valueOf(args[0]).intValue();
			b = Integer.valueOf(args[1]).intValue();
			c = Integer.valueOf(args[2]).intValue();
			media=a+b+c;
			media=media/(float)3;
			System.out.println("Media="+media);
		}
		catch(Exception e){
			System.out.println("Parametri non corretti");
			return;
		}

	}
}
