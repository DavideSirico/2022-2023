package overloading;
public class Persona {
    private String cognome;
    private int anni;
    Persona()
    {
        anni = 0;
        cognome = "";
    }
    void setDati(String cognome, int anni)
    {
        this.cognome = cognome;
        this.anni = anni;
    }
    void setDati(int anni, String cognome)
    {
        this.anni = anni;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persona{" + "cognome=" + cognome + ", anni=" + anni + '}';
    }
}
