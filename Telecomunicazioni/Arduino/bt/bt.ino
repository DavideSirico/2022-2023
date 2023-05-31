#include <SoftwareSerial.h>
#define Rxpin 2 // Tx per Bluetooth Rx per Arduino
#define Txpin 3 // Rx per Bluetooth Tx per Arduino
char  BluetoothBuffer;
char  SerialBuffer;
SoftwareSerial Bluetooth(Rxpin, Txpin);

void setup() {
  Serial.begin(9600);
  Bluetooth.begin(9600);
}

void loop() {
  if (Bluetooth.available() > 0) {
    BluetoothBuffer = Bluetooth.read();
    Serial.print(BluetoothBuffer);
  }
  if (Serial.available() > 0) {
    SerialBuffer = Serial.read();
    Bluetooth.print(SerialBuffer);
  }
}