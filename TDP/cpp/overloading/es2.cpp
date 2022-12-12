/*

Esercizio 2

Data una classe Moto definire come attributi: 
- un codice di identificazione (int);
- il modello (string);
- la cilindrata (int);
- il tipo di motorizzazione (string);

Definire due classi figlie:
- Scooter (che eredita gli attributi della classe padre e presenta l'attributo bauletto (string));
- Strada (che eredita gli attributi della classe padre e presenta l'attributo tipoCarena (string));

Definire un metodo stampa per tutte e 3 le classi che stampa tutti gli attributi;

Fare l'overload dell'operatore << in modo da stampare:
"sono una moto modello "..." e la mia cilindrata è "...

Nel main:
- definire un array di 10 moto. Ogni moto presenta: 
    1. Id (numero casuale tra 1 e 10.000);
    2. Modello (formato da A + l'indice dell'array);
    3. Cilindrata (numero casuale da 0 a 2) -> (0 = 125, 1 = 600, 2=750);
    4. Motorizzazione (numero casuale da 0 a 2) -> (0 = due_tempi, 1 = quattro_tempi, 2 = elettrica)
Stampare tutti gli elementi tramite << ridefinita

- definire un array di 10 scooter. Ogni moto presenta:
    1. Gli stessi elementi della prima parte con l'array di moto;
    2. Bauletto (numero casuale da 0 a 3) -> (0 = grande, 1 = medio, 2 = piccolo, 3 = assente)
Stampare solo gli elementi che presentano il bauletto "piccolo" tramite << ridefinita

- definire un array di 10 strada. Ogni moto presenta:
    1. Gli stessi elementi della prima parte con l'array di moto;
    2. Carena (numero casuale da 0 a 3) -> (0 = semicarena, 1 = cupolino, 2 = integrale, 3 = naked)
Stampare solo gli elementi che presentano la carena "semicarena" tramite << ridefinita

*/

#include <iostream>
using namespace std;

class Moto
{
    private:
        int codice;
        string modello;
        int cilindrata;
        string motorizzazione;
    public:
        friend ostream& operator << (ostream& out, const Moto& m);
};

class Scooter : public Moto
{
    private: 
        string bauletto;
    public:
        friend ostream& operator << (ostream& out, const Scooter& m);
};

class Strada : public Moto
{
    private:
        string tipoCatena;
    public:
        friend ostream& operator << (ostream& out, const Strada& m);
};

int main()
{
    
    return 0;
}