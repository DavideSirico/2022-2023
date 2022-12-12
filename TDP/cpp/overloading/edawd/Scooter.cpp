
#include "Scooter.h"

using namespace std;

Scooter::Scooter() {}

Scooter::Scooter(int id, std::string modello, tipo_cilindrata cilindrata,
                    tipo_motorizzazione motorizzazione, tipo_bauletto bauletto)
                    : Moto(id, modello, cilindrata, motorizzazione)
{
    this->bauletto = bauletto;
}

ostream& operator<<(ostream& out, const Scooter& scooter)
{
    out << "Id: " << scooter.id << endl;
    out << "Modello: " << scooter.modello << endl;
    out << "Cilindrata: " << to_string(scooter.cilindrata) << endl;
    out << "Motorizzazione: " << to_string(scooter.motorizzazione) << endl;
    out << "Bauletto: " << to_string(scooter.bauletto) << endl;
    return out;
}
