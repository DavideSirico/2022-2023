/*1)Scrivi una classe Figura, la classe figura ha all’interno gli attributi area e perimetro e due funzioni stampaArea e stampaPerimetro e una generica funzione stampa().
Crea tre classi, quadrato cerchio rombo. Nel quadrato devo definire un lato, nel cerchio un raggio e nel rombo base, altezza e lato.

Definisci nei tre figli i metodi calcolaArea() e calcolaPerimetro() e implementali (6 metodi totali). 

Definisci inoltre la funzione di stampa specifica nei figli (3 metodi totali).

Scrivi un main di prova che crei un oggetto Figura, un oggetto quadrato ed un oggetto cerchio, provando i metodi implementanti.*/

#include <iostream>
#include <math.h>
using namespace std;

class Figura
{
    protected:
        float area;
        float perimetro;
    public:
        Figura()
        {
            area = 0;
            perimetro = 0;
        }
        Figura(float area, float perimetro)
        {
            this->area = area;
            this->perimetro = perimetro;
        }
        void stampaArea()
        {
            cout<<"Area: "<<area<<endl; 
        }
        void stampaPerimetro()
        {
            cout<<"Perimetro: "<<perimetro<<endl;
        }
        void stampa()
        {
            cout<<"Sono una figura"<<endl;
        }
};

class Quadrato:public Figura
{
    private:
        float lato;
    public:
        Quadrato()
        {
            lato = 0;
        }
        Quadrato(float lato)
        {
            this->lato = lato;
        }
        void calcolaArea()
        {
            area = lato * lato;
        }
        void calcolaPerimetro()
        {
            perimetro = lato * 4;
        }
        void stampaQuadrato()
        {
            cout<<"Sono un quadrato"<<endl<<"Area: "<<area<<endl<<"Perimetro: "<<perimetro<<endl<<"Lato: "<<lato<<endl;
        }
};
class Cerchio:public Figura
{
    private:
        float raggio;
    public:
        Cerchio()
        {
            raggio = 0;
        }
        Cerchio(float raggio)
        {
            this->raggio = raggio;
        }
        void calcolaArea()
        {
            area = pow(raggio,2) * M_PI; 
        }
        void calcolaPerimetro()
        {
            perimetro = M_PI * 2 * raggio;
        }
        void stampaCerchio()
        {
            cout<<"Sono un cerchio"<<endl<<"Area: "<<area<<endl<<"Perimetro: "<<perimetro<<endl<<"Raggio: "<<raggio<<endl;
        }
};
class Rombo:public Figura
{
    private:
        float base;
        float altezza;
        float lato;
    public:
        Rombo()
        {
            base = 0;
            altezza = 0;
            lato = 0;
        }
        Rombo(float base, float altezza, float lato)
        {
            this->base = base;
            this->altezza = altezza;
            this->lato = lato;
        }
        void calcolaArea()
        {
            area = (base * altezza) / 2;
        }
        void calcolaAltezza()
        {
            perimetro = lato * 4;
        }
        void stampaRombo()
        {
            cout<<"Sono un rombo"<<endl<<"Area: "<<area<<endl<<"Perimetro: "<<perimetro<<endl<<"Base: "<<base<<endl<<"Altezza: "<<altezza<<endl<<"Lato: "<<lato<<endl;
        }
};


float main(void)
{
    Figura f1(5,4);
    Cerchio c1(2);
    Quadrato q1(4);
    Rombo r1(5,2,1);

    f1.stampa();
    c1.stampaCerchio();
    return 0;
}