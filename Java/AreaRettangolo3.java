//calcolo dell'area del rettangolo
java.util.Scanner //includo la libreria per l'input da tastiera
public class AreaRettangolo3{
	public static void main(String[] args){
		int area;
		Scanner base=new scanner(System.in);
		print("Base: ");
		Scanner altezza=new scanner(System.in);
		print("Altezza: ");

		area = base * altezza;

		System.out.println("Area= "+area);

	}
}
