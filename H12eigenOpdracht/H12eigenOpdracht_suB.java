package H12eigenOpdracht;

//H12eigenOpdracht gemaakt door: Wybren.
public class H12eigenOpdracht_suB extends H12eigenOpdracht_suP
{
	int z = 5;
	
	void mijnMethode(int x)
	{
		System.out.print("X");
	}
	public static void main (String[] args)
	{
		H12eigenOpdracht_suB mk = new H12eigenOpdracht_suB();
	}
}

/*
 
  Kun je de volgende methode zonder errors toevoegen?:
 
  	int methodeB(int x)
	{
		System.out.print("X");
		return;
	}
   
  Antwoord:
  Nee, tenzij je de eerste "int" in een void veranderd.
 */
 