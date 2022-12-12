
#include "Moto.h"

using namespace std;

Moto::Moto() {}

Moto::Moto(int id, string modello, tipo_cilindrata cilindrata, tipo_motorizzazione motorizzazione)
{
    this->id = id;
    this->modello = modello;
    this->cilindrata = cilindrata;
    this->motorizzazione = motorizzazione;
}

// friend operator << to print stuff out
ostream& operator<<(ostream& out, const Moto& moto)
{
    out << "Id: " << moto.id << endl;
    out << "Modello: " << moto.modello << endl;
    out << "Cilindrata: " << to_string(moto.cilindrata) << endl;
    out << "Motorizzazione: " << to_string(moto.motorizzazione) << endl;
    return out;
}
