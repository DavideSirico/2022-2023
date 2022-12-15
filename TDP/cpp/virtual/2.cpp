// il compilatore(linker) esegue il binding statico
// |--> va a cercare la funzione giusta che deve esere eseguita
// |--> puntatotori, virtual, diversi tipi di parametri

#include <iostream>
using namespace std;

class Genitore 
{
    public:
        void print()
        {
            cout<<"Genitore"<<endl;
        }
};

class Figlio : public Genitore
{
    public:
        void print()
        {
            cout<<"Figlio"<<endl;
        }
};


int main()
{
    Figlio istanza;
    // poliformismo
    Genitore& reference = istanza;
    reference.print();
    
    //poliformismo
    Genitore* puntatotore 

    return 0;
}
