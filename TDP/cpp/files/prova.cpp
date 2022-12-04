#include <fstream>
using namespace std;

int main(void)
{
    ofstream out;
    out.open("output.txt",ios::out);
    srand(time(NULL));
    out<<"I Risultati sono:\n";
    for(int i = 0; i < 100; i++)
    {
        out<<"i: "<<rand()%100<<endl;
    }
    out.close();
    return 0;
}
