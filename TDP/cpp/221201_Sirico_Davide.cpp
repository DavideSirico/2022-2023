/*
#include <iostream>
#include <fstream>
using namespace std;

class Pointer
{
    private:
        int counter;
    public:
        Pointer()
        {
            counter = 0;
        }
        Pointer(int c)
        {
            counter = c;
        }
        int getCounter()
        {
            return counter;
        }
        void setCounter(int i)
        {
            counter = i;
        }
        Pointer& operator=(Pointer &p)
        {
            this->counter = p.counter;
            return *this;
        }
        Pointer operator=(int t)
        {
            Pointer temp;
            temp.counter = t;
            return temp;
        }
        friend ostream &operator << (ostream &out,Pointer &p);
        friend istream &operator >> (istream &in, Pointer &p);
};
ostream &operator << (ostream &out,Pointer &p)
{
    out << "Il valore e': "<<p.getCounter();
    return out;
}
istream &operator >> (istream &in, Pointer &p)
{
    int temp;
    cout<<"valore contatore: ";
    in>>temp;
    p.setCounter(temp);
    return in; 
}



int main(void)
{
    Pointer p;
    Pointer p2(2);
    p = p2;
    cout << p;
    return 0;
}
*/


#include <iostream>
using namespace std;

class A
{
    public:
    A()
    {
        cout<<"a";
    }
    void metodo()
    {
        cout<<"A";
    }
};

class B
{
    public:
    B()
    {
        cout<<"b";
    }
    void metodo()
    {
        cout<<"B";
    }
};

class C : public B, public A
{
    public:
    C()
    {
        cout<<"c";
    }
    void metodo()
    {
        cout<<"C";
    }
};


int main(void)
{
    C *c = new C();
    cout<<endl;
    c->A::metodo();
    return 0;
}




