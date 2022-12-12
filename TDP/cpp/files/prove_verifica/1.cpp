/*
Esercizio 1

Estrarre valori numerici da un file "Numeri.txt", sommare i pari e scrivere la somma dentro un file "Risultato.txt"
*/
#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    ifstream input("Numeri.txt", ios::in);
    ofstream output("Risultato.txt",ios::out);
    if(!input.is_open() || !output.is_open())
    {
        cout<<"Errore nell'apertura del file";
        return -1;
    }

    int somma = 0;
    int dummy;
    while(!input.eof())
    {
        input>>dummy;
        if(dummy%2==0)
        {
            somma+=dummy;
        }
    }

    output<<somma;

    output.close();
    input.close();
    return 0;
}