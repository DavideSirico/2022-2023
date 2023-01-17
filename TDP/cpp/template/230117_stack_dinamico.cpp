#include <iostream>
using namespace std;

template <class T>
class Stack
{
    private:
        T *v;
        int numero_elementi;
    public:
        Stack()
        {
            v = new T[0];
            numero_elementi=0;
        }
        void push(T elemento)
        {
            numero_elementi++;
            T *temp = new T[numero_elementi];
            for(int i = 0; i < numero_elementi-1; i++)
            {
                temp[i] = v[i];
            }
            temp[numero_elementi-1] = elemento;
            v = temp;
        };
        T pop()
        {
            numero_elementi--;
            int numero = v[numero_elementi];
            T *temp = new T[numero_elementi];
            for(int i = 0; i < numero_elementi; i++)
            {
                temp[i] = v[i];
            }
            v = temp;
            return numero;
        };
        T peek()
        {
            return v[numero_elementi-1];
        };
        void stampa()
        {
            for(int i = 0; i < numero_elementi; i++)
            {
                cout<<v[i]<<" ";
            }
        }


};


int main()
{
    /*
    Stack <int> s;
    for(int i = 1; i <= 100; i++)
    {
        s.push(i);
    }
    cout<<s.pop()<<endl;
    s.stampa();*/
    Stack <char> s;
    for(int i = 1; i <= 100; i++)
    {
        s.push(i+'0');
    }
    cout<<s.pop()<<endl;
    s.stampa();
    return 0;
}
