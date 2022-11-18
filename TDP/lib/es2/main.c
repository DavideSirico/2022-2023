#include <stdio.h>
#include "lib.h"


int main(){
	inserisci("Banane",10,5,6.5);
	inserisci("Cetrioli",50,4,1);
	
	printf("Media: %f\n",calcolaMediaQuantita());

	stampaProdotto(1);
	
	return 0;
}
