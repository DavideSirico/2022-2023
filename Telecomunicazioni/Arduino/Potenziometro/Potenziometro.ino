#define POTENTIOMETER_PIN A0
#define BUTTON_PIN 4
#define MOTORCONTROL 3

int LEDState = 0;
int LEDPin=8;
int buttonPin=12;
int buttonNew;
int buttonOld=1;

void setup() 
{
  Serial.begin(9600);
  pinMode(BUTTON_PIN, INPUT_PULLUP);
  pinMode(MOTORCONTROL, OUTPUT);
}

void loop()
{
  Serial.print("Bottone: ");
  Serial.println(digitalRead(BUTTON_PIN));

  Serial.print("Potenziometro: ");
  Serial.println(analogRead(POTENTIOMETER_PIN));

  int potenziometro = analogRead(POTENTIOMETER_PIN);


  buttonNew=digitalRead(BUTTON_PIN);
  if(buttonOld==0 && buttonNew==1){
    if (LEDState==0){
      LEDState=1;
    }
    else{
      LEDState=0;
    }
  }
  buttonOld=buttonNew;
  if(LEDState == 1)
  {
    analogWrite(MOTORCONTROL, potenziometro/4);
  } else 
  {
    analogWrite(MOTORCONTROL, 0);
  }
  delay(100);
}