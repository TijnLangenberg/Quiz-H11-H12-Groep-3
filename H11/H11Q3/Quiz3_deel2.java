package H11Q3;

class Quiz3_deel2 extends Quiz3_deel1{
	char c2 = 'A';
	
	Quiz3_deel2(){
		this('N');
		System.out.print(c2);
	}
	
	Quiz3_deel2(char c) {
		System.out.print(c);
	}
	
	void mijnMethode() { 
		super.mijnMethode();
		System.out.print(c2);
	}
	
	public static void main(String[] args) {
		Quiz3_deel2 subK = new Quiz3_deel2();
		subK.mijnMethode();
	}
}