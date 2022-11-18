/*
 * Scrivi un programma c++ che all'interno di una classe chiamata Test, definisca un array di stringhe statico.
 * Il programma tramite un costruttore (con numElem come paramentro) deve leggere da input l'array di stringhe e 
 * fare l'ordinamento decrescente.
 */
#include <iostream>
#include <string>
using namespace std;

class Test{
    private:
        string* str;
        int numElem;
    public:
        Test(int numElem){
            this->numElem = numElem;
            str = new string[numElem];
        }
        void inserisci_stringa(int i){
            cout << "Inserisci la stringa " << i << ": ";
            cin >> str[i];
        }
        void sort(){
            string temp;
            for(int i = 0; i < numElem; i++){
                for(int j = i + 1; j < numElem; j++){
                    if(str[i] < str[j]){
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                }
            }
        }
        string toString(){
            string s = "";
            for(int i=0; i<numElem; i++){
                s += str[i] + " ";
            }
            return s;
        }
        ~Test(){
            delete[] str;
        }
};

int main(){
    int N;
    cout<<"Inserisci il numero di stringhe da inserire: ";
    cin>>N;
    Test test = Test(N);

    for(int i=0; i<N; i++){
        test.inserisci_stringa(i);
    }
    test.sort();
    cout << test.toString();
    return 0;
}
