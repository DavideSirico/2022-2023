/*
1)Classe Contatore
Scrivi un programma C++ che implementi un contatore.

Un contatore è una variabile intera che può essere incrementata e decrementata di uno con due funzioni incrementa() e decrementa().
Scrivi anche una opportuna funzione toString() che permetta restituire una versione stringa della variabile.

Inoltre, implementa :
- una funzione di confronto tra due contatori,
- diverse funzioni che implementino il pre e il post incremento del contatore.
- una funzione di somma tra contatori.

(puoi utilizzare prima le funzioni base e poi gli “operator” c++)
Infine testa tutto con un opportuno main di prova.

*/

#include <iostream>
using namespace std;

class contatoreV2
{
    private:
        int count;
    public:
        contatoreV2()
        {
            count = 0;
        }
        contatoreV2(int n)
        {
            count = n;
        }

        void operator ++(int)
        {
            count++;
        }
        void operator ++()
        {
            ++count;
        }
        void operator --(int)
        {
            count--;
        }
        void operator --()
        {
            --count;
        }

        contatoreV2& operator +(const contatoreV2 &test)
        {
            this->count=this->count+test.count;
            return *this;
        }
        contatoreV2& operator =(const contatoreV2& test)
        {
            this->count=test.count;
            return *this;
        }

        bool operator<(const contatoreV2& test)
        {
            if(this->count<test.count)
                return true;
            else 
                return false;
        }
        bool operator>(const contatoreV2& test)
        {
            if(this->count>test.count)
                return true;
            else 
                return false;
        }


        string toString(){
            string box = "";
            box = to_string(count);
            return box;
        }
        void decrementa(){
            count--;
        }
        void incrementa(){
            count++;
        }
};

int main(){
    contatoreV2 test(10);
    contatoreV2 test2(5);
    cout<<test.toString()<<endl;
    test++; 
    cout<<test.toString()<<endl;
    test--;
    cout<<test.toString()<<endl;
    test = test2;
    cout<<test.toString()<<endl;
    test = test + test2;
    cout<<test.toString()<<endl;
    ++test;
    if(test>test2)
        cout<<"test è maggiore di test2"<<endl;
    else 
        cout<<"test è minore di test2"<<endl;
    return 0;
}
