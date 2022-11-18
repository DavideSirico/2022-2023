void setup(){
    priMode(13, OUTPUT);
    Serial.begin(9600);
    Serial.println("Inizio\n");
}

void loop(){
    Serial.println("Accendo");
    digitalWrite(13,HIGH);
    delay(500);
    Serial.println("Spengo");
    digitalWrite(13,LOW);
    delay(200);
}