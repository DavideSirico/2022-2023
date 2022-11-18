/*
 *
 * Scrivi un programma che legga un file chiamato temperat.dat, Il programma deve calcolare la temperatura media delle citta e scrivere su un file di testo town.txt con i nomi delle citta' (una per riga) che hanno una temperatura media > 18 gradi. Utilizzare la struttura data: typedef struct {
char c[30]; 
float t; 
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

struct citta{
    char c[30];
    float t;
};


int main(){
    FILE *fp;
    fp = fopen("temp.dat","rb");
    struct citta buffer;
    while(fread(&buffer,sizeof(struct citta),1,fp)>0){
        printf("%s: %f",buffer.c,buffer.t);
    }

    return 0;
}
