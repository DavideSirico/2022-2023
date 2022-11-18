/*
 * Scrivi un programma che legga un file chiamato temperat.dat, Il programma deve calcolare la temperatura media delle citta e scrivere su un file di testo town.txt con i nomi delle citta' (una per riga) che hanno una temperatura media > 18 gradi. Utilizzare la struttura data: typedef struct {
char c[30]; nome citta’
float t; temperature media della citta’
} str;
Esempio di temperat.dat
Trieste 21.1
Udine 17.5
Gorizia 20.3
Monfalcone 19
Pordenone 17.4
Maniago 18.6
Alla fine calcolare la citta' piu' fredda e piu' calda.
*/
#include <stdio.h>
#include <stdlib.h>
#define DIM 6

typedef struct{
	char c[30];
	float t;
} town;

int main(){
	FILE *input,*output;
	input=fopen("temperat.dat","rb");
	output=fopen("town.txt","w");
	
	town citta[DIM];
	float min,max,somma,media;
	if(input==NULL || output==NULL){
		printf("Errore nell'apertura del file");
		exit(1);
	}
	int i=0;
	while((fread(&citta[i],sizeof(town),1,input))){
		printf("Nome citta': %s\n",citta[i].c);
		printf("Temperatura: %f\n\n",citta[i].t);
		i++;
	}
	
	min=citta[0].t;
	max=citta[0].t;
	somma=citta[0].t;
	for(i=1;i<DIM;i++){
		somma+=citta[i].t;
		if(min>citta[i].t){
			min=citta[i].t;
		}
		if(max<citta[i].t){
			max=citta[i].t;
		}
	}
	
	media=somma/(float)DIM;
	
	fprintf(output,"Media delle temperature: %f\n",media);
	for(i=0;i<DIM;i++){
		if(citta[i].t>18){
			fprintf(output,"%s\n",citta[i].c);
		}
	}

	fclose(input);
	fclose(output);

	return 0;
 }
