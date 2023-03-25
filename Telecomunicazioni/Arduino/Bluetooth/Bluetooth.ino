char  buttonOld;
char  SerialBuffer;
int LEDState;
#define LED_PIN 13

void setup() {
  Serial.begin(9600);
  pinMode(LED_PIN, OUTPUT);
}

void loop() {
  SerialBuffer = Serial.read();
  
  if(SerialBuffer == '0')
  {
    Serial.write("acceso");
    digitalWrite(LED_PIN, HIGH);
  }
  if(SerialBuffer == '1')
  {
    Serial.write("spento");
    digitalWrite(LED_PIN, LOW);
  }
}