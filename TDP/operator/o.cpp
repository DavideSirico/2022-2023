#include <iostream>
using namespace std;

class A
{
    private:
        int x;
    public:
        A()
        {
            x=0;
        }
        A(int x)
        {
            this->x = x;
        }
        bool operator ==(const A& a)
        {
            if(this->x==a.x)
            {
                return true;
            }
            return false;
        }
        bool operator <(const A& a)
        {
            if(this->x<a.x)
            {
                return true;
            }
            return false;
        }
        A operator +(const A& a)
        {
            A temp;
            temp.x = a.x + this->x;
            return temp;
        }
        friend ostream& operator<<(const A& a,ostream& out);
};

ostream& operator << (const A& a, ostream& out)
{
    out<<a.x;
    return out;
}






int main()
{
    return 0;
}
