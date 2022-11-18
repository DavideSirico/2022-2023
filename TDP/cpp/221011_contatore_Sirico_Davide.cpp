//Contatore
//-count: Int
//------------
//+Contatore(): Void //Costruttore (senza parametri)
//+Contatore(Int): Void //Costruttore (con parametri)
//+incrementa(): Void
//+decrementa(): Void
//+getCount(): Int
//+toString(): String
#include <iostream>
using namespace std;
class Contatore{
	private:
		int count;
	public:
		Contatore(){
			count=0;
		}
		Contatore(int c){
			count=c;
		}
		void incrementa(){
			count++;
		}
		void decrementa(){
			count--;
		}
		int getCount(){
			return count;
		}
		char *toString(){
			char *s=new char[15];
			sprintf(s,"%d",count);
			return s;
		}
};
	
int main(){
	int a,b;
	cout<<"Inserisci il valore di a: ";
	cin>>a;
	cin.ignore();
	cout<<"Inserisci il valore di b: ";
	cin>>b;
	cin.ignore();
	Contatore c=Contatore(a);
	for(int i=0;i<100;i++){
		c.incrementa();
	}
	cout << "Il valore di c e': " << c.toString() << endl;
	return 0;
}

