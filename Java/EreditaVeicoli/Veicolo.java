public class Veicolo
{
    private String propietario;
    private int prezzo;
    Veicolo()
    {
        propietario = "";
        prezzo = 0;
    }
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
