#include <iostream>

class Figura
{
    private:
        double area;
        double perimetro;
    public: 
        Figura(){}
        void stampaArea();
        void stampaPerimetro();
        void stampa();

}; 

class Rettangolo : public Figura // che cosa vuol dire?
{
    private:
        double diagonale;
        double lato;
    public:
        Rettangolo(){}
        void calcolaArea();
        void calcolaPerimetro();
        void calcolaDiagonale();
        void stampa();
};


int main()
{
    Figura padre = Figura();
    Rettangolo child = Rettangolo();

    return 0;
}

