package src.Hoofdstuk12Quizzen.h12quiz4;
//h12quiz4 gemaakt door: Tijn.
public final class MijnKlasse extends Superklasse
{
	void methodeA(int x, int y)
	{
		int z = x - y;
		System.out.print(z);
	}
	public static void main(String[] args)
	{
		MijnKlasse mk = new MijnKlasse();
		mk.methodeA(5,3.0);
		//opdracht
		//mk.methodeA(6, 4);
	}
}
//opdracht: de uitkomst gaat van '15.0'naar '2'
//omdat de 6 en de 4 een int is word het 6-4.