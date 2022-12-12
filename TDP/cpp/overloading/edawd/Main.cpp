
/*
 * - definire un array di 10 moto. Ogni moto presenta: 
 *  1. Id (numero casuale tra 1 e 10.000);
 *  2. Modello (formato da A + l'indice dell'array);
 *  3. Cilindrata (numero casuale da 0 a 2) -> (0 = 125, 1 = 600, 2=750);
 *  4. Motorizzazione (numero casuale da 0 a 2) -> (0 = due_tempi, 
 *     1 = quattro_tempi, 2 = elettrica)
 *
 * Stampare tutti gli elementi tramite << ridefinita
 * 
 * - definire un array di 10 scooter. Ogni moto presenta:
 *  1. Gli stessi elementi della prima parte con l'array di moto;
 *  2. Bauletto (numero casuale da 0 a 3) -> (0 = grande, 1 = medio, 
 *     2 = piccolo, 3 = assente)
 * 
 * Stampare solo gli elementi che presentano il bauletto "piccolo" tramite << ridefinita
 * 
 * - definire un array di 10 strada. Ogni moto presenta:
 *  1. Gli stessi elementi della prima parte con l'array di moto;
 *  2. Carena (numero casuale da 0 a 3) -> (0 = semicarena, 1 = cupolino, 
 *     2 = integrale, 3 = naked)
 * 
 * Stampare solo gli elementi che presentano la carena "semicarena" 
 * tramite << ridefinita
 */

#include <iostream>
#include <fstream>
#include <cstdlib>
#include <ctime>

#include "Moto.h"
#include "Scooter.h"
#include "Strada.h"

using namespace std;

#define DIM 10

int main(void)
{
    Moto moto[DIM];
    Scooter scooter[DIM];
    Strada strada[DIM];

    srand(time(NULL));

    // inizializzazione vettori di oggetti
    int id;
    string modello;
    tipo_cilindrata cc;
    tipo_motorizzazione motorizzazione;
    tipo_bauletto bauletto;
    tipo_carena carena;
    for(int i = 0; i < DIM; i++)
    {
        // oggetto moto
        id = rand() % 10000 + 1;
        modello = "A+" + to_string(i);
        cc = rand() % 3;
        motorizzazione = rand() % 3;

        moto[i] = Moto(id, modello, cc, motorizzazione);

        // oggetto scooter
        id = rand() % 10000 + 1;
        modello = "B+" + to_string(i);
        cc = rand() % 3;
        motorizzazione = rand() % 3;
        bauletto = rand() % 3;

        scooter[i] = Scooter(id, modello, cc, motorizzazione, bauletto);

        // oggetto strada
        // oggetto scooter
        id = rand() % 10000 + 1;
        modello = "C+" + to_string(i);
        cc = rand() % 3;
        motorizzazione = rand() % 3;
        carena = rand() % 3;

        strada[i] = Strada(id, modello, cc, motorizzazione, carena);
    }
    
    for(int i = 0; i < DIM; i++)
    {
        cout << moto[i] << endl;
        cout << scooter[i] << endl;
        cout << strada[i] << endl;
    }

    return 0;
}
