#ifndef lib__h
#define lib__h
#endif

#include <stdio.h>
#include <string.h>
#define NUM_ELEM 10
struct prodotto{
	char nome[50];
	int quantitaTot;
	int quantitaRes;
	float prezzo;
} Prodotto[NUM_ELEM];

int current_i=0;

void inserisci(char *nome, int quantitaTot, int quantitaRes, float prezzo){
	strcpy(Prodotto[current_i].nome,nome);
	Prodotto[current_i].quantitaTot=quantitaTot;
	Prodotto[current_i].quantitaRes=quantitaRes;
	Prodotto[current_i].prezzo=prezzo;
	current_i++;
}	

int ricerca(struct prodotto Prodotto2){
	for(int i=0;i<NUM_ELEM;i++){
		if(strcmp(Prodotto[i].nome,Prodotto2.nome)==0 && Prodotto[i].quantitaTot==Prodotto2.quantitaTot && Prodotto[i].quantitaRes==Prodotto2.quantitaRes && Prodotto[i].prezzo==Prodotto2.prezzo){
			return i;
		}
	}
	return -1;
}

float calcolaPrezzoTotale(){
	float somma;
	for(int i=0;i<NUM_ELEM;i++){
		somma+=Prodotto[i].prezzo;
	}
	return somma;
}

float calcolaMediaQuantita(){
	return (calcolaPrezzoTotale()/(float)CURRENT_I);
}

void stampaEsauriti(){
	for(int i=0;i<NUM_ELEM;i++){
		if(Prodotto[i].quantitaRes==0){
			stampaProdotto(i);
		}
	}
}

void stampaProdotto(int n){
	printf("Nome: %s\n",Prodotto[n].nome);
	printf("Quantita Totale: %d\n",Prodotto[n].quantitaTot);
	printf("Quantita Residua: %d\n",Prodotto[n].quantitaRes);
	printf("Prezzo: %f\n",Prodotto[n].prezzo);
}
