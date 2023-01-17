public class Veicolo
{
    private String propietario;
    private int prezzo;
    Veicolo(String propietario, int prezzo)
    {
        this.propietario = propietario;
        this.prezzo = prezzo;
    }
    String GetPropietario()
    {
        return propietario;
    }
    int GetPrezzo()
    {
        return prezzo;
    }
}
