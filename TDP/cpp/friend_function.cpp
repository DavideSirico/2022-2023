#include <iostream>
// using namespace std;

class Point
{
    private:
        int x;
        int y;
    public:
        Point();
        Point(int x, int y)
        {
            this->x = x;
            this->y = y;
        }
        friend Point operator+(const Point& p1, const Point& p2);
        bool operator==(const Point& p1)
        {
            if(this->x == p1.x && this->y == p1.y)
                return true;
             else 
                return false;
        }
};

Point operator+(const Point& p1, const Point& p2)
{
    Point temp=Point(0,0);
    temp.x = p1.x + p2.x;
    temp.y = p1.y + p2.y;
    return temp;
}

int main()
{
    Point temp1=Point(4,4);
    Point temp2=Point(4,4);
    if(temp1==temp2)
        std::cout<<"Sono uguali"<<std::endl;
    else
        std::cout<<"Sono diversi"<<std::endl;
    return 0;
}