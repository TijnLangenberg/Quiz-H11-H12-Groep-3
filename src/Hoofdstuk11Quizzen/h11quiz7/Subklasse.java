public class Subklasse extends Superklasse{
	//H11Q7_deel2 gemaakt door: Wybren.
	Subklasse(String naam){
		super(naam);
		System.out.print(naam);
	}
	
	public static void main(String[] args){
		Subklasse sk = new Subklasse("x");
	}
}