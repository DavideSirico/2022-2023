package MainProdotti;

    public class Prodotti {
        protected float prezzo;
        protected String descrizione;
        Prodotti()
        {
            prezzo = 0;
            descrizione = "";
        }
        Prodotti(float prezzo, String descrizione)
        {
            this.prezzo = prezzo;
            this.descrizione = descrizione;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }

        public float getPrezzo() {
            return prezzo;
        }

        public void setPrezzo(float prezzo) {
            this.prezzo = prezzo;
        }
        
                
    }
