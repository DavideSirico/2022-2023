#include <iostream>
using namespace std;

class Padre
{
    protected:
        int x;
    public:
        Padre()
        {
            x = 3;
        }
};

class Figlio:public Padre
{
    public:
    void stampa()
    {
        cout<<this->x;
    }
};

int main(void)
{
    Figlio a;
    a.stampa();
}