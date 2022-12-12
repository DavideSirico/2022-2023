#include <iostream>
using namespace std;

class A {
    public:
        A() { cout << "Costruttore di A" << endl; }
        void metodo(){
            cout<<"Metodo di A" <<endl;
        }
};
class B: public A {
    public:
        B() { cout << "Costruttore di B" << endl; }
        void metodo()
        {
            cout<<"Metodo di B" <<endl;
        }
};
int main()
{
    B b;
    int** m = new int*[10];
        
    for (int i = 0; i < 10; i++) {
 
        m[i] = new int[10];
    }



    for(int i = 0; i < 10; i++)
    {
        for(int j = 0; j < 10; j++)
        {
            m[i][j] = (i*10)+j;
        }
    }

    for(int i = 0; i < 10; i++)
    {
        for(int j = 0; j < 10; j++)
        {
            cout<<m[i][j]<<" ";
        }
        cout<<endl;
    }

    for (int i = 0; i < 10; i++)
        delete[] m[i];
    delete[] m;
    
    return 0;
}