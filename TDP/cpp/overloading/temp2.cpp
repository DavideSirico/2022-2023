#include <iostream>
using namespace std;

class Padre
{
    public:
    string nome;
    void metodo() { cout<<"Metodo del Padre" <<endl;}
};
class Figlio: public Padre
{
    public:
    void metodo() {
        cout<<"Metodo del Figlio" <<endl;
    }
};



int main()
{
    Figlio child_vecchio;
    Figlio child(child_vecchio);
    Padre *punt;
    punt= &child;
    punt->metodo();
    return 0;
}