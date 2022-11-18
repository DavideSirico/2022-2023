#include <iostream>
using namespace std;

class NumeroImmaginario
{
    private:
        int numero;
        int immaginario;
    public:
        NumeroImmaginario(int a, int b)
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
        /*NumeroImmaginario& operator*(const NumeroImmaginario& test)
        {
            
        }
        */
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
    NumeroImmaginario test1(5,3);
    cout<<test1.toString()<<endl;
    return 0;
}
