/*8>221205_clock.java
Scrivere una classe Orologio per simulare il comportamento di un orologio. La classe contiene un costruttore parametrizzato con tre argomenti (ore, min, sec) e uno di default settato a 00:00:00. Possiede inoltre un metodo public che incrementa i secondi (potrebbe far scattare i minuti), uno che incrementa i minuti (potrebbe far scattare le ore) e uno che incrementa le ore(non fa scattare nulla dopo 23 riparte 00 - non esiste un metodo per tornare indietro). Infine un metodo che stampa l'ora. 
(NB: si ricorda che non esiste 60 per ore, min, sec ma [0..59])*/

class MainOrologio
{
    public static void main(String[] args)
    {
        Orologio o = new Orologio(22,59,59);
        o.stampa();
        
        o.incSecondi();

        o.stampa();
    }
}
