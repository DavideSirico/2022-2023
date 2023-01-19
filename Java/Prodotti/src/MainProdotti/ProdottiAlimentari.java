package MainProdotti;

public class ProdottiAlimentari extends Prodotti{
    private int dataScadenza;

    public ProdottiAlimentari(int dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public ProdottiAlimentari(int dataScadenza, float prezzo, String descrizione) {
        super(prezzo, descrizione);
        this.dataScadenza = dataScadenza;
    }

    public ProdottiAlimentari()
    {
        this.dataScadenza = 0;
    }

    public int getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(int dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
    
}
