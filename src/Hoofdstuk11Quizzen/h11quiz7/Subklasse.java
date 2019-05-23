package src.Hoofdstuk11Quizzen.h11quiz7;

import q7.Superklasse;

public class Subklasse extends Superklasse{
	//H11Q7 gemaakt door: Wybren.
	Subklasse(String naam){
		super(naam);
		System.out.print(naam);
	}
	
	public static void main(String[] args){
		Subklasse sk = new Subklasse("x");
	}
}

// Vraag 1&2: Als je super(naam) vervangt met super("s") vervangt word er sdsx naar de console geschreven.