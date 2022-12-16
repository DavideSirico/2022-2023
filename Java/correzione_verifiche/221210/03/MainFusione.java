public class MainFusione
{
	public static void main(String[] args)
	{
		// int[] v1 = {3,5,7,7,7,11,11,11,11};
		// int[] v2 = {6,7,7,8,9,11};
		int[] v1 = {3,3,3,3,3};
		int[] v2 = {3,3,3};
		// int[] v1 = {1,3,5,7,9};
		// int[] v2 = {2,11,18};
		
		
		Fusione f = new Fusione(v1,v2);
		f.visualizzaV1();
		f.visualizzaV2();
		f.merge();
		f.visualizzaV3();
	}
}
