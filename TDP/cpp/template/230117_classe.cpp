#include <iostream>
using namespace std;

template <class T>
class Punto
{
    private:
        T x,y;
    public:
        Punto(){};
        Punto(T x, T y)
        {
            this->x = x;
            this->y = y;
        }
        void setPunto(T a, T b)
        {
            x = a;
            y = b;
        }
        void stampaPunto()
        {
            cout<<"X: " << x << "\nY: " << y << endl;
        }
};

int main()
{
    Punto <int> pt1(10,5);
    pt1.stampaPunto();
    
    Punto <float> pt2(12.5,2.21);
    pt2.stampaPunto();
    return 0;
}
