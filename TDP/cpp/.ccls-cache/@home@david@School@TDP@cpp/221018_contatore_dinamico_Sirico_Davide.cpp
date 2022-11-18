
/*
 *1) Scrivi una classe CPP ContatoreV2, che allochi tramite la funzione malloc un array di numElem contatori. Scrivi l'opportuno costruttore che inizializzi la struttura dati.

Scrivi inoltre i metodi:

- incrementa(int c) // funzione che incrementa il c-simo contatore

- decrementa(int c) // funzione che decrementa il c-simo contatore

- stampa() // funzione che stampa lo stato dei contatori
 * */

#include <iostream>
#include <cstdlib>
using namespace std;

class ContatoreV2{
    private:
        int *contatori;
        int numElem;
    public:
        ContatoreV2(){
            contatori = NULL;
        }
        ContatoreV2(int numElem){
            this->numElem = numElem;
            contatori = (int*)malloc(numElem*sizeof(int));
            for(int i = 0; i < numElem; i++){
                contatori[i] = 0;
            }
        }
        void incrementa(int c){
            contatori[c]++;
        }
        void decrementa(int c){
            contatori[c]--;
        }
        void stampa(){
            for(int i = 0; i < this->numElem; i++){
                cout << "Contatore " << i << ": " << contatori[i] << endl;
            }

        }
};


int main(){
    ContatoreV2 contatore(5);
    contatore.incrementa(0);
    contatore.incrementa(0);
    contatore.incrementa(1);
    contatore.decrementa(2);
    contatore.incrementa(4);
    contatore.stampa();
    return 0;
}
