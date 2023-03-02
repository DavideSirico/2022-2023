#include <iostream>
using namespace std;

template <typename T>
bool confronta(T v[], int dim)
{
    for(int i = 0; i < dim-1; i++)
    {
        for(int j = i + 1; j < dim; j++)
        {
            if(v[i]==v[j])
            {
                return false;
            }
        }
    }
    return true;
}
int main()
{
    int v[] = {1,2,3,4,5,6};
    char c[] = {'y','2','a','c','f','w'};
    if(confronta(c,6))
    {
        cout << "Si";
    } else 
        cout << "No";
    return 0;
}
