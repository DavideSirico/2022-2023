import java.util.Random;
public class Permutazioni
{
	private int[] v;
	Permutazioni()
	{
		v = new int[10];
	}
	
	public void visualizza()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.print(v[i] + " ");
		}
		 System.out.println();
	}
	
	public void carica()
	{
		for(int i = 0; i < 10; i++)
		{
			v[i] = 0;
		}
		Random r = new Random();
		boolean flag;
		for(int i = 0; i < 10; i++)
		{
			do{
				flag = false;
				v[i] = r.nextInt(10)+1;
				for(int j = 0; j < i; j++)
				{
					if(v[i] == v[j])
					{
						flag = true;
					}
				}
			}while(flag==true);
		}	
	}
}
