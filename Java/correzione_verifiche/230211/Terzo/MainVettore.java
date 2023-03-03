import java.util.Random;
public class MainVettore
{
	public static void main(String args[])
	{
		Random random = new Random();
		// int[] v = {1,2,3,54,56,57,58,59,4,5,65};
		// int[] v = {1,2,3,4,5};
		// int[] v = {12,4,66,7,89};
	    int[] v = {1,2,3,1,2,3,4};
		getMaggiore(v,7);
		
		
	}
	static void getMaggiore(int[] v, int DIM)
	{
		int c = 1;
		int cMax = 0;
		int iMaxInizio = 0;
		int iMaxFine = 0;
		int iInizio = 0;
		int iFine = 0;
		for(int i = 0; i < DIM-1; i++)
		{
			iInizio = i;
			while(v[i]==(v[i+1]-1) && i < DIM-1)
			{
				c++;
				i++;
				if(i==DIM-1)
				{
					break;
				}
			}
			iFine = i+1;
			if(c>cMax)
			{
				iMaxInizio = iInizio;
				iMaxFine = iFine;
				cMax = c;
			}
			c = 1;
		}
		System.out.println("iMaxInizio: " + iMaxInizio);
		System.out.println("iMaxFine: " + iMaxFine);
		System.out.println("cMax: " + cMax);
		
		
		int[] ris = new int[cMax];
		
		for(int i = iMaxInizio; i < iMaxFine; i++)
		{
			ris[i-iMaxInizio] = v[i];
		}
		if(iMaxInizio == iMaxFine)
		{
			ris[0] = v[0];
		}
		for(int i = 0; i < cMax; i++)
		{
			System.out.print(ris[i] + " ");
		}
			
	}
}
