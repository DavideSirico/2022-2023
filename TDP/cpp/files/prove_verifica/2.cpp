#include <iostream>
using namespace std;

class Moto
{
    public:
        int codice;
        string modello;
        int cilindrata;
        string motorizzazione;
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

int main()
{
    srand(time(NULL));
    
    Moto m[10];

    char dummyModello[2] = {'A','1'};
    string str = "";
    int cilindrate[] = {125,600,750};
    string motorizzazione[] = {"due_tempi","quattro_tempi","elettrica"};
    string bauletti[] = {"grande","medio","piccolo","assente"};
    string carena[] = {"semicarena","cupolino","integrale","naked"};

    for(int i = 0; i < 10; i++)
    {
        dummyModello[1] =  '0' + i;
        
        str = "A" + to_string(i);
        cout<<str;
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