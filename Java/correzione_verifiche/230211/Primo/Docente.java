class Docente extends Persona
{
	private String materia;
	private float salario;
	
	Docente()
	{
		super();
		salario = 0;
		materia = "";
	}
	Docente(String nome, String cognome, String codiceFiscale, String materia, float salario)
	{
		super(nome,cognome,codiceFiscale);
		this.materia = materia;
		this.salario = salario;
	}
	
	void setSalario(float salario)
	{
		this.salario = salario;
	}
	
	float getSalario()
	{
		return salario;
	}
	void setMateria(String materia)
	{
		this.materia = materia;
	}
	
	String getMateria()
	{
		return materia;
	}
	
	@Override
	void stampa()
	{
		System.out.println("Docente [CodiceFiscale=" + super.getCodiceFiscale() + ", Nome=" + super.getNome() + ", Cognome=" + super.getCognome() + ", materia=" + materia + ", salario=" + salario + "]");
	}
	
}
