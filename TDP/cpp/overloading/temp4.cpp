#include <iostream>
#include <fstream>
using namespace std;

class Prova
{
    private:
        int numero;
    public:
        // Costruttore
        Prova()
        {
            numero = 0;
        }
        // Costruttore con parametri
        Prova(int dummy)
        {
            numero = dummy;
        }
        // Costruttore copia
        Prova(const Prova& p)
        {
            this->numero = p.numero;
        }
        
        int getNumero()
        {
            return numero;
        }

        void setNumero(int n)
        {
            this->numero = n;
        }

        // pre-incremento
        Prova operator++()
        {
            this->numero++;
            return *this;
        }
        // post-incremento
        Prova operator++(int)
        {
            Prova temp = *this;
            operator++();
            return temp;
        }

        // assegnazione
        Prova& operator =(const Prova& test)
        {
            this->numero=test.numero;
            return *this;
        }
        // somma
        Prova operator+(const Prova& p)
        {
            Prova temp;
            temp.numero = p.numero + this->numero;
            return temp;
        }
        // sottrazione
        Prova operator-(const Prova& p)
        {
            Prova temp;
            temp.numero = p.numero - this->numero;
            return temp;
        }
        // moltiplicazione
        Prova operator*(const Prova& p)
        {
            Prova temp;
            temp.numero = p.numero * this->numero;
            return temp;
        }
        // divisione
        Prova operator/(const Prova& p)
        {
            Prova temp;
            temp.numero = p.numero / this->numero;
            return temp;
        }


        bool operator==(const Prova& p)
        {
            if(p.numero == this->numero)
            {
                return true;
            }
            return false;
        }

        bool operator<(const Prova& p)
        {
            if(this->numero<p.numero)
            {
                return true;
            }
            return false;
        }

        bool operator>(const Prova& p)
        {
            if(this->numero>p.numero)
            {
                return true;
            }
            return false;
        }

        friend ostream& operator << (ostream &out, Prova& p);
        friend istream& operator >> (istream &in, Prova& p);
};
ostream& operator << (ostream& out, Prova& p)
{

    out<<p.numero;
    return out;
}

istream& operator >> (istream& in, Prova& p)
{
    in>>p.numero;
    return in;
}

class Punto : public Prova
{
    private:
        int y;
    public:
        Punto() : Prova()
        {
            y = 0;
        }
        Punto(int x, int y) : Prova(x)
        {
            this->y = y;
        }
        friend ostream& operator << (ostream &out, Punto& p);
        friend istream& operator >> (istream &in, Punto& p);
};

ostream& operator << (ostream& out, Punto& p)
{
    int dummy = p.getNumero();
    out<<dummy<<" "<<p.y;
    return out;
}

istream& operator >> (istream& in, Punto& p)
{
    int dummy;
    in>>dummy>>p.y;
    p.setNumero(dummy);
    return in;
}

int main()
{
    Prova p1(2),p2,p3;

    cin>>p2;
    p3 = p1 + p2;
    cout<<p3;
    if(p1<p2)
    {
        cout<<"p1 è minore di p2";
    }

    cout<<endl;

    Punto P(1,2);

    cout<<P;


    

    return 0;
}