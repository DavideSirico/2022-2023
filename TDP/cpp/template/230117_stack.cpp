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
        Stack(int n)
        {
            v = new T[n];
            numero_elementi = n;
        }
        void push(T elemento)
        {
            if(isFull())
            {
                return;
            }
            v[numero_elementi] = elemento;
            numero_elementi++;
        };
        T pop()
        {
            if(!isEmpty())
            {
                numero_elementi--;
                return v[numero_elementi];
            }
            return 0;
        };
        bool isFull()
        {
            if(numero_elementi == 100)
            {
                return true;
            }
            return false;
        };
        bool isEmpty()
        {
            if(numero_elementi == 0)
            {
                return true;
            }
            return false;
        };
        T peek()
        {
            if(!isEmpty())
                return v[numero_elementi-1];
            return 0;
        };
};


int main()
{
    Stack <int> s;
    for(int i = 0; i < 1000; i++)
    {
        s.push(i);
    }
    cout<<s.peek();
    return 0;
}
