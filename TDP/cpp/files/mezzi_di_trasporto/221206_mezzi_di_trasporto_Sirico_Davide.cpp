/*Es.1 Creare la classe MezziTrasporto con attributi: velocità massima, tipo di trazione (animale, muscolare, motore) e numero di persone massimo trasportabili.

Creare la sottoclasse VeicoloAmotore che eredita tutti i membri di MezziTrasporto, ma prevede anche il consumo e il tipo di alimentazione (benzina, diesel, kerosene). I metodi per questa classe sono: l’accensione e lo spegnimento e la possibilità di accelerare e frenare.

Creare un main opportuno per testare le classi.

Infine, aggiungere la classe Autobus con gli attributi costo del biglietto e numero di posti sia in piedi che a sedere. I metodi sono: aprire e chiudere le porte e il metodo per prenotare la fermata. 

Nel main testare la definizione di un array statico di oggetti.*/
#include <iostream>
using namespace std;

class MezziTrasporto
{
    protected:
        float velocita_max;
        string trazione;
        int numero_persone_max;
    public:
        MezziTrasporto()
        {
            velocita_max = 0;
            trazione = "";
            numero_persone_max = 0;
        }
        MezziTrasporto(float velocita_max, string trazione, int numero_persone_max)
        {
            this->velocita_max = velocita_max;
            this->trazione = trazione;
            this->numero_persone_max = numero_persone_max;
        }

};
class VeicoloAmotore : public MezziTrasporto
{
    protected:
        float consumo;
        string tipo_alimentazione;
        bool accensione_si_no;
        float velocita;
    public:
        VeicoloAmotore():MezziTrasporto()
        {
            accensione_si_no = false;
            consumo = 0;
            tipo_alimentazione = "";
            velocita = 0;
        }
        VeicoloAmotore(float consumo, string tipo_alimentazione,bool accensione_si_no, float velocita,float velocita_max, string trazione, int numero_persone_max):MezziTrasporto(velocita_max,trazione,numero_persone_max)
        {
            this->accensione_si_no = accensione_si_no;
            this->consumo = consumo;
            this->tipo_alimentazione = tipo_alimentazione;
            this->velocita = velocita;
        }
        void accensione()
        {
            accensione_si_no = true;
        }
        void spegnimento()
        {
            accensione_si_no = false;
        }
        void frenare()
        {
            velocita--;
        }
        void accelerare()
        {
            velocita++;
        }
};

class Autobus : public VeicoloAmotore
{
    private:
        float costo_biglietto;
        int posti_piedi;
        int posti_sedere;
        bool porte;
        bool fermata;
    public:
        Autobus():VeicoloAmotore()
        {
            costo_biglietto = 0;
            posti_piedi = 0;
            posti_sedere = 0;
            porte = false;
            fermata = false;
        }   
        Autobus(float costo_biglietto, int posti_piedi, int posti_sedere,bool porte,bool fermata,float consumo, string tipo_alimentazione,bool accensione_si_no, float velocita,float velocita_max, string trazione, int numero_persone_max):VeicoloAmotore(consumo, tipo_alimentazione,accensione_si_no, velocita,velocita_max, trazione, numero_persone_max)
        {
            this->porte = porte;
            this->costo_biglietto = costo_biglietto;
            this->posti_piedi = posti_piedi;
            this->posti_sedere = posti_sedere;
            this->fermata = fermata;
        }
        void aprire_porte()
        {
            porte = true;
        }
        void chiudere_porte()
        {
            porte = false;
        }
        void prenotare()
        {
            fermata = true;
        }
};

int main()
{
    MezziTrasporto macchina;
    Autobus giallo[10];
    return 0;
}
