package src.Hoofdstuk11Quizzen.h11quiz6;

public class Subklasse extends Superklasse {
//h11quiz6 gemaakt door: Fahd.

  void mijnMethode()
  {
    x++;
    System.out.print(e);
    super.mijnMethode();
    x += 2;
    System.out.print(x);
  }
  public static void main(String[] args)
  {
    Subklasse sk = new Subklasse();
    sk.mijnMethode();
  }
}