/*
La pista può ospitare 100 persone contemporaneamente al massimo.
Per pattinare si noleggiano delle scarpe pattini; lo stabilimento ne ha 6 per ogni taglia dal 24 al 44 e ogni persona può pattinare solo se è disponibile un paio di scarpe pattini della sua misura.
Accedono alla pista in contemporanea una o più persone in gruppo con il loro paio di scarpe, con una registrazione dell’ora e minuti di inizio accesso alla pista.
Esempio 
3 persone con paio di scarpe 32,34,40 entrano alle 20.20
Se la pista non è in grado di ospitare tutte le persone o se le scarpe non sono disponibili le persone si mettono in coda di ingresso. (Ti consiglio un array circolare di oggetti per implementarlo).
Al termine dell’accesso della pista viene registrata l’ora di uscita ed è fatta pagare una tariffa di 10 centesimi al minuto per persona . La tariffa è scontata del 25% se le persone erano almeno in gruppo di tre persone. La tariffa viene calcolata sul gruppo di persone. 
Ogni 10 noleggi ogni paio di scarpe viene messo in manutenzione per 15 minuti per essere affilato. Ogni manutenzione costa 2 euro.
La manutenzione della pista costa 20 cent al minuto.
Scrivi un programma C++ che implementi tutte le classi necessarie per la gestione degli ingressi e delle uscite.
Il programma oltre a questo calcola e stampa il totale dei costi e degli introiti della pista, con opportune funzioni che forniscano l’output.
Il programma stampa anche quante persone sono nella pista e quali paia di scarpe sono occupate e quali disponibili.

Anche se è possibile fare il data entry dei dati, vorrei che questo programma fosse simulato in tempo quasi reale.
Per ogni secondo reale, corrispondono a 15 secondi nel tempo della realtà della pista.
Scrivi le funzioni / istruzioni casuali per generare le varie coppie di persone che vogliono accedere alla pista, con le loro misure di scarpe. Fatto questo, falle entrare o mettile in coda se non possono entrare.
Periodicamente simula anche il loro rientro dalla pista, per ipotesi ogni accesso in pista dura almeno 5 minuti e non più di 35.
*/
#include "bits/stdc++.h"
using namespace std;

class Ora
{
    private:
        int hh;
        int mm;
        int ss;
    public:
        Ora()
        {
            hh = 0;
            mm = 0;
            ss = 0;
        }
        Ora(int hh, int mm, int ss)
        {
            this->hh = hh;
            this->mm = mm;
            this->ss = ss;
            check();
        }
        void check()
        {

            hh += mm/60;
            mm = mm%60;
            mm += ss/60;
            ss = ss%60;
        }
};
class Pattini
{
    private:
        int rimasti;
        int misura;
        bool disponibile;
    public:
        Pattini();
        Pattini(int misura, int rimasti)
        {
            this->misura = misura;
            this->rimasti = rimasti;
            if(rimasti>0)
            {
                disponibile = true;
            } else {
                disponibile = false;
            }
        }
};

class Pista
{
    private:
        int persone;
        int tempo;
    public:
        Pista()
        {
            persone = 100;
            tempo = 0;
        }
};

class Persona
{
    private:
        int misura;
        int tempo;
    public:
        Persona();
        Persona(int misura, int tempo)
        {
            this->misura = misura;
            this->tempo = tempo;
        }
};

int main()
{
    Pista pista = Pista();
    srand(time(NULL));
    vector<Persona> gruppo;
    vector<Pattini> pattini(21);
    for(int i = 0; i < 21; i++)
    {
        pattini[i] = Pattini(i+24,5);
    }
    Ora ora = Ora();
    int numeroPersone;
    while(1)
    {
        numeroPersone = rand()%8+1;
        cout<<"Numero di persone="<<numeroPersone<<endl;
        for(int i = 0; i < numeroPersone; i++)
        {
            int randomMisura;
            Persona persona = Persona(randomMisura,);
            gruppo.push_back(persona);
        }
        sleep(1);
    }
    return 0;
}
