/*
Evento di corso
Scrivi un programma in C++ che implementi le classi necessari per la seguente realtà.
Si vuole scrivere un programma che realizzi la contabilità di una scuola.
Un dipendente è una classe dove vengono memorizzati, un nome, un cognome,un codice identificativo (numero progressivo), e il numero di lezioni totali che svolge a settimana.  

Nel dipendente è memorizzato anche il suo stipendio lordo.

All'interno della scuola esiste poi il dirigente scolastico, dipendente dove è memorizzato il codice meccanografico della scuola (es. MNIS00IE) e quanti sono gli studenti della scuola. Lo stipendio del DS è di 23000€ + 0,5€ per ogni studente della scuola.

Esiste poi il docente, ogni docente è distinto, oltre dal numero di ore settimanali di lezione da quante ore di corsi di recupero fa. Ogni ora di corso di recupero è pagata 50€ all'ora. Un docente, se fa lezione guadagna 22€ all'ora di lezione. 

Esiste infine il docente referente di dipartimento. Ogni referente di dipartimento ha memorizzato quale dipartimento dirige e prende uno stipendio ulteriore di 1000€ rispetto a tutti i docenti normali.

- Ti consiglio di scrivere nelle varie classi una funzione void calcola() che gestisce il salvataggio dello stipendio per i singoli casi dei dipendenti.

- Scrivi un programma C++ che implementi la realtà di interesse, scrivi un main di prova dove vengano memorizzati alcuni dipendenti (dei vari tipi)  

- Scrivi la funzione (del main) stampaStipendioDipendente() che stampi i dettagli base di ogni dipendente e lo stipendio

- Scrivi in ogni classe la funzione StampaDettagliDipendente() , funzione che dettaglia e specifica tutti i dettagli del dipendente

- La struttura dati del main per memorizzare i dipendenti è un array.

*/

#include <iostream>
using namespace std;

class Dipendente
{
    public:
        string nome;
        string cognome;
        int codice;
        int lezioni;
        float stipendio;
        Dipendente(){};
        Dipendente(string nome, string cognome, int codice, int lezioni, float stipendio)
        {
            this->nome = nome;
            this->cognome = cognome;
            this->codice = codice;
            this->lezioni = lezioni;
            this->stipendio = stipendio;
        }

};

class Dirigente : public Dipendente
{
    public:
        string codice_meccanografico;
        int studenti;
        Dirigente(){};
        Dirigente(string nome, string cognome, int codice, int lezioni, string codice_meccanografico, int studenti)
        {
            this->nome = nome;
            this->cognome = cognome;
            this->codice = codice;
            this->lezioni = lezioni;
            this->stipendio = 23000 + (this->studenti * 0.5);
            this->codice_meccanografico = codice_meccanografico;
            this->studenti = studenti;
        }
};

class Docente : public Dipendente
{
    public:
        int ore_recupero;
        Docente(){};
        Docente(string nome, string cognome, int codice, int lezioni, float stipendio, int ore_recupero)
        {
            this->nome = nome;
            this->cognome = cognome;
            this->codice = codice;
            this->lezioni = lezioni;
            this->stipendio = (50 * ore_recupero) + (22 * lezioni);
            this->ore_recupero = ore_recupero;
        }
};

class Referente : public Docente
{
    
    public:
        string dipartimento;
        Referente(){};
        Referente(string nome, string cognome, int codice, int lezioni, float stipendio, int ore_recupero, string dipartimento)
        {
            this->nome = nome;
            this->cognome = cognome;
            this->codice = codice;
            this->lezioni = lezioni;
            this->stipendio = (50 * ore_recupero) + (22 * lezioni) + 1000;
            this->ore_recupero = ore_recupero;
            this->dipartimento = dipartimento;
        }
};

void stampaStipendioDipendente(Dipendente d1)
{
    cout << "Nome: " << d1.nome << endl;
    cout << "Cognome: " << d1.cognome << endl;
    cout << "Stipendio dipendente: " << d1.stipendio << endl;
}

void StampaDettagliDipendente(Dipendente d1)
{
    cout << "Nome: " << d1.nome << endl;
    cout << "Cognome: " << d1.cognome << endl;
    cout << "Codice: " << d1.codice << endl;
    cout << "Lezioni settimanali: " << d1.lezioni << endl;
    cout << "Stipendio dipendente: " << d1.stipendio << endl;
}

int main(void)
{
    Dipendente dipendenti[5];

    for (int i = 0; i < 5; i++)
    {
        dipendenti[i] = Dipendente("Davide", "Sirico", i, 10, 1000);
    }
    stampaStipendioDipendente(dipendenti[0]);
    cout << endl;
    StampaDettagliDipendente(dipendenti[0]);

    return 0;
}