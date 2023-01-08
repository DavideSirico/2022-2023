public class Main
{
    public static void main(String[] args)
    {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Davide", "Sirico", 17);
        p1.stampa();
        p2.compleanno();
        p2.stampa();
    }
}

// Classe
class Persona
{
    // Attributi
    private String nome;
    private String cognome;
    private int eta;
    // Costruttore senza parametri
    Persona()
    {
        nome = "Mario";
        cognome = "Rossi";
        eta = 20;
    }
    // Costruttore con parametri
    Persona(String nome, String cognome, int eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
    // Metodo
    public void compleanno()
    {
        eta++;
    }
    // Metodo
    public void stampa()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Eta: " + eta);
    }
}