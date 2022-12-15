#include <iostream>
using namespace std;
// classe astreatta

class A
{
    public:
    virtual void stampa()//virtuale pura
    {
        cout<<"A"<<endl;
    }
};

class B: public A
{
    public:
    void stampa()
    {
        cout<<"b"<<endl;
    }
};

class C: public A
{
    public:
    void stampa()
    {
        cout<<"C"<<endl;
    }
};

int main()
{
    C c;
    c.stampa();
    return 0;
}
