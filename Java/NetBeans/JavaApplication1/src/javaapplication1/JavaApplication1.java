package javaapplication1;

public class JavaApplication1
{
    public static void main(String[] args)
    {
        Rettangolo r = new Rettangolo(10,20); 
        System.out.println("Hello World!");
    }
}

class Rettangolo
{
    private int base;
    private int altezza;
    Rettangolo(int base, int altezza)
    {
        this.base = base;
        this.altezza = altezza;
    }
    int perimetro()
    {
        return (base + altezza) * 2;
    }
}
