#include <iostream>
#include <string>
using namespace std;

class Test{
    private:
        int numElem;
        string *str;
    public:
        Test(int numElem){
            this->numElem=numElem;
            this->str = new string[numElem];
        }
        Test(const Test &t){
            numElem = t.numElem;
            str = new string[numElem];
            for(int i=0;i<numElem;i++){
                str[i] = t.str[i];
            }
        }
        void input(int N){
            cout<<"Inserire stringa "<<N+1<<": ";
            cin>>str[N];
        }

        string toString(){
            string temp;
            temp = "";
            for(int i=0;i<numElem;i++){
                temp+=str[i]+"\n";
            }
            return temp;
        }

        void sort(){
            string temp;
            for(int i=0;i<numElem-1;i++){
                for(int j=i+1;j<numElem;j++){
                    if(str[i].compare(str[j])<0){
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;    
                    }
                }
            }
        }
        void rimuoviVocali(){
            string vocali="aeiouAEIOU";
            int index;
            for(int i=0;i<numElem;i++){
                for(int j=0;j<vocali.length();j++){
                    do{
                        index=str[i].find(vocali.at(j));
                        if(index!=-1){
                            str[i].erase(index,1);
                        }
                    }while(index!=-1);
                }
            }
        }
        void rimuoviConsonanti(){
            string consonanti="qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
            int index;
            for(int i=0;i<numElem;i++){
                for(int j=0;j<consonanti.length();j++){
                    do{
                        index=str[i].find(consonanti.at(j));
                        if(index!=-1){
                            str[i].erase(index,1);
                        }     
                    }while(index!=-1);
                }
            }
        }
        int contaLunghezza(){
            int c=0;
            for(int i=0;i<numElem;i++){
                c+=str[i].length();
            }
            return c;
        }
};


int main(){
    Test test0 = Test(5);

    for(int i=0;i<5;i++){
        test0.input(i);
    }
    Test test1 = Test(test0);
    test0.rimuoviVocali();
    test1.rimuoviConsonanti();
    test0.sort();
    test1.sort();
    cout<<test0.toString()<<endl;
    cout<<test1.toString()<<endl;
    if(test0.contaLunghezza()>test1.contaLunghezza()){
        cout<<"Ci sono piu' lettere in test0";
    } else {
        cout<<"Ci sono piu' lettere in test1";
    }
    return 0;

}
