#include <iostream>
using namespace std;

class Calcolatrice{
    private:
	int a;
	int b;
	int risultato;
    public:
	Calcolatrice(){
		a = 0;
		b = 0;
	}
	Calcolatrice(int num){
		a = num;
	}
	Calcolatrice(int num1, int num2){
		a = num1;
		b = num2;
	}
	int somma(){
		risultato = a + b;
		return risultato;
	}
	int sottrazione(){
		risultato = a - b;
		return risultato;
	}
	int moltiplicazione(){
		risultato = a * b;
		return risultato;
	}
	int quadrato(){
		risultato = a * a;
		return risultato;
	}
	int cubo(){
		risultato = a * a * a;
		return risultato;
	}
	int incremento(){
		risultato = a + 1;
		return risultato;
	}
	int decremento(){
		risultato = a - 1;
		return risultato;
	}
	char *toString(){
		char *risultato = new char[100];
		sprintf(risultato, "%d", risultato);
		return risultato;
	}
	int getA(){
		return a;
	}
	int getB(){
		return b;
	}
	int getRisultato(){
		return risultato;
	}
};

int main(){
	Calcolatrice calcolatrice=Calcolatrice(5,10);
	cout << "Il quadrato di 5 e': " << calcolatrice.quadrato() << endl;
	cout << "Il cubo di 5 e': " << calcolatrice.cubo() << endl;
	cout << "Il numero incrementato di 1 e': " << calcolatrice.incremento() << endl;
	cout << "Il numero decrementato di 1 e': " << calcolatrice.decremento() << endl;
	cout << "La somma di 5 e 10 e': " << calcolatrice.somma() << endl;
	
	return 0;
}
