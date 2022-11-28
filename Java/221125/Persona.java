class Persona
{
    private int id;
    private String cognome;
    private String nome;
    private int eta;
    
    public Persona()
    {
        id = 0;
        eta = 0;
        cognome = "";
        nome = "";
    }
    public Persona(int id, String cognome, String nome, int eta)
    {
        this.id = id;
        this.cognome = cognome;
        this.nome = nome;
        this.eta = eta;
    }

    public int getId()
    {
        return this.id;
    }
    public int getEta()
    {
        return this.eta;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getCognome()
    {
        return this.cognome;
    }

}
