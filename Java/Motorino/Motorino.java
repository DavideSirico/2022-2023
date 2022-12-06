class Motorino
{
    private String colore;
    private float velocita;
    private String tipo;
    private boolean antifurto;

    Motorino(String colore, String tipo, float velocita)
    {
        this.colore = colore;
        this.tipo = tipo;
        this.antifurto = false;
        this.velocita = velocita;
    }
    public float getVelocita()
    {
        return velocita;
    }
    public void accelera(float accelerazione)
    {
        if(antifurto)
            velocita = velocita + accelerazione;
    }
    public void inserisciAntifurto()
    {
        antifurto = true;
    }
}
