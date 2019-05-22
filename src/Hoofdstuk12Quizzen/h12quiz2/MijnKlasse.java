package src.Hoofdstuk12Quizzen.h12quiz2;
//h12quiz2 gemaakt door: Tijn.
public class MijnKlasse extends Superklasse
{
	int z = 5;
	
	void mijnMethode(int x)
	{
		System.out.print("X");
	}
	public static void main (String[] args)
	{
		MijnKlasse mk = new MijnKlasse();
	}
	//opdracht
	void methodeB(int x)
	{
		System.out.print("X");
		return;
	}
}