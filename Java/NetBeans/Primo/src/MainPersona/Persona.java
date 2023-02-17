package MainPersona;

class Persona
{
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	Persona()
	{
			nome = "";
			cognome = "";
			codiceFiscale = "";
	}
	Persona(String nome, String cognome, String codiceFiscale)
	{
			this.nome = nome;
			this.cognome = cognome;
			this.codiceFiscale = codiceFiscale;
	}
	
	void setNome(String nome)
	{
		this.nome = nome;
	}
	
	String getNome()
	{
		return nome;
	}
	void setCognome(String cognome)
	{
		this.cognome = cognome;
	}
	
	String getCognome()
	{
		return cognome;
	}
	void setCodiceFiscale(String codiceFiscale)
	{
		this.codiceFiscale = codiceFiscale;
	}
	
	String getCodiceFiscale()
	{
		return codiceFiscale;
	}
	
	void stampa()
	{
		System.out.println("Persona [CodiceFiscale=" + codiceFiscale + ", Nome=" + nome + ", Cognome=" + cognome + "]");
	}
	
}
