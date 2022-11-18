// 1a) Inserire 3 numeri in input e calcolare la media
import java.util.Scanner;
public class TreNumeri{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a,b,c;
		float media;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		media=a+b+c;
		media=media/(float)3;
		System.out.println("Media="+media);
		input.close();
	}
}
