#include <stdio.h>
#include <stdlib.h>

struct registra{
	int stazione;
	int scesi;
	int saliti;
};

int main(){
	FILE *fp;
	fp=fopen("metrodata.dat","wb");
	if(fp==NULL){
		printf("Errore nell'apertura del file");
		exit(1);
	}
	struct registra Registra;
	Registra.stazione=101;
	Registra.scesi=20;
	Registra.saliti=80;
	
	fwrite(&Registra,sizeof(struct registra),1,fp);

	fclose(fp);
	return 0;
}
