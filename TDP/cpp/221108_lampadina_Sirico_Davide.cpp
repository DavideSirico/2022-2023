/*1) Scrivere la classe Lampadina i cui oggetti rappresentano delle lampadine elettriche. Una lampadina può essere accesa, spenta o rotta, e mette a disposizione due sole operazioni: 

- stato() che restituisce lo stato corrente della lampadina 

- click() che ne cambia lo stato da accesa a spenta o da spenta a accesa o la rompe. 

Una lampadina si rompe dopo un certo numero di click definito dal fabbricante. 

La classe deve contenere:

• Una variabile descriva lo stato della lampadina

• Un costruttore

• I metodi stato e click

Scrivere un programma che crea un oggetto della classe Lampadina che chieda un numero massimo di click deciso dall’utente e poi offre all’utente la possibilità di accendere o spegnere la lampadina (visualizzando l’esito dell’operazione) o di terminare l’esecuzione. Se l’esecuzione raggiunge il massimo dei click decisi all’inizio la lampadina si rompe.*/


#include <iostream>

using namespace std;

class Lampadina{
    private:
        int current_stato; // 0 spenta - 1 accesa - -1 rotta
        int max_click;
        int current_click;
    public:
        Lampadina(const int max_click){
           current_stato = 0;
           current_click = 0;
           this->max_click = max_click;
        }
        Lampadina(const Lampadina& lampadina){
            this->current_stato = lampadina.current_stato;
            this->current_click = lampadina.current_click;
            this->max_click = lampadina.max_click;
        }
        int stato(){
            return current_stato;
        }
        void click(){
            current_click++;
            if(current_click>=max_click){
                current_stato=-1;
            } else {
               if(current_stato==0){
                    current_stato=1;
                } else {
                    current_stato=0;
                }   
            }
        }
};;

int main(){
    cout<<"Numero massimo: ";
    int n;
    cin>>n;
    Lampadina lampadina(n);
    char scelta;
    while(1){
        cout<<"Vuoi cliccare? (y/n)";
        cin>>scelta;
        if(scelta=='y'){
            lampadina.click();
        }
        if(lampadina.stato()==0){
            cout<<"Spenta\n";
        }
        if(lampadina.stato()==1){
            cout<<"Accesa\n";
        }
        if(lampadina.stato()==-1){
            cout<<"Rotta\n";
            return 0;
        }
    }
    return 0;
}
