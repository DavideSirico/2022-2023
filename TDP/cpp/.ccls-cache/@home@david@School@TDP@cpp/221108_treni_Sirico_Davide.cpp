/*2) Creare un treno in cui il numero di vagoni e il numero massimo di viaggiatori per vagone siano scelti dall’utente e per 5 volte far chiedere all’utente quanti viaggiatori salgono o scendono e memorizzare il numero di viaggiatori presenti nel treno (controllare che non superino i numero massimo di passeggeri o che il numero di passeggeri sul treno diventi negativo)

Dopo le 5 volte stampare il numero totale di viaggiatori presenti sul treno e il numero medio di viaggiatori per vagone.*/
#include <iostream>
#include <string>
#include <cstdio>
using namespace std;


class Treno{
    private:
        int numeroVagoni;
        int maxPersonePerVagone;
        int passeggeriTotali;
        
        int maxPasseggeri(){
            return numeroVagoni*maxPersonePerVagone;
        }
    public:
        Treno(const int numeroVagoni, const int maxPersonePerVagone){
            this->passeggeriTotali=0;
            this->maxPersonePerVagone=maxPersonePerVagone;
            this->numeroVagoni=numeroVagoni;
        }
        Treno(const Treno& treno){
            this->passeggeriTotali=treno.passeggeriTotali;
            this->maxPersonePerVagone=treno.maxPersonePerVagone;
            this->numeroVagoni=treno.numeroVagoni;
        }
        
        void stop(const int saliti, const int scesi){
            int tot = passeggeriTotali+saliti-scesi;
            if(tot<0 || tot>maxPasseggeri()){
                return;
            }
            passeggeriTotali=tot;
        }
    
        int get_numeroVagoni(){
            return numeroVagoni;
        }
        void set_numeroVagoni(const int N){
            numeroVagoni=N;
        }

        int get_maxPersonePerVagone(){
            return maxPersonePerVagone;
        }
        void set_maxPersonePerVagone(const int N){
            maxPersonePerVagone=N;
        }

        string to_string(){
            string temp;
            temp = "Numero di vagoni: " + ::to_string(numeroVagoni) + "\nNumero massimo di passggeri per vagone:" + ::to_string(maxPersonePerVagone) + "\nNumero di passeggeri sul treno:" + ::to_string(passeggeriTotali) + " \n";
            return temp;
        }
};



int main(){
    int numeroVagoni, personeMax;
    int passeggeriSaliti, passeggeriScesi;

    cout<<"Inserire numero di vagoni: ";
    cin>>numeroVagoni;
    cout<<"Inserire numero di viaggiatori massimi per vagone: ";
    cin>>personeMax;

    Treno treno(numeroVagoni, personeMax);

    for(int i = 0; i < 5; i++){
        cout<<"Passeggeri saliti: ";
        cin>>passeggeriSaliti;
        
        cout<<"Passeggeri scesi: ";
        cin>>passeggeriScesi;
        
        treno.stop(passeggeriSaliti, passeggeriScesi);
        cout<<treno.to_string()<<endl;
    }

    return 0;
}
