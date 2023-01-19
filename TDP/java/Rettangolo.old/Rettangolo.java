class Rettangolo{
    private int base;
    private int altezza;
    private int area;
    private int perimetro;

    Rettangolo(){
        base = 0;
        altezza = 0;
        area = 0;
        perimetro = 0;
    }
    Rettangolo(int base,int altezza){
        this.base = base;
        this.altezza = altezza;
        area = base * altezza;
        perimetro = (base + altezza) * 2;
    }
    
    private void calcolaArea(){
        area = base * altezza;
    }

    private void calcolaPerimetro(){
        perimetro = (base + altezza) * 2;
    }

    public int getAltezza(){
        return altezza;
    }
    public int getBase(){
        return base;
    }
    public void setAltezza(int altezza){
        this.altezza = altezza;
        calcolaArea();
        calcolaPerimetro();
    }
    public void setBase(int base){
        this.base = base;
        calcolaArea();
        calcolaPerimetro();
    }
    public int getArea(){
        return area;
    }
    public int getPerimetro(){
        return perimetro;
    }
    public boolean equals()
    {
        if(base == base && altezza == altezza)
            return true;
        else
            return false;
    }
}
