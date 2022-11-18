/*
 * 2) Definire una classe Orario i cui oggetti possano essere inizializzati come: o(14,25,35); implementare il costruttore, il metodo scrivi() per la stampa a video, il metodo modifica (hh,mm,ss) per consentirne la modifica e un metodo valida() per consentire la validazione dell’orario.
 * */
#include <iostream>
using namespace std;

class Orario{
    private:
        int hh,mm,ss;
    public:
        Orario(){
            this->hh = 0;
            this->mm = 0;
            this->ss = 0;
        }
        Orario(int hh, int mm, int ss){
            this->hh = hh;
            this->mm = mm;
            this->ss = ss;
        }
        void scrivi(){
            cout << this->hh << ":" << this->mm << ":" << this->ss << endl;
        }
        void modifica(){
            cout << "Inserisci l'orario da modificare: ";
            cin >> this->hh >> this->mm >> this->ss;
        }
        int valida(){
            if(this->hh <= 23 && this->hh >= 0){
                return 0;
            }
            if(this->mm <= 59 && this->mm >= 0){
                return 0;
            }
            if(this->ss <= 59 && this->ss >= 0){
                return 0;
            }
            return 1;
        }

};

int main(){
    Orario o(14,25,35);
    if(o.valida()==0){
        o.scrivi();
        
    } else {
        cout<<"Orario non valido"<<endl;
    }
     

    return 0;
}
