#include <Wire.h>

#define POTENTIOMETER_PIN A0
#define BUTTON_PIN 4

int MotorState = 0;
int buttonOld = 1;
int buttonNew;


void setup()
{
  Serial.begin(9600);
  pinMode(BUTTON_PIN, INPUT_PULLUP);
  Wire.begin();
}

void loop()
{
  Wire.beginTransmission(4);

  int potenziometro = analogRead(POTENTIOMETER_PIN);
  buttonNew=digitalRead(BUTTON_PIN);

  if(buttonOld==0 && buttonNew==1){
    if (MotorState==0){
      MotorState=1;
    }
    else{
      MotorState=0;
    }
  }
  buttonOld = buttonNew;

  Wire.write(potenziometro/4);
  Wire.write(MotorState);

  Serial.print("Potenziometro: ");
  Serial.println(potenziometro);
  Serial.print("LedState: ");
  Serial.println(MotorState);
  
  Wire.endTransmission();

  delay(100);
}