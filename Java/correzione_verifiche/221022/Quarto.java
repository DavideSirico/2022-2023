class Quarto{
	public static void main(String[] args){
		//if(args.length()<=1){
		if(args.length<=1){
			System.out.println("inserisci almeno 2 numeri");
			System.exit(1);
		}
		try{
			//int DIM = args.length();
			int DIM = args.length;
			int[] array = new int[DIM];
			int i;
			int somma=0;
			for(i=0;i<DIM;i++){
				array[i]=Integer.valueOf(args[i]).intValue();
			}
			for(i=0;i<DIM;i++){
				somma=somma+array[i];
				System.out.print(array[i]+"\t");
			}
			System.out.println("\nsomma = "+somma);
		} catch(Exception e){
			System.out.println("Inserire solo numeri");
		}
	}
}


