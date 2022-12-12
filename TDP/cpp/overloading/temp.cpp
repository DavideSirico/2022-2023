#include <iostream>
using namespace std;

class Contatore
{
    private:
        int x;
    public:
        Contatore()
        {
            x = 0;
        }
        Contatore(int x)
        {
            this->x = x;
        }
        Contatore(const Contatore& c)
        {
            this->x = c.x;
        }
        friend ostream& operator << (ostream &out, const Contatore& c);
        friend istream& operator >> (istream &in, Contatore& c);
        Contatore& operator + (const Contatore& c1)
        {
            this->x = this->x + c1.x;
            // dummy.x = this->x + c1.x;
            // return dummy;
            return *this;
        }
        /*void operator++(int)
        {
            this->x++;
        }
        void operator++()
        {
            ++this->x;
        }*/
        




        Contatore operator++(int)
        {
            Contatore old = *this;
            x++;
            return old;
        }
        Contatore& operator++()
        {
            x++;
            return *this;
        }

};

ostream& operator << (ostream &out, const Contatore& c)
{
    out<<c.x;
    return out;
}
istream& operator >> (istream &in, Contatore& c)
{
    in>>c.x;
    return in;
}


int main()
{
    Contatore c1(2),c2(3),c3(4),som,c4;
    Contatore *c = new Contatore();
    som = c1 + c2 + c3;
    cin>>c4;
    /*c4++;
    ++c4;*/
    int x = 5;
    cout<<x++;

    return 0;
}