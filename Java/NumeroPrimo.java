import java.util.Scanner;
public class NumeroPrimo{
	public static void main(String[] args){
		System.out.println("Inserisci un numero: ");
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		int i;
		int divisori = 0;
		for(i=1;i<=numero;i++){
			if(numero%i==0){
				divisori++;
			}
		}
		if(divisori==2){
			System.out.println("Il numero " + numero + " è primo");
		}else{
			System.out.println("Il numero " + numero + " non è primo");
		}
		input.close();
	}
}
