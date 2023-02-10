//Classe Rettangolo
public class Rettangolo {
    private double base;
    private double altezza;
    
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltezza() {
        return altezza;
    }
    
    public double calcolaArea() {
        return base * altezza;
    }
}

//Classe Parallelepipedo
public class Parallelepipedo extends Rettangolo {
    private double profondita;
    
    public Parallelepipedo(double base, double altezza, double profondita) {
        super(base, altezza);
        this.profondita = profondita;
    }
    
    public double getProfondita() {
        return profondita;
    }
    
    public double calcolaVolume() {
        return super.calcolaArea() * profondita;
    }
}