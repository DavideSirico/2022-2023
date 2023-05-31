#include <Wire.h>
#define MOTORCONTROL 6

void setup()
{
  Wire.begin(4);
  Serial.begin(9600);
  Wire.onReceive(receiveEvent);
  pinMode(MOTORCONTROL, OUTPUT);
}

void loop()
{
  delay(100);
}

void receiveEvent(int howMany)
{
  int potenziometro = Wire.read();
  int MotorState = Wire.read();
  Serial.print("Potenziometro: ");
  Serial.println(potenziometro);
  Serial.print("LedState: ");
  Serial.println(MotorState);
  
  if(MotorState)
  {
    analogWrite(MOTORCONTROL, potenziometro);
  } else 
  {
    analogWrite(MOTORCONTROL, 0);
  }
}