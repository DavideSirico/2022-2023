#include <iostream>
using namespace std;


class Animale
{
	protected:
        string razza;
        int annoNascita;
};

class Cane : public Animale
{
	private:
        float peso;
        string nome;
	
	public:
        Cane()
        {
            razza = "";
            annoNascita = 0;
            peso = 0;
            nome = "";
        }
        Cane(string razza, int annoNascita, float peso, string nome)
        {
            this->razza = razza;
            this->annoNascita = annoNascita;
            this->peso = peso;
            this->nome = nome;
        }
        void stampa()
        {
            if(peso>20)
            {
                cout<<razza<<annoNascita<<peso<<nome;
            }
        }
};

int main()
{
    Cane c("a",1,40,"b");

    c.stampa();
    return 0;
}