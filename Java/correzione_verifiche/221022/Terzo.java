class Terzo{
	public static void main(String[] args){
		int DIM = 10;
		int[][] matrice = new int[DIM][DIM];
		int i,j,c=1;
		for(i=0;i<DIM;i++){
			for(j=0;j<DIM;j++){
				matrice[j][i]=c;
				c++;
			}
		}
		for(i=0;i<DIM;i++){
			for(j=0;j<DIM;j++){
				System.out.format("%3d",matrice[i][j]);
			}
			System.out.println();
		}
	}
}
