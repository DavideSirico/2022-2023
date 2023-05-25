#include <SPI.h>      //the communication interface with the modem
#include "RF24.h"     //the library which helps us to control the radio modem (nRF24L)

RF24 radio(8,7);

const uint64_t pipe = 0xE8E8F0F0E1LL; //the address of the modem, that will receive data from Arduino.
int data[4];
int ctrKill = 0;

bool isKill;
bool wasKill = true;
bool addCtr = false;

void setup(){
    Serial.begin(9600);
    pinMode(9, OUTPUT);
    pinMode(A0, OUTPUT);
    radio.begin();                    //it activates the modem.
    radio.openReadingPipe(1, pipe);   //determines the address of our modem which receive data.
    radio.startListening();           //enable receiving data via modem
}

void loop(){
    if(radio.available()){
        radio.read(data, sizeof(data));

        medio = data[0];
        indice = data[1];
        pollice = data[2];
        anulare = data[3];

        // visualizza i valori
        Serial.print("Medio: ");
        Serial.print(medio);
        Serial.print("\tIndice: ");
        Serial.print(indice);
        Serial.print("\tPollice: ");
        Serial.print(pollice);
        Serial.print("\tAnulare: ");
        Serial.print(anulare);
        Serial.print("\n");

        //aggiungi kill

        
        if((indice <= 700 && pollice <= 700) && medio >= 1020) {
            isKill = true;   
        }
        if(wasKill==false && isKill==true){
            addCtr=true;
        }
        wasKill=isKill;

        if(addCtr) {
            ctrKill++;
            digitalWrite(9, HIGH);
            delay(500);
            digitalWrite(9, LOW);
            Serial.print("\tctr: ");
            Serial.print(ctrKill);
            Serial.print("\n");
            addCtr=false;
        }
        

        //visualizza kill
        if((pollice <= 700 && medio <= 700) && indice >= 700){
            for(int i = 0; i < ctrKill/3;i++){
                Serial.print(ctrKill/3);
                digitalWrite(9, HIGH);
                delay(300);
                digitalWrite(9, LOW);
                delay(300);
            }
        }

        //stop
        if(pollice<= 500 && medio<=500 && indice<=500){
            digitalWrite(A0, HIGH);
            delay(200);
            digitalWrite(A0, LOW);
            delay(200);
            digitalWrite(A0, HIGH);
            delay(200);
            digitalWrite(A0, LOW);
            delay(200);
        }
    } else {
        Serial.println("Errore nella connessione ");
    }
}
