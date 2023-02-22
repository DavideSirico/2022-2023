public class MainPersona
{
	public static void main(String[] args)
	{
		Persona p = new Persona("Mario","Rossi","CF001");
		Studente s = new Studente("Luca","Bianchi","CF002","S001","Universita' degli Studi di Milano");
		Docente d = new Docente("Chiara","Verdi","CF003","Matematica",(float)35000.00);
		
		p.stampa();
		s.stampa();
		d.stampa();
	}
}
