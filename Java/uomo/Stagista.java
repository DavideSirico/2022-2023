class Stagista extends Uomo{
	private int numeroPresenze;
	private int numeroIdentificativo;
	
	Stagista(String cognome,String nome,char sesso,String codiceFiscale,String citta,int numeroPresenze,int numeroIdentificativo){
		this.cognome = cognome;
		this.nome = nome;
		this.sesso = sesso;
		this.codiceFiscale = codiceFiscale;
		this.citta = citta;
		this.numeroPresenze = numeroPresenze;
		this.numeroIdentificativo = numeroIdentificativo;
	}
	
	@Override
	void Stampa(){
		System.out.println("Stagista");
		System.out.println("cognome = "+cognome);
		System.out.println("nome = "+nome);
		System.out.println("sesso = "+sesso);
		System.out.println("codice fiscale = "+codiceFiscale);
				System.out.println("citta = "+citta);
		System.out.println("presenze = "+numeroPresenze);
		System.out.println("id = "+numeroIdentificativo);
		System.out.println("\n");
	}
	
	void setPresenze(int numeroPresenze){
		this.numeroPresenze = numeroPresenze;
	}
	
	void setId(int numeroIdentificativo){
		this.numeroIdentificativo = numeroIdentificativo;
	}
	
	int getPresenze(){
		return numeroPresenze;
	}
	
	int getId(){
		return numeroIdentificativo;
	}
}
