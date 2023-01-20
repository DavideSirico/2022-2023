public class Autobus extends Veicolo
{
    private int linea;
    Autobus()
    {
        linea = 0;
    };
    Autobus(String propietario, int prezzo, int linea)
    {
        super(propietario,prezzo);
        this.linea = linea;
    }
    int getLinea()
    {
        return linea;
    }
}
