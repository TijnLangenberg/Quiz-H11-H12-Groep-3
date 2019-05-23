package src.Hoofdstuk11Quizzen.h11quiz1;
//h11quiz1 gemaakt door: Tijn.
public class Subklasse extends Superklasse
{ 
	private int y = 8;
	
	Subklasse()
	{
		x = 5;
		y ++;
		System.out.print(x + ", " + 7);
	}
	public static void main(String[] args)
	{
		Subklasse sk = new Subklasse(); 
	}
}
//opdracht: ik heb op regel 5 de waarde van y verandert en op regel 9 de waarde van x verandert.
//de uitkomst is nu '5, 7'