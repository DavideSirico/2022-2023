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
  pinMode(2, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
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
  if(LEDState == 1) {
    analogWrite(MOTORCONTROL, potenziometro/4);
  } else {
    analogWrite(MOTORCONTROL, 0);
  }

  if(LEDState == 0)
  {
    digitalWrite(2,LOW);
    digitalWrite(5,LOW);
    digitalWrite(6,LOW);
    digitalWrite(7,LOW);
    digitalWrite(8,LOW);
    digitalWrite(9,LOW);
    digitalWrite(10,LOW);
    digitalWrite(11,LOW);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);    
  } else {

  if(potenziometro>0 && potenziometro <=100)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,LOW);
    digitalWrite(6,LOW);
    digitalWrite(7,LOW);
    digitalWrite(8,LOW);
    digitalWrite(9,LOW);
    digitalWrite(10,LOW);
    digitalWrite(11,LOW);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);
  }
  if(potenziometro>100 && potenziometro <=200)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,LOW);
    digitalWrite(7,LOW);
    digitalWrite(8,LOW);
    digitalWrite(9,LOW);
    digitalWrite(10,LOW);
    digitalWrite(11,LOW);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);
  }
  if(potenziometro>200 && potenziometro <=300)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,HIGH);
    digitalWrite(7,LOW);
    digitalWrite(8,LOW);
    digitalWrite(9,LOW);
    digitalWrite(10,LOW);
    digitalWrite(11,LOW);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);
  }
  if(potenziometro>300 && potenziometro <=400)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,HIGH);
    digitalWrite(7,HIGH);
    digitalWrite(8,LOW);
    digitalWrite(9,LOW);
    digitalWrite(10,LOW);
    digitalWrite(11,LOW);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);
  }
  if(potenziometro>400 && potenziometro <=500)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,HIGH);
    digitalWrite(7,HIGH);
    digitalWrite(8,HIGH);
    digitalWrite(9,LOW);
    digitalWrite(10,LOW);
    digitalWrite(11,LOW);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);
  }
  if(potenziometro>500 && potenziometro <=600)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,HIGH);
    digitalWrite(7,HIGH);
    digitalWrite(8,HIGH);
    digitalWrite(9,HIGH);
    digitalWrite(10,LOW);
    digitalWrite(11,LOW);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);
  }
  if(potenziometro>600 && potenziometro <=700)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,HIGH);
    digitalWrite(7,HIGH);
    digitalWrite(8,HIGH);
    digitalWrite(9,HIGH);
    digitalWrite(10,HIGH);
    digitalWrite(11,LOW);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);
  }
  if(potenziometro>700 && potenziometro <=800)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,HIGH);
    digitalWrite(7,HIGH);
    digitalWrite(8,HIGH);
    digitalWrite(9,HIGH);
    digitalWrite(10,HIGH);
    digitalWrite(11,HIGH);
    digitalWrite(12,LOW);
    digitalWrite(13,LOW);
  }
  if(potenziometro>800 && potenziometro <=900)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,HIGH);
    digitalWrite(7,HIGH);
    digitalWrite(8,HIGH);
    digitalWrite(9,HIGH);
    digitalWrite(10,HIGH);
    digitalWrite(11,HIGH);
    digitalWrite(12,HIGH);
    digitalWrite(13,LOW);
  }
  if(potenziometro>900 && potenziometro <=1024)
  {
    digitalWrite(2,HIGH);
    digitalWrite(5,HIGH);
    digitalWrite(6,HIGH);
    digitalWrite(7,HIGH);
    digitalWrite(8,HIGH);
    digitalWrite(9,HIGH);
    digitalWrite(10,HIGH);
    digitalWrite(11,HIGH);
    digitalWrite(12,HIGH);
    digitalWrite(13,HIGH);
  }
  }

  delay(100);
}