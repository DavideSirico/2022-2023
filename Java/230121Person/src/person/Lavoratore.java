package person;
public class Lavoratore extends Person{
    private float stipendio;

    public Lavoratore() {
        super();
        stipendio = 0;
    }

    public Lavoratore(String name, int birthDate, float stipendio) {
        super(name, birthDate);
        this.stipendio = stipendio;
    }

    public float getStipendio() {
        return stipendio;
    }

    public void setStipendio(float stipendio) {
        this.stipendio = stipendio;
    }
}
