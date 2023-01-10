#include <iostream>
using namespace std;

template <typename T>
void stampaArray(T v[], int size)
{
    for(int i = 0; i < size; i++)
    {
        cout<<v[i]<<" ";
    }
    cout<<endl;
}

template <typename T>
void ordina(T v[], int size, char opz)
{
    if(opz != 'A' && opz != 'D')
    {
        return;
    }
    if(opz == 'A')
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                if(v[i]>v[j])
                {
                    swap(v[i],v[j]);
                }
            }
        }
    } else 
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                if(v[i]<v[j])
                {
                    swap(v[i],v[j]);
                }
            }
        }
    }
}

int main()
{
    int v[] = { 1, 3, 4, 1, 2, 3, 5, 5 ,4, 2, 5, 5 };
    string s[] = { "ciao", "come", "stai", "ciao"};
    stampaArray(v, 12);
    ordina(v,12,'A');
    stampaArray(v, 12);
    cout<<endl;
    stampaArray(s, 4);
    ordina(s,4,'D');
    stampaArray(s, 4);
    return 0;
}
