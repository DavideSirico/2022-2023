#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ifstream in("input.txt");
    ofstream out("output.txt");
    
    if(in.is_open()==0 || out.is_open()==0)
    {
        return 0;
    }

    int n,m;
    in>>n>>m;
    /* int a[n][m]; */
    /*
    int **a = (int**)malloc(n*sizeof(int));
    for(int i = 0; i < m; i++)
    {
        a[i] = (int*)malloc(m*sizeof(int));
    }*/

    int **a = new int*[n];
    for(int i = 0; i < m; i++)
    {
        a[i] = new int[m];
    }
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < m; j++)
        {
            in>>a[i][j];
            cout<<a[i][j];
        }
    }
    int somma = 0;
    for(int i = 0; i < n && i < m; i++)
    {
        somma += a[i][i];
    }
    out<<somma;
    

    for(int i = 0; i < m; i++)
    {
        delete[] a[i];
    }
    delete[] a;
    in.close();
    out.close();
    return 0;
}
