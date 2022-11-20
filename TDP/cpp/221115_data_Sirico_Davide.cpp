/*Scrivi una classe D (data) i cui oggetti possano essere inizializzati come: d(22,08,01); implementare il costruttore, il metodo out() per la stampa a video, il metodo mod(gg,mm,aa) per consentirne la modifica e un metodo val() per consentire la validazione della data. Scrivi inoltre il metodo confronto che dato come parametro un oggetto della classe data restituisca quale delle due date (la data attuale e la data passata come parametro) è maggiore. ( è analogo a scrivere la funzione operator >)*/

#include <iostream>
using namespace std;

class D
{
    private:
        int gg;
        int mm;
        int aa;
    public:
        D(int a, int m, int g)
        {
            gg = g;
            mm = m;
            aa = a;
        }
        void out()
        {
            cout<<aa<<"/"<<mm<<"/"<<gg<<endl;
        }
        void mod(int a, int m, int g)
        {
            gg = g;
            mm = m;
            aa = a;
        }
        bool val()
        {
            int month[12] = {31,28,31,30,31,30,31,31,30,31,30,31};
            if(aa%4==0 || aa%400==0 || aa%100==0)
            {
                month[1]=29;
            }
            for( int i = 0; i < 12; i++)
            {
                if(gg > month[i])
                {
                    return false;
                }
            }
            if(mm>12 || mm<1)
            {
                return false;
            }
            if(aa<0)
            {
                return false;
            }
            return true;
        }
        D confronto(D a, D b)
        {
            if(a.aa>b.aa)
            {
                return a;
            }
            else if(a.aa<b.aa)
            {
                return b;
            }
            else
            {
                if(a.mm>b.mm)
                {
                    return a;
                }
                else if(a.mm<b.mm)
                {
                    return b;
                }
                else
                {
                    if(a.gg>b.gg)
                    {
                        return a;
                    }
                    else if(a.gg<b.gg)
                    {
                        return b;
                    }
                    else
                    {
                        return a;
                    }
                }
            }
        }
};

int main()
{
    D d1(22,8,1);
    D d2(22,8,1);
    d1.out();
    d2.out();
    d1.mod(22,8,2);
    d2.mod(24,2,29);
    d1.out();
    d2.out();
    cout<<d1.val()<<endl;
    cout<<d2.val()<<endl;
    d1.confronto(d1,d2).out();

    return 0;
}