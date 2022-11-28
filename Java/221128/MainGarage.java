/*6>221128_garage.java
Scrivere una classe Auto che rappresenti le seguenti informazioni relative ad un docente: marca(string), modello(string), cilindrata(int) e costo(float), e che contenga il costruttore parametrizzato ed i metodi getMarca, getModello e getCilindrata e  getCosto che restituiscono rispettivamente i campi privati.
Usare poi una variabile boolean a piacere.
Scrivere poi una classe Garage, che rappresenti un insieme di automobili tramite un array di tipo Auto, e che contenga il costruttore parametrizzato ed un metodo costoMinimo che restituisce il costo minimo tra le varie vetture.*/

class MainGarage
{
    public static void main(String[] args)
    {
        Garage garage = new Garage(5);
        

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Auto "+garage.getCostoMinimo());
        }
    }
}
