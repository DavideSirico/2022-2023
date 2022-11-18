import java.util.Random;

class MatriceSomma{
	public static void main(String[] args){
		Random random = new Random();
		if(args.length != 1 && args.length != 2){
			System.out.println("Usage: java MatriceSomma <num1> <num2>");
			System.exit(1);
		}
		try{
			int dim1=0,dim2=0;
			if(args.length == 1){
				dim1 = Integer.valueOf(args[0]).intValue();
				dim2 = dim1;

			} else if(args.length == 2){
				dim1 = Integer.valueOf(args[0]).intValue();
				dim2 = Integer.valueOf(args[1]).intValue();
			}
			int[][] matrice = new int[dim1][dim2];
			int i,j;

			for(i=0;i<matrice.length;i++){
				for(j=0;j<matrice[0].length;j++){
					matrice[i][j] = random.nextInt(100);
				}
			}

			for(i=0;i<matrice.length;i++){
				for(j=0;j<matrice[0].length;j++){
					System.out.print(matrice[i][j] + " ");
				}
				System.out.println();
			}

			int sommaRiga = 0;
			int sommaColonna = 0;
			int maxSommaRiga = 0;
			int maxSommaColonna = 0;
			int maxSommaColonnaIndex = 0;
			int maxSommaRigaIndex = 0;

			for(i=0;i<matrice.length;i++){
				for(j=0;j<matrice[0].length;j++){
					sommaRiga += matrice[i][j];
				}
				if(sommaRiga > maxSommaRiga){
					maxSommaRiga = sommaRiga;
					maxSommaRigaIndex = i;
				}
				sommaRiga = 0;
			}
			
			for(i=0;i<matrice[0].length;i++){
				for(j=0;j<matrice.length;j++){
					sommaColonna += matrice[j][i];
				}
				if(sommaColonna > maxSommaColonna){
					maxSommaColonna = sommaColonna;
					maxSommaColonnaIndex = i;
				}
				sommaColonna = 0;
			}
			if(maxSommaColonna > maxSommaRiga){
				System.out.println("La colonna " + maxSommaColonnaIndex + " ha la somma maggiore: " + maxSommaColonna);
			} else if(maxSommaColonna < maxSommaRiga){
				System.out.println("La riga " + maxSommaRigaIndex + " ha la somma maggiore: " + maxSommaRiga);
			}
		}catch(Exception e){
			System.out.println(e);
			System.exit(1);
		}
	}
}
