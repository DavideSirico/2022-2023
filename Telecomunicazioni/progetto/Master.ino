#include <SPI.h>                      //the communication interface with the modem
#include "RF24.h"                     //the library which helps us to control the radio modem

int flexPin1 = A1;
int flexPin2 = A2;
int flexPin3 = A3;
int flexPin4 = A4;

int data[4];

RF24 radio(10,9);                     //10 and 9 are a digital pin numbers to which signals CE and CSN are connected.
                                      
const uint64_t pipe = 0xE8E8F0F0E1LL; //the address of the modem, that will receive data from Arduino.

void setup(void){
    Serial.begin(9600);
    radio.begin();                      //it activates the modem.
    radio.openWritingPipe(pipe);        //sets the address of the receiver to which the program will send data.
}

void loop(){
    //Send signal data
    medio = analogRead(flexPin1); 
    indice = analogRead(flexPin2); 
    pollice = analogRead(flexPin3); 
    anulare = analogRead(flexPin4);
    data[0] = medio;
    data[1] = indice;
    data[2] = pollice;
    data[3] = anulare;
    radio.write(data, sizeof(data));
}