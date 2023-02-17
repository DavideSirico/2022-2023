package dataentry;
public class Persona {
    private int reddito;
    private String cognome;
    private String nome;
    private int eta;

    public Persona() {
    }
    
    public Persona(int reddito, String cognome, String nome, int eta) {
        this.reddito = reddito;
        this.cognome = cognome;
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona{" + "reddito=" + reddito + ", cognome=" + cognome + ", nome=" + nome + ", eta=" + eta + '}';
    }

    public int getReddito() {
        return reddito;
    }

    public void setReddito(int reddito) {
        this.reddito = reddito;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    

    
    
}
