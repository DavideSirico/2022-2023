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
int main()
{
    int v[] = { 1, 3, 4, 1, 2, 3, 5, 5 ,4, 2, 5, 5 };
    string s[] = { "ciao", "come", "stai", "ciao"};
    stampaArray(v, 12);
    cout<<endl;
    stampaArray(s, 4);
    return 0;
}
