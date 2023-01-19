package MainProdotti;
public class ProdottiNonAlimentari extends Prodotti{
    private String materiale;

    public ProdottiNonAlimentari(String materiale) {
        this.materiale = materiale;
    }
    public ProdottiNonAlimentari() {
        this.materiale = "";
    }
    public ProdottiNonAlimentari(String materiale, float prezzo, String descrizione) {
        super(prezzo, descrizione);
        this.materiale = materiale;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }
    
    public void applicaSconto()
    {
        this.prezzo = this.prezzo / 100 * 95;
    }
    
}
