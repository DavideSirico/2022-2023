/*
 * Il file binario metrodata.dat ha un record avente la seguente struttura:
 * struct registra {

    int stazione;

    int scesi;

    int saliti;

}

e contiene un record per ogni stazione – identificata da un codice numerico – del percorso di una linea metropolitana. Scrivere un programma che legga il contenuto di metrodata.dat e produca un file di tipo .txt (metrodata.txt) la cui singola riga abbia un formato #101,20+,80- e determinare il numero di persone che sono presenti sulla metro all’ultima stazione.
*/
#include <stdio.h>
#include <stdlib.h>

struct registra {
	int stazione;
	int scesi;
	int saliti;
};

int main(){
	FILE *input,*output;
	input=fopen("metrodata.dat","rb");
	output=fopen("metrodata.txt","wt");
	if(input==NULL || output==NULL){
		printf("Errore nell'apertura del file");
		exit(1);
	}

	int persone=0;

	struct registra Registra;
	while(fread(&Registra,sizeof(struct registra),1,input)>0){
		persone=persone+(Registra.saliti-Registra.scesi);
		fprintf(output,"#%d,%d+,%d-\n",Registra.stazione,Registra.scesi,Registra.saliti);
	}
	printf("Persone all'ultima stazione sono: %d",persone);
	fclose(intput);
	fclose(output);
	return 0;
}
