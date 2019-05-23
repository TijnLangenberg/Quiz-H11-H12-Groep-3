package src.Hoofdstuk11Quizzen.h11quiz8.sub;

import q8.package_02.Superklasse;

public class Subklasse extends Superklasse{
	
	public static void main(String[] args){
		
	  	Superklasse supK = new Superklasse();
	    Subklasse subK = new Subklasse();
	    System.out.print(supK.str1); /* 1 */
	    //System.out.print(supK.str2); /* 2 */
	    //System.out.print(supK.str3); /* 3 */
	    //System.out.print(supK.str4); /* 4 */
	    System.out.print(subK.str2); /* 5 */
	    System.out.print(subK.mijnInt); /* 6 */
	    //System.out.print(supK.mijnInt); /* 6 */

	} 
}

// Vraag 2: Alleen de subklasse heeft toegang tot de variabele mijnInt
//H11Q8 gemaakt door: Wybren.