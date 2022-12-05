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
            int deltaX = abs(x);
            int deltaY = abs(y);
            int deltaTot = deltaX + deltaY;
            int temp_x = this->x+x;
            int temp_y = this->y+y;

            if(temp_x>DIM-1 || temp_y>DIM-1 || temp_x<0 || temp_y<0)
            {
                return false;
            }

            if(carica<deltaTot)
            {
                return false;
            }

            carica -= deltaTot;
            this->x = temp_x;
            this->y = temp_y;

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
            if(m[i][j]==1)
            {
                cout << "| " << "\033[32m" << "" << "\033[0m";
                // printf("| ");
                // printf("|%2d",m[i][j]);
            } else
            {
                printf("|%2d",m[i][j]);
            }
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
    azzera(m);
    m[24][0] = 1;
    visualizza(m,2);
    while(1)
    {
        cout<<"CARICA: "<<auto1.getCarica()<<endl;
        char dummy;
        cin>>dummy;
        switch(dummy)
        {
            case 'w':
                if(auto1.checkSpostamento(1,0))
                {
                    azzera(m);
                    m[24-(auto1.getX())][auto1.getY()] = 1;
                    visualizza(m,2);
                }
                else
                {
                    cout<<"Non puoi andare in quella direzione"<<endl;
                }
                break;
            case 'a':
                if(auto1.checkSpostamento(0, -1))
                {
                    azzera(m);
                    m[24-(auto1.getX())][auto1.getY()] = 1;
                    visualizza(m,2);
                }
                else
                {
                    cout<<"Non puoi andare in quella direzione"<<endl;
                }
                
                break;
            case 's':
                if(auto1.checkSpostamento(-1, 0))
                {
                    azzera(m);
                    m[24-(auto1.getX())][auto1.getY()] = 1;
                    visualizza(m,2);
                }
                else
                {
                    cout<<"Non puoi andare in quella direzione"<<endl;
                }
                break;
            case 'd':
                if(auto1.checkSpostamento(0, 1))
                {
                    azzera(m);
                    m[24-(auto1.getX())][auto1.getY()] = 1;
                    visualizza(m,2);
                }
                else
                {
                    cout<<"Non puoi andare in quella direzione"<<endl;
                }
                break;
            default:
                cout<<"clank"<<endl;
                break;
        }
    }
    return 0;
}
