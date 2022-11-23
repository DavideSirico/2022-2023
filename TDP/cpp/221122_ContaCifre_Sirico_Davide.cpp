/*es16  Scrivi una classe C++ ContaLettere che, letto un testo da file di testo, allocato dinamicamente memorizzi nel programma in tanti oggetti ContaLettere quante sono le lettere alfabetiche presenti, contando quante sono le lettere del testo.  NON deve essere memorizzato alcun oggetto quando non è presente nessuna lettera nel testo. Per ipotesi tutte le lettere del testo sono minuscole e non ci sono numeri. Nell’oggetto deve essere memorizzata la lettera e una variabile contatore.
Esempio: arca darca
Memorizza i seguenti oggetti :
‘a’:4 ; ‘r’:2 ; c:’2’ ; d:’1’*/
#include <iostream>
#include <fstream>
using namespace std;

class ContaLettere
{
    public:
    int contatore;
    char carattere;
    ContaLettere(){}
    ContaLettere(int cont, char c)
    {
        contatore = cont;
        carattere = c;
    }
};

int main(void)
{
    ifstream in("input.txt");
    char dummy;
    if(!in.is_open())
    {
        cout<<"Errore nell'apertura del file"<<endl;
        return 1;
    }

    char lettere[26];
    int temp = 0;
    int contatore = 0;
    while(in>>dummy)
    {
        temp = 0;
        for(int i = 0; i < contatore; i++)
        {
            if(dummy == lettere[i])
            {
                temp++;
            }
        }
        if(temp == 0)
        {
            lettere[contatore] = dummy;
            contatore++;
        }
    }
    for(int i = 0; i < contatore; i++)
    {
        cout<<lettere[i]<<endl;
    }
    in.close();
    in.open("input.txt");
    ContaLettere *conta = new ContaLettere[contatore];

    for(int i = 0; i < contatore; i++)
    {
        conta[i].carattere = lettere[i];
        conta[i].contatore = 0;
    }

    while(in>>dummy)
    {
        for(int i = 0; i < contatore; i++)
        {
            if(dummy == conta[i].carattere)
            {
                conta[i].contatore++;
            }
        }
    }

    for(int i = 0; i < contatore; i++)
    {
        cout<<conta[i].carattere<<":"<<conta[i].contatore<<endl;
    }
    in.close();
    return 0;
}