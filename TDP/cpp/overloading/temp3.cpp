#include <iostream>
using namespace std;

int main()
{
    int *array = (int*)malloc(sizeof(int)*10);

    int n=9;

    array[n]=5;
    cout<<array[n]<<endl;
    
    array = (int*)realloc(array,10*sizeof(int));
    n = 10;
    array[n]=10;
    cout<<array[n];

    free(array);

    return 0;
}