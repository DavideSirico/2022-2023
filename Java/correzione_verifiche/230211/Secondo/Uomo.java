class Uomo
{
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private char sesso;
	private String citta;
	
	Uomo()
	{
			nome = "";
			cognome = "";
			sesso = '\0';
			codiceFiscale = "";
			citta = "";
	}
	Uomo(String nome, String cognome, String codiceFiscale, char sesso, String citta)
	{
			this.nome = nome;
			this.cognome = cognome;
			if(validateCodiceFiscale(codiceFiscale))
			{
				this.codiceFiscale = codiceFiscale;
			} else 
			{
				System.out.println("codice fiscale non valido");
			}
			this.sesso = sesso;
			this.citta = citta;
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
	
	static boolean validateCodiceFiscale(String codiceFiscale)
	{
		int[] numbers = new int[10];
		for(int i = 0; i < 10; i++)
		{
			numbers[i] = i;
		}
		if(codiceFiscale.length()!=16)
		{
			return false;
		}
		int c = 0;
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if((int)codiceFiscale.charAt(i)-(int)'0'==numbers[j])
				{
					c++;
				}
			}
			if(c != 0)
			{
				return false;
			}
		}
		c = 0;
		// controllo il mese
		for(int i = 0; i < 10; i++)
		{
			if((int)codiceFiscale.charAt(8)-(int)'0'==numbers[i])
			{
				c++;
			}
		}
		if(c != 0)
		{
			return false;
		}
		c = 0;
		
		// controllo gli anni
		for(int i = 6; i < 8; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if((int)codiceFiscale.charAt(i)-(int)'0'==numbers[j])
				{
					c++;
					break;
				}
			}
			if(c != 1)
			{
				return false;
			}
			c = 0;
		}
		
		// controllo i giorni
		c = 0;
		for(int i = 9; i < 11; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if((int)codiceFiscale.charAt(i)-(int)'0'==numbers[j])
				{
					c++;
					break;
				}
			}
			if(c != 1)
			{
				return false;
			}
			c = 0;
		}
		// controllo i gli ultimi 3 numeri
		c = 0;
		for(int i = 12; i < 15; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if((int)codiceFiscale.charAt(i)-(int)'0'==numbers[j])
				{
					c++;
					break;
				}
			}
			if(c != 1)
			{
				return false;
			}
			c = 0;
		}
		c = 0;
		// controllo la lettera prima dei numeri
		for(int i = 0; i < 10; i++)
		{
			if((int)codiceFiscale.charAt(11)-(int)'0'==numbers[i])
			{
				c++;
			}
		}
		if(c != 0)
		{
			return false;
		}
		c = 0;
		// controllo l'ultima lettera
		for(int i = 0; i < 10; i++)
		{
			if((int)codiceFiscale.charAt(15)-(int)'0'==numbers[i])
			{
				c++;
			}
		}
		if(c != 0)
		{
			return false;
		}
		return true;
	}
	
	int annoNascita()
	{
		int anno = ((int)codiceFiscale.charAt(6))-(int)'0';
		anno *= 10;
		anno += ((int)codiceFiscale.charAt(7))-(int)'0';
		return anno;
	}
	
	String getCodiceFiscale()
	{
		return codiceFiscale;
	}
	void setSesso(char sesso)
	{
		this.sesso = sesso;
	}
	char getSesso()
	{
		return sesso;
	}
	void setCitta(String citta)
	{
		this.citta = citta;
	}
	String getCitta()
	{
		return citta;
	}
	
	
	
	void stampa()
	{
		System.out.println("Persona [CodiceFiscale=" + codiceFiscale + ", Nome=" + nome + ", Cognome=" + cognome + "]");
	}
	
}
