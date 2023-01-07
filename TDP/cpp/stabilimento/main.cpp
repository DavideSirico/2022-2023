/*
 * La pista può ospitare 100 persone contemporaneamente al massimo.
 * Per pattinare si noleggiano delle scarpe pattini; lo stabilimento ne ha 6 per ogni taglia dal 24 al 44 e ogni persona può pattinare solo se è disponibile un paio di scarpe pattini della sua misura.
 * Accedono alla pista in contemporanea una o più persone in gruppo con il loro paio di scarpe, con una registrazione dell’ora e minuti di inizio accesso alla pista.
 // Esempio 
 // 3 persone con paio di scarpe 32,34,40 entrano alle 20.20
Se la pista non è in grado di ospitare tutte le persone o se le scarpe non sono disponibili le persone si mettono in coda di ingresso. (Ti consiglio un array circolare di oggetti per implementarlo).
Al termine dell’accesso della pista viene registrata l’ora di uscita ed è fatta pagare una tariffa di 10 centesimi al minuto per persona . La tariffa è scontata del 25% se le persone erano almeno in gruppo di tre persone. La tariffa viene calcolata sul gruppo di persone. 
Ogni 10 noleggi ogni paio di scarpe viene messo in manutenzione per 15 minuti per essere affilato. Ogni manutenzione costa 2 euro.
La manutenzione della pista costa 20 cent al minuto.
Scrivi un programma C++ che implementi tutte le classi necessarie per la gestione degli ingressi e delle uscite.
Il programma oltre a questo calcola e stampa il totale dei costi e degli introiti della pista, con opportune funzioni che forniscano l’output.
Il programma stampa anche quante persone sono nella pista e quali paia di scarpe sono occupate e quali disponibili.

Per ogni secondo reale, corrispondono a 15 secondi nel tempo della realtà della pista.
Scrivi le funzioni / istruzioni casuali per generare le varie coppie di persone che vogliono accedere alla pista, con le loro misure di scarpe. Fatto questo, falle entrare o mettile in coda se non possono entrare.
Periodicamente simula anche il loro rientro dalla pista, per ipotesi ogni accesso in pista dura almeno 5 minuti e non più di 35.

// Documenta il pgm con il diagramma delle classi, e con un txt di spiegazioni che ti/ci aiuti a capire le tue scelte progettuali.
*/

//TODOs
/* 
    * 1) Gestire il guadagno e il costo
    * 2) Manutenzione dei pattini
    * 3) Gestire le persone in coda
    * 4) Gestire il tempo
*/
#include "bits/stdc++.h"
#include <unistd.h>
using namespace std;
#define PERSONE_MAX 100
#define TAGLIA_PATTINI_MAX 44
#define TAGLIA_PATTINI_MIN 24
#define NUMERO_PATTINI_PER_TAGLIA 6
#define NUMERO_PATTINI (TAGLIA_PATTINI_MAX-TAGLIA_PATTINI_MIN+1)*NUMERO_PATTINI_PER_TAGLIA
#define TARIFFA 0.1
#define SCONTO 0.25
#define PERSONE_PER_SCONTO 3
#define TEMPO_INCREMENTO 15
#define COSTO_MANUTENZIONE 2

class Ora
{
    private:
        int hh;
        int mm;
    public:
        Ora()
        {
            hh = 0;
            mm = 0;
        }
        Ora(int hh, int mm)
        {
            this->hh = hh;
            this->mm = mm;
            check();
        }
        void check()
        {

            hh += mm/60;
            mm = mm%60;
        }
        int getHh()
        {
            return hh;
        }
        int getMm()
        {
            return mm;
        }
        void setHh(int hh)
        {
            this->hh = hh;
        }
        void setMm(int mm)
        {
            this->mm = mm;
        }
        void add(int hh, int mm)
        {
            this->hh += hh;
            this->mm += mm;
            check();
        }
        void add(int mm)
        {
            this->mm += mm;
            check();
        }
        friend ostream& operator<<(ostream& os, const Ora& o);
};
ostream& operator<<(ostream& os, const Ora& o)
{
    char dummy[6];
    sprintf(dummy,"%02d:%02d",o.hh,o.mm);
    os<<dummy<<endl;
    return os;
}

class Pattini
{
    private:
        int taglia;
        bool disponibile;
        int numeroNoleggi;
    public:
        Pattini(int taglia)
        {
            this->taglia = taglia;
            this->disponibile = true;
            numeroNoleggi = NUMERO_PATTINI_PER_TAGLIA;
        }
        int getTaglia()
        {
            return taglia;
        }
        int getNumeroNoleggi()
        {
            return numeroNoleggi;
        }
        bool checkNoleggio()
        {
            if(numeroNoleggi > 0 && disponibile)
                return true;
            else
                return false;
        }
        void noleggio()
        {
            if(checkNoleggio())
            {
                numeroNoleggi--;
            }
        }
        void manutenzione(){};
};

class Pista
{
    private:
        Ora orario_attuale;
        vector<Gruppo> gruppi;
    public:
        Pista()
        {
            orario_attuale = Ora();
        }
        //TODO
        int getNumeroPersone();
        //TODO
        void setNumeroPersone(int numeroPersone);
        Ora getOrarioAttuale()
        {
            return orario_attuale;
        }
        void setOrarioAttuale(Ora orario_attuale)
        {
            this->orario_attuale = orario_attuale;
        }
        void addGruppo(Gruppo g)
        {
            gruppi.push_back(g);
        }
        void removeGruppo()
        {
            gruppi.erase(gruppi.begin());
        }
        void incrementaTempo()
        {
            orario_attuale.add(TEMPO_INCREMENTO);
        }
};

