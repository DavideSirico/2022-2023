public class Rettangolo{
	private int base;
	private int altezza;
	
	Rettangolo()
	{
		base = 1;
		altezza = 1;
	}
	Rettangolo(int base, int altezza)
	{
		this.base = base;
		this.altezza = altezza;
	}
	
	public int getArea()
	{
		return base*altezza;
	}
	public int getPerimetro()
	{
		return (base+altezza)*2;
	}
	public void setAltezza(int altezza)
	{
		this.altezza = altezza;
	}
	public void setBase(int base)
	{
		this.base = base;
	}
}

