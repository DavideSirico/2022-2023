public class Automobile extends Veicolo 
{
    private String optional;
    private String alimentazione;
    Automobile(String optional, String alimentazione)
    {
         this.optional = optional;
         this.alimentazione = alimentazione;
    }
    String getOptional()
    {
        return optional;
    }
    String getAlimentazio()
    {
        return alimentazione;
    }

}
