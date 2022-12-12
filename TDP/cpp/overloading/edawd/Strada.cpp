
#include "Strada.h"

using namespace std;

Strada::Strada() {}

Strada::Strada(int id, string modello, tipo_cilindrata cilindrata, tipo_motorizzazione motorizzazione, 
                tipo_carena carena) : Moto(id, modello, cilindrata, motorizzazione)
{
    this->carena = carena;
}

ostream& operator<<(ostream& out, const Strada& strada)
{
    out << "Id: " << strada.id << endl;
    out << "Modello: " << strada.modello << endl;
    out << "Cilindrata: " << to_string(strada.cilindrata) << endl;
    out << "Motorizzazione: " << to_string(strada.motorizzazione) << endl;
    out << "Tipo catena: " << to_string(strada.carena) << endl;
    return out;
}
