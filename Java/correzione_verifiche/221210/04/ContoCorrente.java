public class ContoCorrente
{
	
	private int soldi;
	private int[][] lista;
	ContoCorrente()
	{
		lista = new int[5][2];
		for(int i = 0; i < 5; i++)
		{
			lista[i][1] = -1;
			lista[i][0] = 0;
		}
		soldi = 0;
	}
	public int getSoldi()
	{
		return soldi;
	}
	public void versamento(int n)
	{
		soldi = soldi + n;
		shift(n,1);
	}
	public void prelievo(int n)
	{
		soldi = soldi - n;
		shift(n,2);
	}
	public void shift(int soldi,int tipo)
	{
		for(int i = 3; i >= 0; i--)
		{
			lista[i+1][0] = lista[i][0];
			lista[i+1][1] = lista[i][1];
		}
		lista[0][0] = soldi;
		lista[0][1] = tipo;
	}
	public void listaMovimenti()
	{
		for(int i = 4; i >= 0; i--)
		{
			if(lista[i][1] == 1)
			{
				System.out.println("Versamento: " + lista[i][0]);
			} else if(lista[i][1] == 2) {
				System.out.println("Prelievo: -" + lista[i][0]);
			}
		}
		System.out.println();
	}
		
}
