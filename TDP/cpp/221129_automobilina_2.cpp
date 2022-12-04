/*
Creare una classe per rappresentare un’automobilina telecomandata a batteria.

L’automobilina si potrà muovere nelle quattro direzioni su un tabellone bidimensionale (25x25) con caselle quadrate, la sua posizione sarà memorizzata tramite le coordinate x e y.

Ogni automobilina avrà una certa carica della batteria e per ogni casella in cui si muove consumerà l’1% della batteria.

Il costruttore posiziona la macchinina in x=0,y=0 (in basso a sinistra nel tabellone) e con carica 100%. Ad ogni spostamento verificare se è possibile con un metodo che restituisce vero o falso.

Creare la classe automobilina della polizia, che avrà le stesse caratteristiche delle automobiline normali, ma in più avrà la sirena, che potrà essere accesa e spenta. Quando sarà azionata la sirena la carica scenderà del 2%.*/
#include <iostream>
using namespace std;
#define DIM 25

class Automobilina
{
    protected:
        int x;
        int y;
        int carica;
    public:
        Automobilina()
        {
            x=0;
            y=0;
            carica=100;
        }
        int getX()
        {
            return x;
        }
        int getY()
        {
            return y;
        }
        int getCarica()
        {
            return carica;
        }
        bool checkSpostamento(int x, int y)
        {
            if(x>DIM || y>DIM)
            {
                return false;
            }
            int deltaX = abs(x);
            int deltaY = abs(y);
            int deltaTot = deltaX + deltaY;


            if(carica<deltaTot)
            {
                return false;
            }

            carica -= deltaTot;
            this->x+=x;
            this->y+=y;

            return true;
        }

};

class Polizia : public Automobilina
{
    private:
       bool sirena; 
    public:
        Polizia()
        {
            sirena=false;
        }
        void changeSirena()
        {
            sirena = !sirena;
            if(carica>=2)
            {
                carica -= 2;
                sirena = !sirena;
            }
        }
};


void visualizza(int m[DIM][DIM], int c){
    int i,j,k;
    for(i=0;i<DIM;i++){
        putchar(' ');
        for(j=0;j<c;j++){
            putchar('-');
        }
    }
    putchar('\n');
    for(i=0;i<DIM;i++){
        for(j=0;j<DIM;j++){
            printf("|%2d",m[i][j]);
        }
        putchar('|');
        putchar('\n');
        for(j=0;j<DIM;j++){
            putchar(' ');
            for(k=0;k<c;k++){
                putchar('-');
            }
        }
        putchar('\n');   
    }
    putchar('\n');
}

void azzera(int m[DIM][DIM])
{
    for(int i = 0; i < DIM; i++)
        for(int j = 0; j < DIM; j++)
            m[i][j] = 0;
}

int main()
{
    Automobilina auto1;
    Polizia poli1;
    int m[DIM][DIM]; 
    while(1)
    {
        cout<<"CARICA: "<<auto1.getCarica()<<endl;
        char dummy;
        cin>>dummy;
        switch(dummy)
        {
            case 'w':
                auto1.checkSpostamento(1,0);
                break;
            case 'a':
                auto1.checkSpostamento(0, -1);
                break;
            case 's':
                auto1.checkSpostamento(-1, 0);
                break;
            case 'd':
                auto1.checkSpostamento(0, 1);
                break;
            default:
                cout<<"clang";
                break;
        }
        azzera(m);
        int x = auto1.getX();
        int y = auto1.getY();
        m[24-x][y] = 1;
        visualizza(m, 2); 

    }
    
    return 0;
}
