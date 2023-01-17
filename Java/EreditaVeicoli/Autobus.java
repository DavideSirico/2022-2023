public class Autobus extends Veicolo
{
    private int linea;
    Autobus(String propietario, int prezzo, int linea)
    {
        veicolo(propietario,prezzo);
        this.linea = linea;
    }
    int getLinea()
    {
        return linea;
    }
}
