/*
Esercizio 1

Estrarre valori numerici da un file "Numeri.txt", sommare i pari e scrivere la somma dentro un file "Risultato.txt"




*/






#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    ifstream input;
    ofstream output;

    input.open("Numeri.txt", ios::in);
    output.open("Risultato.txt", ios::out);

    if(!input.is_open() || !output.is_open())
    {
        cout<<"Errore nell'apertura del file";
        return 1;
    }

    int somma = 0;
    while(!input.eof())
    {   
        int dummy;
        input>>dummy;
        if(dummy%2 == 0)
        {
            somma += dummy;
        }
    }

    output<<somma;


    input.close();
    output.close();
    return 0;
}