class Persona
{
    private:
        int taglia;
        bool inPista;
        Ora orario_entrata;
        Ora orario_uscita;
    public:
        Persona(int taglia)
        {
            this->taglia = taglia;
            inPista = false;
            orario_entrata = Ora();
            orario_uscita = Ora();
        }
        Persona(int taglia, bool inPista, Ora orario_entrata, Ora orario_uscita)
        {
            this->taglia = taglia;
            this->inPista = inPista;
            this->orario_entrata = orario_entrata;
            this->orario_uscita = orario_uscita;
        }
        int getTaglia()
        {
            return taglia;
        }
        bool getInPista()
        {
            return inPista;
        }
        void setInPista(bool inPista)
        {
            this->inPista = inPista;
        }
        Ora getOrarioEntrata()
        {
            return orario_entrata;
        }
        void setOrarioEntrata(Ora orario_entrata)
        {
            this->orario_entrata = orario_entrata;
        }
        Ora getOrarioUscita()
        {
            return orario_uscita;
        }
        void setOrarioUscita(Ora orario_uscita)
        {
            this->orario_uscita = orario_uscita;
        }
        bool checkPattini(vector<Pattini> pattini)
        {
            for(int j = 0; j < pattini.size(); j++)
            {
                if(pattini[j].getTaglia() == taglia && pattini[j].checkNoleggio())
                {
                    pattini[j].noleggio();
                    return true;
                }
            }
            return false;
        }
};

class Gruppo
{
    private:
        vector<Persona> persone;
        int numeroPersone;
        Ora orario_entrata;
        Ora Orario_uscita;
        bool inPista;
    public:
        Gruppo(int numeroPersone, Ora orario_entrata, Ora orario_uscita)
        {
            this->numeroPersone = numeroPersone;
            this->orario_entrata = orario_entrata;
            this->Orario_uscita = orario_uscita;
            for(int i = 0; i < numeroPersone; i++)
            {
                int taglia = rand() % (TAGLIA_PATTINI_MAX-TAGLIA_PATTINI_MIN+1) + TAGLIA_PATTINI_MIN;
                Persona persona = Persona(taglia);
                persone.push_back(persona);
            }
            this->inPista = false;
        }
        bool checkPattini(vector<Pattini> pattini)
        {
            vector<Pattini> temp = pattini;
            for(int i = 0; i < numeroPersone; i++)
            {
                if(persone[i].checkPattini(temp) == false)
                    return false;
            }
            pattini = temp;
            return true;
        }
        void setInPista(bool inPista)
        {
            this->inPista = inPista;
        }
        bool getInPista()
        {
            return inPista;
        }
        int getNumeroPersone()
        {
            return numeroPersone;
        }


        friend ostream& operator<<(ostream& out, Gruppo& gruppo);
};
ostream& operator<<(ostream& out, Gruppo& gruppo)
{
    out<<"Numero persone="<<gruppo.numeroPersone<<endl;
    out<<"Orario entrata="<<gruppo.orario_entrata.getHh()<<":"<<gruppo.orario_entrata.getMm()<<endl;
    out<<"Orario uscita="<<gruppo.Orario_uscita.getHh()<<":"<<gruppo.Orario_uscita.getMm()<<endl;
    out<<"In pista="<<gruppo.getInPista()<<endl;
    for(int i = 0; i < gruppo.numeroPersone; i++)
    {
        out<<"Persona "<<i<<endl;
        out<<"Id="<<gruppo.persone[i].getId()<<endl;
        out<<"Taglia="<<gruppo.persone[i].getTaglia()<<endl;
    }
    return out;
}


int main()
{
    srand(time(NULL));

    Pista pista = Pista();
    Ora ora = Ora();

    int id = 0;

    vector<Gruppo> coda;
    vector<Pattini> pattini;


    for(int i = 0; i < TAGLIA_PATTINI_MAX-TAGLIA_PATTINI_MIN+1; i++)
    {
        pattini.push_back(Pattini(i+TAGLIA_PATTINI_MIN));
    }

    int numeroPersone;
    
    while(1)
    {
        // Visualizzo l'orario attuale
        cout<<"Orario attuale="<<ora<<endl;
        // Numero di persone che vogliono accedere alla pista
        numeroPersone = rand()%8+1;
        
        Ora orario_uscita_random = Ora(ora.getHh(),ora.getMm()+(rand()%31+5));

        // Creazione del gruppo di persone che vogliono accedere alla pista
        Gruppo gruppo = Gruppo(numeroPersone,ora,orario_uscita_random);

        // Visualizzo il gruppo
        cout<<"Gruppo:"<<gruppo<<endl;
        
        coda.push_back(gruppo);
        

        // Controllo se il gruppo può accedere alla pista
        if(!gruppo.checkPattini(pattini) || pista.getNumeroPersone()+gruppo.getNumeroPersone() > PERSONE_MAX)
        {
            cout<<"Non ci sono abbastanza pattini/non c'è posto in pista per il gruppo"<<endl;
        }


        cout<<endl<<endl;
        // Incremento dell'orario attuale
        ora.add(TEMPO_INCREMENTO);
        sleep(1);
    }
    return 0;
}
