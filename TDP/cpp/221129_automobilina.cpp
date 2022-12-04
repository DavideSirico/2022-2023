/*
Creare una classe per rappresentare un’automobilina telecomandata a batteria.

L’automobilina si potrà muovere nelle quattro direzioni su un tabellone bidimensionale (25x25) con caselle quadrate, la sua posizione sarà memorizzata tramite le coordinate x e y.

Ogni automobilina avrà una certa carica della batteria e per ogni casella in cui si muove consumerà l’1% della batteria.

Il costruttore posiziona la macchinina in x=0,y=0 (in basso a sinistra nel tabellone) e con carica 100%. Ad ogni spostamento verificare se è possibile con un metodo che restituisce vero o falso.

Creare la classe automobilina della polizia, che avrà le stesse caratteristiche delle automobiline normali, ma in più avrà la sirena, che potrà essere accesa e spenta. Quando sarà azionata la sirena la carica scenderà del 2%.*/
#include <iostream>
using namespace std;

class Automobilina
{
    protected:
        int x;
        int y;
        int carica;
    public:
        Automobilina()
        {
            x=0;
            y=0;
            carica=100;
        }
        int getCarica()
        {
            return carica;
        }
        bool checkSpostamento(int x, int y)
        {
            if(x>25 || y>25)
            {
                return false;
            }
            int deltaX = abs(this->x-x);
            int deltaY = abs(this->y-y);
            int deltaTot = deltaX + deltaY;


            if(carica<deltaTot)
            {
                return false;
            }

            carica -= deltaTot;


            return true;
        }

};

class Polizia : public Automobilina
{
    private:
       bool sirena; 
    public:
        Polizia()
        {
            sirena=false;
        }
        void changeSirena()
        {
            sirena = !sirena;
            if(carica>=2)
            {
                carica -= 2;
                sirena = !sirena;
            }
        }
};

int main()
{
    Automobilina auto1;
    Polizia poli1;
    
    auto1.checkSpostamento(25,25);
    auto1.checkSpostamento(25,25);
    auto1.checkSpostamento(1,0);
    cout<<auto1.getCarica();
 
    poli1.checkSpostamento(25,25);
    poli1.checkSpostamento(25,25);
    poli1.changeSirena();
    cout<<poli1.getCarica();

    return 0;
}
