/*
 * Data una classe Moto definire come attributi:
 *  - un codice di identificazione (int);
 *  - il modello (string);
 *  - la cilindrata (int);
 *  - il tipo di motorizzazione (string);
 */

#ifndef MOTO
#define MOTO

  #include <iostream>
  #include <string>

  typedef u_char tipo_motorizzazione;

  #define DUE_TEMPI 0
  #define QUATTRO_TEMPI 1
  #define ELETTRICA 2

  typedef u_char tipo_cilindrata;
  #define CENTO_VENTI_CINQUE 0
  #define SEICENTO 1
  #define SETTECENTO_CINQUANTA 2
 
  class Moto {
  public:
      Moto();
      Moto(int id, std::string modello, tipo_cilindrata cilindrata, tipo_motorizzazione motorizzazione);
      friend std::ostream& operator<<(std::ostream& out, const Moto& moto);
  protected:
      int id;
      std::string modello;
      tipo_cilindrata cilindrata;
      tipo_motorizzazione motorizzazione;
  };

#endif