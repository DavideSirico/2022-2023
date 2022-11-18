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
        void input(int N){
            cout<<"Inserire stringa "<<N+1<<": ";
            cin>>str[N];
        }

        string to_string(){
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
};


int main(){
    Test test0 = Test(5);

    for(int i=0;i<5;i++){
        test0.input(i);
    }
    test0.sort();
    cout<<test0.to_string();
    return 0;

}
