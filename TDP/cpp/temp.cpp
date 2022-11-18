#include<iostream>
#include<cstdlib>
#include<bits/stdc++.h>

using namespace std;

class temp{
    private:
        int a;
    public:
        temp(){
            a = 0;
        }
        temp(int x){
            a = x;
        }
        void show(){
            cout << a << endl;
        }
        void modify(int x){
            a = x;
        }
        char* toString(){
            char *str = new char[10];
            sprintf(str, "%d", a);
            return str;
        }
};



int main(){
    FILE *fp;
    fp=fopen("temp.txt","w");
    temp t1 = temp(10);
    int *prova = (int*)malloc(0);
    prova[0] = 1;
    prova[1] = 2;
    prova[2] = 3;
    prova[10] = 5;
    
    printf("%d\n", prova[0]);
    printf("%d\n", prova[1]);
    printf("%d\n", prova[2]);
    printf("%d\n", prova[10]);
    printf("%s\n", t1.toString());
    t1.show();
    t1.modify(20);
    t1.show();

    free(prova);
    return 0;
}
