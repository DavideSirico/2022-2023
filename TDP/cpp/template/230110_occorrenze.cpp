#include <iostream>
using namespace std;

template <typename T>
int occorrenze(T v[],T elem, int size)
{
    int c=0;
    for(int i = 0; i < size; i++)
    {
        if(v[i] == elem)
        {
            c++;
        }
    }
    return c;
}

int main()
{
    int v[] = { 1, 3, 4, 1, 2, 3, 5, 5 ,4, 2, 5, 5 };
    string s[] = { "ciao", "come", "stai", "ciao"};
    string parola = "ciao";
    /* cout<<occorrenze(v, 1, 12); */
    cout<<occorrenze(s, parola, 4);
    return 0;
}
