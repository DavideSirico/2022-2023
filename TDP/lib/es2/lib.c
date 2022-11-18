#include <stdio.h>

/*2)Scrivi un programma C che gestisca una struttura avente un nome di un prodotto, una quantità venduta, una quantità residua e il prezzo unitario. Il programma deve prevedere un array di prodotti dove all’interno dovremo andare a scrivere i seguenti metodi;
I dati sono salvati in un array con NUM_ELEM elementi:
*/

struct prodotto{
	char nome[50];
	int quantitaTot;
	int quantitaRes;
	float prezzo;
}

// funzione che inserisce un Elemento all’interno dell’array di Elementi
void inserisci(char *nome, int quantitaTot, int quantitaRes, float prezzo, struct prodotto *listaprodotti){
	strcpy(listaprodotti.nome,nome);
	listaprodotti.quantitaTot=quantitaTot;
	listaprodotti.quantitaRes=quantitaRes;
	listaprodotti.prezzo=prezzo;
}

// funzione booleana che restituisce true se l’articolo passato come parametro è contenuto all’interno della struttura 
int ricerca(struct prodotto, struct prodotto *listaprodotti){
	
}

// funzione che calcola il costo totale di tutti gli articoli, 
float calcolaPrezzoTotale(struct prodotto *listaprodotti)

// funzione che calcola la giacenza media dei prodotti 
float calcolaMediaQuantità(struct prodotto *listaprodotti)

// funzione che restituisce e stampa i prodotti esauriti 
void stampaEsauriti(struct prodotto *listaprodotti)

// funzione che stampa un prodotto
void stampaProdotto(struct prodotto p)
