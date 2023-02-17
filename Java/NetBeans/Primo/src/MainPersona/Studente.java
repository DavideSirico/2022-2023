package MainPersona;

class Studente extends Persona
{
	private String matricola;
	private String universita;
	
	Studente()
	{
		super();
		matricola = "";
		universita = "";
	}
	Studente(String nome, String cognome, String codiceFiscale, String matricola, String universita)
	{
		super(nome,cognome,codiceFiscale);
		this.matricola = matricola;
		this.universita = universita;
	}
	
	void setMatricola(String matricola)
	{
		this.matricola = matricola;
	}
	
	String getMatricola()
	{
		return matricola;
	}
	void setUniversita(String universita)
	{
		this.universita = universita;
	}
	
	String getUniversita()
	{
		return universita;
	}
	
	@Override
	void stampa()
	{
		System.out.println("Studente [CodiceFiscale=" + super.getCodiceFiscale() + ", Nome=" + super.getNome() + ", Cognome=" + super.getCognome() + ", matricola=" + matricola + ", universita'=" + universita + "]");
	}
	
}
