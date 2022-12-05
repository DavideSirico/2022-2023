/*
8>221205_clock.java
Scrivere una classe Orologio per simulare il comportamento di un orologio. La classe contiene un costruttore parametrizzato con tre argomenti (ore, min, sec) e uno di default settato a 00:00:00. Possiede inoltre un metodo public che incrementa i secondi (potrebbe far scattare i minuti), uno che incrementa i minuti (potrebbe far scattare le ore) e uno che incrementa le ore(non fa scattare nulla dopo 23 riparte 00 - non esiste un metodo per tornare indietro). Infine un metodo che stampa l'ora. 
(NB: si ricorda che non esiste 60 per ore, min, sec ma [0..59])*/

class Orologio
{
    private int ore;
    private int minuti;
    private int secondi;
    Orologio()
    {
        this.ore = 0;
        this.minuti = 0;
        this.secondi = 0;
    }
    Orologio(int ore, int minuti, int secondi)
    {
        if(check(ore,minuti,secondi))
        {
            this.ore = ore;
            this.minuti = minuti;
            this.secondi = secondi;

        } else 
        {
            System.out.println("Dati non validi");
        }
    } 
    public boolean check(int ore, int minuti, int secondi)
    {
        if(ore<0 || ore>=24)
        {
            return false;
        }

        if(minuti>=60 || minuti<0)
        {
            return false;
        }

        if(secondi>=60 || minuti<0)
        {
            return false;
        }

        return true;
    }

    public void incOre()
    {
        if(ore==23)
        {
            ore=0;
        } else {
            ore++;
        }
    }
    public void incMinuti()
    {
        if(minuti == 59)
        {
            minuti = 0;
            incOre();
        } else 
        {
            minuti++;
        }
    }
    public void incSecondi()
    {
        if(secondi == 59)
        {
            secondi = 0;
            incMinuti();
        } else 
        {
            secondi++;
        }

    }
    public void stampa()
    {
        System.out.println(ore+":"+minuti+":"+secondi);
    }
}
