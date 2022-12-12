g++ -c Main.cpp
g++ -c Moto.cpp
g++ -c Scooter.cpp
g++ -c Strada.cpp

g++ Main.o Moto.o Scooter.o Strada.o -o moto

./moto
