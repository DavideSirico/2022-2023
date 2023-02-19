class Uomo{
	protected String cognome;
	protected String nome;
	protected char sesso;
	protected String codiceFiscale;
	protected String citta;
	
	Uomo(){
		cognome = "";
		nome = "";
		sesso = '\0';
		codiceFiscale = "";
		citta = "";
	}
	
	Uomo(String cognome,String nome,char sesso,String codiceFiscale,String citta){
		this.cognome = cognome;
		this.nome = nome;
		this.sesso = sesso;
		this.codiceFiscale = codiceFiscale;
		this.citta = citta;
	}
	
	String annoNascita(){
		String anno = "";
		anno+=codiceFiscale.charAt(6);
		anno+=codiceFiscale.charAt(7);
		return anno;
	}
	
	void Stampa(){
		System.out.println("Uomo");
		System.out.println("cognome = "+cognome);
		System.out.println("nome = "+nome);
		System.out.println("sesso = "+sesso);
		System.out.println("codice fiscale = "+codiceFiscale);
		System.out.println("citta = "+citta);
	}
	
	void setCognome(String cognome){
		this.cognome = cognome;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	void setSesso(char sesso){
		this.sesso = sesso;
	}
	
	void setCodiceFiscale(String codiceFiscale){
		this.codiceFiscale = codiceFiscale;
	}
	
	void setCitta(String citta){
		this.citta = citta;
	}
	
	String getCognome(){
		return cognome;
	}
	
	String getNome(){
		return nome;
	}
	
	char getSesso(){
		return sesso;
	}
	
	String getCodiceFiscale(){
		return codiceFiscale;
	}
	
	String getCitta(){
		return citta;
	}
	
}
