class Bottiglie
{
    private int codice;
    private float gradi;
    private String nome;
    public Bottiglie()
    {
        codice = 0;
        gradi = 0;
        nome = "";
    }
    public Bottiglie(int codice, float gradi, String nome)
    {
        this.codice = codice;
        this.gradi = gradi;
        this.nome = nome;
    }
    public int getCodice()
    {
        return codice;
    }
    public float getGradi()
    {
        return gradi;
    }
    public String getNome()
    {
        return nome;
    }
}
