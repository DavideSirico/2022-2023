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
*/

#include <iostream>
using namespace std;

class Moto
{
    public:
        int codice;
        string modello;
        int cilindrata;
        string motorizzazione;
        /*Moto()
        {
            codice = 0;
            modello = "";
            cilindrata = 0;
            motorizzazione = "";
        }*/
        void stampa()
        {
            cout<<"Codice: "<<codice<<"\nModello: "<<modello<<"\ncilindrata: "<<cilindrata<<"\nMotorizzazione: "<<motorizzazione;
        }
        friend ostream& operator <<(ostream &out, Moto &m);
};

ostream& operator <<(ostream &out, Moto &m)
{
    out<<"Codice: "<<m.codice<<"\nModello: "<<m.modello<<"\ncilindrata: "<<m.cilindrata<<"\nMotorizzazione: "<<m.motorizzazione;
    return out;
}

class Scooter : public Moto
{
    public:
        string bauletto;
        void stampa()
        {
            cout<<"Codice: "<<codice<<"\nModello: "<<modello<<"\ncilindrata: "<<cilindrata<<"\nMotorizzazione: "<<motorizzazione<<"\nBauletto"<<bauletto;
        }
        friend ostream& operator <<(ostream &out, Moto &m);

};
ostream& operator <<(ostream &out, Scooter &m)
{
    out<<"Codice: "<<m.codice<<"\nModello: "<<m.modello<<"\ncilindrata: "<<m.cilindrata<<"\nMotorizzazione: "<<m.motorizzazione<<"\nBauletto: "<<m.bauletto;
    return out;
}

class Strada : public Moto
{
    
    public:
        string tipoCatena;
        void stampa()
        {
            cout<<"Codice: "<<codice<<"\nModello: "<<modello<<"\ncilindrata: "<<cilindrata<<"\nMotorizzazione: "<<motorizzazione<<"\nTipo catena: "<<tipoCatena;
        }
        friend ostream& operator <<(ostream &out, Moto &m);
};
ostream& operator <<(ostream &out, Strada &m)
{
    out<<"Codice: "<<m.codice<<"\nModello: "<<m.modello<<"\ncilindrata: "<<m.cilindrata<<"\nMotorizzazione: "<<m.motorizzazione<<"\nTipo catena: "<<m.tipoCatena;
    return out;
}
/*
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
int main()
{
    srand(time(NULL));
    
    Moto m[10];

    char dummyModello[2] = {'A','1'};
    
    int cilindrate[] = {125,600,750};
    string motorizzazione[] = {"due_tempi","quattro_tempi","elettrica"};
    string bauletti[] = {"grande","medio","piccolo","assente"};
    string carena[] = {"semicarena","cupolino","integrale","naked"};

    for(int i = 0; i < 10; i++)
    {
        dummyModello[1] =  '0' + i;
        m[i].codice = rand()%10000+1;
        m[i].cilindrata = cilindrate[rand()%3];
        m[i].motorizzazione = motorizzazione[rand()%3];
        m[i].modello = dummyModello;
        cout<<m[i]<<endl;
    }

    Scooter sc[10];
    for(int i = 0; i < 10; i++)
    {
        dummyModello[1] =  '0' + i;
        sc[i].codice = rand()%10000+1;
        sc[i].cilindrata = cilindrate[rand()%3];
        sc[i].motorizzazione = motorizzazione[rand()%3];
        sc[i].modello = dummyModello;
        sc[i].bauletto = bauletti[rand()%4];
        
        if(sc[i].bauletto == "piccolo")
        {
            cout<<sc[i]<<endl;
        }
    }
    Strada st[10];
    for(int i = 0; i < 10; i++)
    {
        dummyModello[1] =  '0' + i;
        st[i].codice = rand()%10000+1;
        st[i].cilindrata = cilindrate[rand()%3];
        st[i].motorizzazione = motorizzazione[rand()%3];
        st[i].modello = dummyModello;
        st[i].tipoCatena = carena[rand()%4];
        if(st[i].tipoCatena == "semicarena")
        {
            cout<<st[i]<<endl;
        }
    }
    return 0;
}




/*
Parte di Benatti

data una classe Animale (attributi: razza,annoNascita) definisci una sottoclasse Cane con attributi (peso e nome del cane) , costruttore e un metodo di stampa che visualizza tutti gli attributi se il peso>20
- definizione di overload di operatori
- Domanda sulle modalità di accesso ad un file

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
        void stampa()
        {
            if(peso>20)
            {
                cout<<razza<<annoNascita<<peso<<nome;
            }
        }
}


*/