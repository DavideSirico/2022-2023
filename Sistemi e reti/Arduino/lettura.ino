void setup(){
    Serial.begin(9600);
}

void loop(){
    char carattere;
    if(Serial.avariable() > 0){
        carattere = Serial.read();
    }
} 
