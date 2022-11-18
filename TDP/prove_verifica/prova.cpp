//1. Struct
//2. malloc
//3. classi
//4. puntatori
//5. file
//6. librerie

#include<iostream>
#include<cstdlib>
using namespace std;
class calcolatrice{
    private:
        int a;
        int b;
        int ris;

    public:
        calcolatrice(int a){
            this->a = a;
            ris = 0;
        }
        calcolatrice(int a,int b){
            this->a = a;
            this->b = b;
            ris = 0;
        }
        
        int somma(){
            ris=a+b;
            return ris;
        }

        int cubo(){
            ris=a*a*a;
            return ris;
        }

        char *toString(){
            char *str=(char*)malloc(10*sizeof(char));
            sprintf(str,"%d",ris);
            return str;
        }
};


int main(){
    calcolatrice c(10,10);
    c.cubo();
    c.somma();
    printf("%s",c.toString());

    int **matrice_di_puntatori;

    matrice_di_puntatori = (int**)malloc(10*sizeof(int*));
    for(int i=0;i<10;i++){
        matrice_di_puntatori[i] = (int*)malloc(10*sizeof(int));
    }
    int counter=1;
    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            matrice_di_puntatori[i][j] = counter;
            counter++;
        }
    }
    
    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            printf("%3d ",matrice_di_puntatori[i][j]);
        }
        printf("\n");
    }
    return 0;
}
