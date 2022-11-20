#include <iostream>
using namespace std;

class NumeroImmaginario
{
    private:
        float numero;
        float immaginario;
    public:
        NumeroImmaginario(float a, float b)
        {
            this->numero = a;
            this->immaginario = b;
        }
        NumeroImmaginario& operator+(const NumeroImmaginario& test)
        {
            this->numero = this->numero + test.numero;
            this->immaginario = this->immaginario + test.immaginario;
            return *this;
        }
        NumeroImmaginario& operator-(const NumeroImmaginario& test)
        {
            this->numero = this->numero - test.numero;
            this->immaginario = this->immaginario - test.immaginario;
            return *this;
        }
        NumeroImmaginario operator*(const NumeroImmaginario& test)
        {
            NumeroImmaginario temp(0,0);
            temp.numero = (this->numero * test.numero) - (this->immaginario * test.immaginario);
            temp.immaginario = (this->numero * test.immaginario) + (this->immaginario * test.numero);
            return temp;
        }
        NumeroImmaginario operator/(const NumeroImmaginario& test)
        {
            NumeroImmaginario temp(0,0);
            temp.numero = (this->numero*test.numero+this->immaginario*test.immaginario)/(test.numero*test.numero+test.immaginario*test.immaginario);
            temp.immaginario = (this->immaginario*test.numero-this->numero*test.immaginario)/(test.numero*test.numero+test.immaginario*test.immaginario);
            return temp;
        }
        
        string toString()
        {
            string box = "";
            box = to_string(this->numero);
            box += " + i";
            box += to_string(this->immaginario);
            return box;
        }
};

int main()
{
    NumeroImmaginario test1(1,1);
    NumeroImmaginario test2(1,3);
    cout<<test1.toString()<<endl;
    cout<<test2.toString()<<endl;
    test1 = test1 + test2;
    cout<<"Somma: "<<test1.toString()<<endl;
    test1 = test1 - test2;
    cout<<"Differenza: "<<test1.toString()<<endl;
    test1 = test1 * test2;
    cout<<"Moltiplicazione: "<<test1.toString()<<endl;
    test1 = test1 / test2;
    cout<<"Divisione: "<<test1.toString()<<endl;

    return 0;
}
