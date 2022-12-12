
#ifndef STRADA
#define STRADA

  #include <iostream>
  #include "Moto.h"

  typedef u_char tipo_carena;

  #define SEMICARENA 0
  #define CUPOLINO 1
  #define INTEGRALE 2
  #define NAKED 3

  class Strada : public Moto {
  public:
      Strada();
      Strada(int id, std::string modello, tipo_cilindrata cilindrata, 
             tipo_motorizzazione motorizzazione, tipo_carena catena);
      friend std::ostream& operator<<(std::ostream& out, const Strada& strada);
  private:
      tipo_carena carena;
  };

#endif
