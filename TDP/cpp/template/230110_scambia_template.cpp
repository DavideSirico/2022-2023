#include <iostream>
using namespace std;

template<typename T>
void swapp(T& a, T& b)
{
    T dummy;
    dummy = a;
    a = b;
    b = dummy;
}

int main()
{
    int a,b;
    a = 4;
    b = 2;
    swapp(a,b);
    cout<<a<<"\n"<<b<<endl;
    float c,d;
    c = 10.1;
    d = 3.1;
    swapp(c,d);
    cout<<c<<"\n"<<d<<endl;
    string e,f;
    e = "ciao";
    f = "non ciao";
    swapp(e,f);
    cout<<e<<"\n"<<f<<endl;

    return 0;
}
