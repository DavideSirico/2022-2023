/*Definisci in C++ la classe CorsodiStudi. Ogni corso di studi è composto più corsi (identificati con un nome, un numero di partecipanti e un costo) memorizzati all’interno della classe CorsodiStudi con tipi di dati elementari.
Definisci un costruttore con parametri che inizializzi un CorsodiStudi, facendo l’input dei dati. 

Un CorsodiStudi ha numElem corsi all’interno della classe. Per scelta, la variabile intera numElem è allocata tramite la malloc.

Scrivi il metodo float calcolaMediaPartecipanti. La funzione calcolaMediaPartecipanti stampa tutti i corsi con più di 20 partecipanti e calcola e restituisce la media di partecipanti, per i corsi con meno di 20 partecipanti.*/
#include <iostream>
using namespace std;

class CorsodiStudi{
    private:
        string *nome;
        int *numeroPartecipanti;
        float *costo;
        int *numElem;
    public:
        CorsodiStudi(int numElem){
            this->numElem=(int*)malloc(sizeof(int));
            this->numElem[0]=numElem;
            nome = new string[numElem];
            numeroPartecipanti=new int[numElem];
            costo = new float[numElem];
            for(int i=0;i<numElem;i++){
                cin>>nome[i]>>costo[i]>>numeroPartecipanti[i];
            }
        }
        float calcolaMediaPartecipanti(){
            float media = 0;
            float somma = 0;
            int c=0;
            for(int i=0;i<this->numElem[0];i++){
                if(numeroPartecipanti[i]>20){
                    cout<<nome[i]<<costo[i];
                } else {
                    somma+=numeroPartecipanti[i];
                    c++;
                }
            }
            media = somma / (float)c;
            return media;
        }
};

