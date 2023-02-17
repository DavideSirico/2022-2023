package MainUomo;

import java.util.Random;
import java.util.Scanner;
public class MainUomo
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		String dummyNome;
		String dummyCognome;
		String dummyCodiceFiscale;
		String dummySesso;
		String dummyCitta;	
		
		// input dati per la classe Uomo
		System.out.print("Nome: ");
		dummyNome = input.nextLine();
		System.out.print("Cognome: ");
		dummyCognome = input.nextLine();
		do{
			System.out.print("Codice Fiscale: ");
			dummyCodiceFiscale = input.nextLine();
		}while(!Uomo.validateCodiceFiscale(dummyCodiceFiscale));
		System.out.print("Sesso (M)aschio/(F)emmina: ");
		dummySesso = input.nextLine();
		System.out.print("Citta: ");
		dummyCitta = input.nextLine();
		Uomo u = new Uomo(dummyNome,dummyCognome,dummyCodiceFiscale,dummySesso.charAt(0),dummyCitta);
		
		// visualizzo l'eta
		System.out.println("Anno di nascita: " + u.annoNascita());
		
		int DIM = 10;
		Stagista[] s = new Stagista[DIM];
		
		// input per riempire l'array di Stagisti
		for(int i = 0; i < DIM; i++)
		{
			System.out.println("Stagista " + (i+1) + ": "); 
			System.out.print("Nome: ");
			dummyNome = input.nextLine();
			System.out.print("Cognome: ");
			dummyCognome = input.nextLine();
			do{
				System.out.print("Codice Fiscale: ");
				dummyCodiceFiscale = input.nextLine();
			}while(!Uomo.validateCodiceFiscale(dummyCodiceFiscale));
			System.out.print("Sesso (M)aschio/(F)emmina: ");
			dummySesso = input.nextLine();
			System.out.print("Citta: ");
			dummyCitta = input.nextLine();
			s[i] = new Stagista(dummyNome,dummyCognome,dummyCodiceFiscale,dummySesso.charAt(0),dummyCitta,random.nextInt(41)+10,i+1);
		}
		
		/*
		for(int i = 0; i < 10; i++)
		{
			s[i].stampa();
		}
		*/
		
		System.out.println("Piu giovane: ");
		s[getGiovane(s,DIM)].stampa();
		
		System.out.println("Citta piu popolare: " + getCittaPreferita(s,DIM));
	}
	static int getGiovane(Stagista[] s,int DIM)
	{
		int min = s[0].annoNascita();
		int iMin = 0; 
		for(int i = 1; i < DIM; i++)
		{
			if(s[i].annoNascita() < min)
			{
				min = s[i].annoNascita();
				iMin = i;
			}
		}
		return iMin;
	}
	static String getCittaPreferita(Stagista[] s, int DIM)
	{
		String[] citta = new String[DIM];
		int[] nCitta = new int[DIM];
		
		int maxIndex = 1;
		
		
		for(int i = 0; i < DIM; i++)
		{
			citta[i] = s[i].getCitta();
			nCitta[i] = 1;
		}
		
		for(int i = 0; i < DIM-1; i++)
		{
			for(int j = i + 1; j < DIM; j++)
			{
				if(citta[i]==citta[j])
				{
					citta[j] = "";
					nCitta[i]++;
				}
			}
		}
		
		for(int i = 0; i < DIM; i++)
		{
			if(citta[i]!="")
			{
				System.out.println(citta[i] + " " + nCitta[i]);
			}
		}
		
		int max = nCitta[0];
		int iMax = 0;
		for(int i = 0; i < DIM; i++)
		{
			if(nCitta[i]>max)
			{
				iMax = i;
				max = nCitta[i];
			}
		}
		return s[iMax].getCitta();
	}
}
