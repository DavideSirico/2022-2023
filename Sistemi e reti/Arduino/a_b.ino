void setup(){
    Serial.begin(9600);
}

void loop(){
    char carattere;
    if(Serial.available()>0){
        carattere=Serial.read();
        if(carattere=='a'){
            digitalWrite(13,HIGH);
            delay(2000);
            digitalWrite(13,LOW);
            Serial.print("b\n");
        }
    }
}
