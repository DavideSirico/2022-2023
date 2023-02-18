import java.util.*;
public class MainUomo{
	public static void main(String[] args){
		final int DIM = 5;
		int i,j;
		int[] num = new int [DIM];
		String[] str = new String[DIM];
		int numeroIdentificativo,numeroPresenze;
		String nome,cognome,codiceFiscale,citta;
		char sesso;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Stagista[] v = new Stagista[DIM];
		Uomo obj = new Uomo("Zibordi","Sebastiano",'m',"RSSFLV95C12H111Z","Mantova");
		obj.Stampa();
		System.out.println("anno = "+obj.annoNascita());
		System.out.println("\n");
		numeroIdentificativo = 0;
		j=0;
		for(i=0;i<DIM;i++){
			numeroIdentificativo++;
			System.out.print("inserisci cognome = ");
			cognome = scan.nextLine();
			System.out.print("inserisci nome = ");
			nome = scan.nextLine();
			System.out.print("inserisci sesso = ");
			sesso = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("inserisci codice fiscale = "); //manca il controllo sul codice fiscale
			codiceFiscale = scan.nextLine();
			System.out.print("inserisci citta = ");
			citta = scan.nextLine();
			numeroPresenze = rand.nextInt(41)+10;
			v[i] = new Stagista(cognome,nome,sesso,codiceFiscale,citta,numeroPresenze,numeroIdentificativo);
			//v[i].Stampa(i);
			System.out.println("\n");
			num[j] = Integer.valueOf(v[i].annoNascita()).intValue();
			j++;
		}
		scan.close();
		int max,pos;
		max = num[0];
		pos = 0;
		//dò per scontato che tutti gli stagisti siano nati prima del 2000
		for(i=1;i<DIM;i++){
			if(num[i]>max){
				max = num[i];
				pos = i;
			}
		}
		System.out.println("Stagista "+(pos+1)+" nato nel "+max+" e' il piu' giovane");
		for(i=0;i<DIM;i++){
			str[i] = v[i].getCitta();
		}
		String s = "";
		int ctr,maxctr;
		maxctr = ctr = 0;

		for(i=0;i<DIM;i++){
			ctr = 0;
			for(j=0;j<DIM;j++){
				if(str[i]==str[j]){
					ctr++;
				}
			}
			if(ctr>maxctr){
				maxctr = ctr;
				s = str[i];
			}
		}
		System.out.println("La citta' piu' ripetuta e' "+s);
	}
	
}
