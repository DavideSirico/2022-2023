/*
 * La pista può ospitare 100 persone contemporaneamente al massimo.
 * Per pattinare si noleggiano delle scarpe pattini; lo stabilimento ne ha 6 per ogni taglia dal 24 al 44 e ogni persona può pattinare solo se è disponibile un paio di scarpe pattini della sua misura.
 * Accedono alla pista in contemporanea una o più persone in gruppo con il loro paio di scarpe, con una registrazione dell’ora e minuti di inizio accesso alla pista.
 // Esempio 
 // 3 persone con paio di scarpe 32,34,40 entrano alle 20.20
Se la pista non è in grado di ospitare tutte le persone o se le scarpe non sono disponibili le persone si mettono in coda di ingresso. (Ti consiglio un array circolare di oggetti per implementarlo).
Al termine dell’accesso della pista viene registrata l’ora di uscita ed è fatta pagare una tariffa di 10 centesimi al minuto per persona . La tariffa è scontata del 25% se le persone erano almeno in gruppo di tre persone. La tariffa viene calcolata sul gruppo di persone. 
Ogni 10 noleggi ogni paio di scarpe viene messo in manutenzione per 15 minuti per essere affilato. Ogni manutenzione costa 2 euro.
Scrivi un programma C++ che implementi tutte le classi necessarie per la gestione degli ingressi e delle uscite.
Il programma oltre a questo calcola e stampa il totale dei costi e degli introiti della pista, con opportune funzioni che forniscano l’output.
Il programma stampa anche quante persone sono nella pista e quali paia di scarpe sono occupate e quali disponibili.

Per ogni secondo reale, corrispondono a 15 secondi nel tempo della realtà della pista.
Scrivi le funzioni / istruzioni casuali per generare le varie coppie di persone che vogliono accedere alla pista, con le loro misure di scarpe. Fatto questo, falle entrare o mettile in coda se non possono entrare.
Periodicamente simula anche il loro rientro dalla pista, per ipotesi ogni accesso in pista dura almeno 5 minuti e non più di 35.

// Documenta il pgm con il diagramma delle classi, e con un txt di spiegazioni che ti/ci aiuti a capire le tue scelte progettuali.
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
#define MIN_PERSONE_SCONTO 3
#define TEMPO_INCREMENTO 15
#define COSTO_MANUTENZIONE 2
#define MAX_PERSONE_PER_GRUPPO 8

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
            if(ss >= 60)
            {
                mm += ss/60;
                ss %= 60;
            }
            if(mm >= 60)
            {
                hh += mm/60;
                mm %= 60;
            }
            if(hh >= 24)
                hh %= 24;
        }
        int getMinuti()
        {
            return hh*60+mm;
        }
        void add(int ss)
        {
            this->ss += ss;
            check();
        }
        bool operator==(const Ora& o)
        {
            if(this->hh == o.hh && this->mm == o.mm && this->ss == o.ss)
                return true;
            return false;
        }
        bool operator<=(const Ora& o)
        {
            if(this->hh < o.hh)
                return true;
            else if(this->hh == o.hh && this->mm < o.mm)
                return true;
            else if(this->hh == o.hh && this->mm == o.mm && this->ss <= o.ss)
                return true;
            return false;
        }
        Ora operator+(const Ora& o)
        {
            Ora temp;
            temp.hh = this->hh + o.hh;
            temp.mm = this->mm + o.mm;
            temp.ss = this->ss + o.ss;
            temp.check();
            return temp;
        }
        Ora operator-(const Ora& o)
        {
            Ora temp;
            temp.hh = this->hh - o.hh;
            temp.mm = this->mm - o.mm;
            temp.ss = this->ss - o.ss;
            temp.check();
            return temp;
        }
        friend ostream& operator<<(ostream& os, const Ora& o);
};
ostream& operator<<(ostream& os, const Ora& o)
{
    char dummy[9];
    sprintf(dummy,"%02d:%02d:%02d",o.hh,o.mm,o.ss);
    os<<dummy<<endl;
    return os;
}

class Pattini
{
    private:
        int taglia;
        bool disponibile;
        bool manutenzione;
        int utilizzi;
        Ora orarioManutenzione;
    public:
        Pattini(int taglia)
        {
            this->taglia = taglia;
            this->disponibile = true;
            this->manutenzione = false;
            this->utilizzi = 0;
        }
        int getTaglia()
        {
            return taglia;
        }
        int getUtilizzi()
        {
            return utilizzi;
        }
        Ora getOrarioFineManutenzione()
        {
            return orarioManutenzione;
        }
        bool isDisponibile()
        {
            return disponibile;
        }
        bool isManutenzione()
        {
            return manutenzione;
        }
        bool checkNoleggio()
        {
            if(disponibile && !manutenzione)
                return true;
            else 
                return false;
        }
        void noleggio()
        {
            disponibile = true;
            utilizzi++;
        }
        void inizioManutenzione(Ora ora)
        {
            manutenzione = false;
            orarioManutenzione = ora + Ora(0,0,15);
        }
        void fineManutenzione()
        {
            manutenzione = false;
            orarioManutenzione = Ora(0,0,0);
        }
};
class Persona
{
    private:
        int taglia;
        Ora orario_entrata;
        Ora orario_uscita;
    public:
        Persona(int taglia)
        {
            this->taglia = taglia;
            orario_entrata = Ora();
            orario_uscita = Ora();
        }
        Persona(int taglia, Ora orario_entrata, Ora orario_uscita)
        {
            this->taglia = taglia;
            this->orario_entrata = orario_entrata;
            this->orario_uscita = orario_uscita;
        }
        int getTaglia()
        {
            return taglia;
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
        bool checkPattini(vector<vector<Pattini>> pattini)
        {
            for(int i = 0; i < NUMERO_PATTINI_PER_TAGLIA; i++)
            {
                if(pattini[taglia-TAGLIA_PATTINI_MIN][i].checkNoleggio())
                {
                    return true;
                }
            }
            return false;
        }
        vector<vector<Pattini>> noleggia(vector<vector<Pattini>> pattini)
        {
            for(int i = 0; i < NUMERO_PATTINI_PER_TAGLIA; i++)
            {
                if(pattini[taglia-TAGLIA_PATTINI_MIN][i].checkNoleggio())
                {
                    pattini[taglia-TAGLIA_PATTINI_MIN][i].noleggio();
                    break;
                }
            }
            return pattini;
        }
};
class Gruppo
{
    private:
        vector<Persona> persone;
        int numeroPersone;
        Ora orario_entrata;
        Ora Orario_uscita;
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
        }
        bool checkPattini(vector<vector<Pattini>> pattini)
        {
            vector<vector<Pattini>> temp = pattini;
            for(int i = 0; i < numeroPersone; i++)
            {
                if(persone[i].checkPattini(temp) == false)
                    return false;
            }
            return true;
        }
        vector<vector<Pattini>> noleggio(vector<vector<Pattini>> pattini)
        {
            for(int i = 0; i < numeroPersone; i++)
            {
                pattini = persone[i].noleggia(pattini);
            }
            return pattini;
        }
        int getNumeroPersone()
        {
            return numeroPersone;
        }
        Ora getOrarioEntrata()
        {
            return orario_entrata;
        }
        Ora getOrarioUscita()
        {
            return Orario_uscita;
        }


        friend ostream& operator<<(ostream& out, Gruppo& gruppo);
};
ostream& operator<<(ostream& out, Gruppo& gruppo)
{
    out<<"Numero persone="<<gruppo.numeroPersone<<endl;
    out<<"Orario entrata="<<gruppo.orario_entrata<<endl;
    out<<"Orario uscita="<<gruppo.Orario_uscita<<endl;
    for(int i = 0; i < gruppo.numeroPersone; i++)
    {
        out<<"Persona "<<i<<endl;
        out<<"Taglia="<<gruppo.persone[i].getTaglia()<<endl;
    }
    return out;
}

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
        int getNumeroPersone()
        {
            int numeroPersone = 0;
            for(int i = 0; i < gruppi.size(); i++)
            {
                numeroPersone += gruppi[i].getNumeroPersone();
            }
            return numeroPersone;
        }
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
        void removeGruppo(int i)
        {
            gruppi.erase(gruppi.begin()+i);
        }
        void incrementaTempo()
        {
            orario_attuale.add(TEMPO_INCREMENTO);
        }
        int getNumeroGruppi()
        {
            return gruppi.size();
        }
        Gruppo getGruppo(int i)
        {
            return gruppi[i];
        }
};

int main()
{
    srand(time(NULL));

    float soldi = 0;

    Pista pista = Pista();
    Ora ora = Ora();

    int id = 0;

    vector<Gruppo> coda;
    vector<vector<Pattini>> pattini;

    pattini.resize(TAGLIA_PATTINI_MAX-TAGLIA_PATTINI_MIN+1);


    // Creazione dei pattini
    for(int i = 0; i < TAGLIA_PATTINI_MAX-TAGLIA_PATTINI_MIN+1; i++)
    {
        for(int j = 0; j < NUMERO_PATTINI_PER_TAGLIA; j++)
        {
            Pattini pattino = Pattini(i+TAGLIA_PATTINI_MIN);
            pattini[i].push_back(pattino);
        }
    }

    int numeroPersone;
    
    while(1)
    {
        // Visualizzo l'orario attuale
        cout<<"Orario attuale="<<ora;

        // metto in manutenzione i pattini che hanno superato il numero di utilizzi e li rendo nuovamente disponibili se la manutenzione è finita
        for(int i = 0; i < pattini.size(); i++)
        {
            for(int j = 0; j < pattini[i].size(); j++)
            {
                if(pattini[i][j].getUtilizzi() >= 10)
                {
                    cout<<"PATTINI IN MANUTENZIONE FINO ALLE"<<ora+Ora(0,15,0)<<endl;
                    pattini[i][j].inizioManutenzione(ora);
                }
                if(pattini[i][j].isManutenzione() == false && pattini[i][j].getOrarioFineManutenzione() <= ora)
                {
                    pattini[i][j].fineManutenzione();
                    soldi-=COSTO_MANUTENZIONE;
                }                
            }
        }

        // Numero di persone che vogliono accedere alla pista
        numeroPersone = rand()%MAX_PERSONE_PER_GRUPPO+1;

        Ora orario_uscita_random = ora + Ora(0,rand()%31+5,0);

        // Creazione del gruppo di persone che vogliono accedere alla pista
        Gruppo gruppo = Gruppo(numeroPersone,ora,orario_uscita_random);

        // Visualizzo il gruppo
        cout<<"Gruppo:"<<gruppo<<endl;
        
        coda.push_back(gruppo);

        // Controllo se il gruppo può accedere alla pista
        if(!coda[0].checkPattini(pattini) || pista.getNumeroPersone()+coda[0].getNumeroPersone() > PERSONE_MAX)
        {
            cout<<"Non ci sono abbastanza pattini/non c'è posto in pista per il gruppo"<<endl;
        } else 
        {
            cout<<"Il gruppo può accedere alla pista"<<endl;
            pista.addGruppo(gruppo);
            coda.erase(coda.begin());
            pattini = gruppo.noleggio(pattini);
        }

        // Faccio uscire i gruppi che hanno finito il loro noleggio
        for(int i = 0; i < pista.getNumeroGruppi(); i++)
        {
            if(pista.getGruppo(i).getOrarioUscita() <= ora)
            {
                //TODO dare un id ai gruppi
                cout<<"Il gruppo "<<i<<" ha finito il noleggio"<<endl;
                Ora ora_entrata = pista.getGruppo(i).getOrarioEntrata();
                Ora ora_uscita = pista.getGruppo(i).getOrarioUscita();
                Ora ora_delta = ora_uscita - ora_entrata;
                float temp_soldi = pista.getGruppo(i).getNumeroPersone() * TARIFFA * (ora_delta.getMinuti());
                if(pista.getGruppo(i).getNumeroPersone()>=MIN_PERSONE_SCONTO)
                {
                    temp_soldi = temp_soldi * (1-SCONTO);
                }
                soldi += temp_soldi;
                pista.removeGruppo(i);
            }
        }

        cout<<"Soldi: "<<soldi<<endl;
        cout<<endl<<endl;
        // Incremento dell'orario attuale
        ora.add(TEMPO_INCREMENTO);
        sleep(1);
    }
    return 0;
}
