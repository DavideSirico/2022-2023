/*
6>221128_garage.java
Scrivere una classe Auto che rappresenti le seguenti informazioni relative ad un docente: marca(string), modello(string), cilindrata(int) e costo(float), e che contenga il costruttore parametrizzato ed i metodi getMarca, getModello e getCilindrata e  getCosto che restituiscono rispettivamente i campi privati.
Usare poi una variabile boolean a piacere.
Scrivere poi una classe Garage, che rappresenti un insieme di automobili tramite un array di tipo Auto, e che contenga il costruttore parametrizzato ed un metodo costoMinimo che restituisce il costo minimo tra le varie vetture.*/

class Auto
{
    private String marca;
    private String modello;
    private int cilindrata;
    private float costo;
    private boolean manuale;
    
    Auto()
    {
        marca = "";
        modello = "";
        cilindrata = 0;
        costo = 0;
        manuale = false;
    }
    Auto(String marca, String modello, int cilindrata, float costo, boolean manuale)
    {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.costo = costo;
        this.manuale = manuale;
    }
    public String getMarca()
    {
        return marca;
    }
    public String getModello()
    {
        return modello;
    }
    public int getCilindrata()
    {
        return cilindrata;
    }
    public float getCosto()
    {
        return costo;
    }
    public boolean getManuale()
    {
        return manuale;
    }
}
