class Stagista extends Uomo
{
	private int numeroPresenze;
	private int numeroIdentificativo;
	
	Stagista()
	{
		super();
		numeroPresenze = 0;
		numeroIdentificativo = 0;
	}
	Stagista(String nome, String cognome, String codiceFiscale, char sesso, String citta, int numeroPresenze, int numeroIdentificativo)
	{
		super(nome,cognome,codiceFiscale,sesso,citta);
		this.numeroIdentificativo = numeroIdentificativo;
		this.numeroPresenze = numeroPresenze;
	}
	
	
	
	void setNumeroPresenze(int numeroPresenze)
	{
		this.numeroPresenze = numeroPresenze;
	}
	int getNumeroPresenze()
	{
		return numeroPresenze;
	}
	void setNumeroIdentificativo(int numeroIdentificativo)
	{
		this.numeroIdentificativo = numeroIdentificativo;
	}
	int getNumeroIdentificativo()
	{
		return numeroIdentificativo;
	}
	
	void stampa()
	{
		System.out.println("Stagista [CodiceFiscale=" + super.getCodiceFiscale() + ", Nome=" + super.getNome() + ", Cognome=" + super.getCognome() + ", Sesso=" + super.getSesso() + ", Citta=" + super.getCitta() + ", Numero presenze=" + numeroPresenze + ", Numero identificativo=" + numeroIdentificativo + "]");
	}
	
	
}
