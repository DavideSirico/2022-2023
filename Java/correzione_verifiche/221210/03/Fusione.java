public class Fusione
{
	private int[] v1;
	private int[] v2;
	private int[] v3;
	
	Fusione(int[] v1, int[] v2)
	{
		this.v1 = new int[v1.length];
		for(int i = 0; i < v1.length; i++)
			this.v1[i] = v1[i];
		this.v2 = new int[v2.length];
		for(int i = 0; i < v2.length; i++)
			this.v2[i] = v2[i];
		int dim = getLengV3();
		this.v3 = new int[dim];
	}
	
	private int getLengV3()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < v1.length && j < v2.length)
		{
			if(v1[i] < v2[j])
			{
				i++;
				k++;
			} else if(v1[i] > v2[j]) {
				j++;
				k++;
			} else {
				i++;
				j++;
				k++;
			}
		}
		while(i < v1.length)
		{
			i++;
			k++;
		}
		while(j < v2.length)
		{
			j++;
			k++;
		}
		return k;
	}
	
	
	
	public void visualizzaV1()
	{
		for(int i = 0; i < v1.length; i++)
			System.out.print(v1[i] + " ");
		System.out.println();
	}
	public void visualizzaV2()
	{
		for(int i = 0; i < v2.length; i++)
			System.out.print(v2[i] + " ");
		System.out.println();
	}
	public void visualizzaV3()
	{
		for(int i = 0; i < v3.length; i++)
			System.out.print(v3[i] + " ");
		System.out.println();
	}
	public void merge()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < v1.length && j < v2.length)
		{
			if(v1[i] < v2[j])
			{
				v3[k] = v1[i];
				i++;
				k++;
			} else if(v1[i] > v2[j]) {
				v3[k] = v2[j];
				j++;
				k++;
			} else {
				v3[k] = v1[i];
				i++;
				j++;
				k++;
			}
		}
		while(i < v1.length)
		{
			v3[k] = v1[i];
			i++;
			k++;
		}
		while(j < v2.length)
		{
			v3[k] = v2[j];
			j++;
			k++;
		}
	}
}
