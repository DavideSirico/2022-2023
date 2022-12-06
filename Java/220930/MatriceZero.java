// 2) Matrice quadrata 10x10 (caricamento random 1-1000); visualizzare, azzerrare la riga che contiene l'elemento minimo (0) e visualizzarare di nuovo
import java.util.Random;

public class MatriceZero{
	public static void main(String[] args){
		Random random = new Random();
		int matrice[][];
		matrice = new int[10][10];
		int i,j;
		int numeroMinimo;
		int rigaNumeroMinimo;
		for(i=0;i<matrice.length;i++){
			for(j=0;j<matrice.length;j++){
				matrice[i][j]=random.nextInt(1000)+1;
			}
		}
		// Migliorare la formatazione
		for(i=0;i<matrice.length;i++){
			for(j=0;j<matrice.length;j++){
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}

		numeroMinimo=matrice[0][0];
		rigaNumeroMinimo=0;
		for(i=0;i<matrice.length;i++){
			for(j=0;j<matrice.length;j++){
				if(matrice[i][j]<numeroMinimo){
					numeroMinimo=matrice[i][j];
					rigaNumeroMinimo=i;
				}
			}
		}

		for(i=0;i<matrice.length;i++){
			matrice[rigaNumeroMinimo][i]=0;
		}

		System.out.println();

		for(i=0;i<matrice.length;i++){
			for(j=0;j<matrice.length;j++){
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}

	}
}
