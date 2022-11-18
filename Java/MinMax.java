public class MinMax{
	public static void main(String[] args){
		int i;
		int minimo, massimo;
		int posizioneMinimo, posizioneMassimo;
		int vettore[] = {3,1,3,4,8,54,7,8}; // int vettore = new int[8];
		// Visualizzazione del vettore
		for(i=0;i<vettore.length;i++){
			System.out.print(vettore[i]+" ");
		}
		System.out.println();

		minimo=vettore[0];
		massimo=vettore[0];
		posizioneMinimo=0;
		posizioneMassimo=0;
		// trovo la posizione del valore più piccolo e del valore più grande
		for(i=1;i<vettore.length;i++){
			if(minimo>vettore[i]){
				minimo=vettore[i];
				posizioneMinimo=i;
			}
			if(massimo<vettore[i]){
				massimo=vettore[i];
				posizioneMassimo=i;
			}
		}
		// Scambio i due valori
		vettore[posizioneMinimo]=massimo;
		vettore[posizioneMassimo]=minimo;
		// Visualizzo il vettore
		for(i=0;i<vettore.length;i++){
			System.out.print(vettore[i]+" ");
		}
	}
}
